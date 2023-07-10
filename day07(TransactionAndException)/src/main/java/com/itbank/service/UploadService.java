package com.itbank.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.UploadDTO;
import com.itbank.repository.UploadDAO;

@Service
public class UploadService {
	@Autowired private UploadDAO dao;
	private File dir = new File("D:\\test0706");
	// 파일을 전달받으면 새로운 이름을 문자열로 변환하는 함수
	private String generateNewFileName(MultipartFile file) {
		String fileName = UUID.randomUUID().toString().replace("-", "");
		String contentType = file.getContentType();
		
		fileName += "." + contentType.substring(contentType.indexOf("/") + 1);
		
		return fileName;
	}
	
	public UploadService() {
		if(dir.exists() == false) {
			dir.mkdir();
		}
	}

	// 해당 어노테이션이 명시된 메서드 내부에서의 dao함수는 하나의 트랜잭션으로 묶인다
	// 트랜잭션 내부 작업 중 하나라도 예외가 발생하면 이전 작업을 모두 rollback 처리한다
	@Transactional
	public int insert(UploadDTO dto) {
		// 1) 파일이름 규칙 : UUID + contentType
		// 2) 업로드 위치 : D:\\test0706
		int row = 0;
		List<MultipartFile> uploadList = dto.getUpload();	// 첨부파일 목록(예: 파일 2개)
		ArrayList<String> fileNameList = new ArrayList<>();	// 비어있는 문자열 리스트(0)
		
		if(!uploadList.get(0).getOriginalFilename().equals("")) {
			for(MultipartFile file : uploadList) {				// 예: 2회반복
//				File dest = new File(dir, generateNewFileName(file));
				File dest = new File(dir, file.getOriginalFilename());
				
				fileNameList.add(dest.getName());				// 예: size = 0 -> 1 -> 2
				try {
					file.transferTo(dest);
				} catch (Exception e) {}
			}
		}
//		dto.setFilePath(fileNameList);						// 길이 2짜리 리스트를 dto에 set
		
		row += dao.insertUpload(dto);
		
		int fk = dao.selectMaxIdxFromUpload();
		
		HashMap<String, Object> param = new HashMap<>();
		param.put("upload", fk);	// 마지막 넣은 글의 idx를 추가한다
		param.put("list", fileNameList);
		
		row += dao.insertFile(param);
		
		return row;
	}

	public List<UploadDTO> selectAll() {
		return dao.selectAll();
	}

	public int delete(int idx) {
		int row = 0;
		List<String> fileList = dao.selectFileList(idx);
		
		fileList.forEach(fileName -> {
			File file = new File(dir, fileName);	// 저장된 위치에 지정한 이름의 파일
			
			if(file.exists()) {						// 파일이 있으면
				file.delete();						// 파일을 삭제
			}
		});
		row += dao.deleteFile(idx);					// DB에서 파일이름을 먼저 삭제하고(자식테이블)
		row += dao.delete(idx);						// 참조하는 자식 테이블 레코드가 없으면 부모 테이블 삭제
													// (on delete cascade)
		return row;
	}
}
