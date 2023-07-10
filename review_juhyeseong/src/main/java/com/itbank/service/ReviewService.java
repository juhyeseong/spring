package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.apache.commons.fileupload.UploadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ReviewDTO;
import com.itbank.repository.ReviewDAO;

@Service
public class ReviewService {
	@Autowired private ReviewDAO dao;
	File dir = new File("D://review");
	
	public ReviewService() {
		if(!dir.exists()) {
			dir.mkdir();
		}
	}

	public int insert(ReviewDTO dto) {
		int row = 0;
		
		row = dao.insert(dto);
		if(dto.getUpload() != null) {
			dto.getUpload().forEach(file -> {
				String ext = file.getContentType().substring(file.getContentType().indexOf("/") + 1);
				String fileName = UUID.randomUUID().toString().replace("-", "");
				File dest = new File(dir, fileName + "." + ext);

				try {
					file.transferTo(dest);
					dto.getFilePath().add(dest.getName());
					
				} catch(IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			});
			int review = dao.selectMaxIdx();
			HashMap<String, Object> param = new HashMap<>();
			
			param.put("review", review);
			param.put("filePath", dto.getFilePath());
			
			row += dao.uploadFile(param);
		}
		
		return row;
	}

	public List<ReviewDTO> selectAll() {
		List<ReviewDTO> list = dao.selectAll();
		
		list.forEach(dto -> {
			String name = dto.getName();
			
			if(name.length() > 25) {
				dto.setName(name.substring(0, 25) + "...");
			}
		});
		
		return list;
	}

	public ReviewDTO selectOne(int idx) {
		return dao.selectOne(idx);
	}

	public List<String> selectFiles(int idx) {
		return dao.selectFiles(idx);
	}

	public int update(ReviewDTO dto) {
		int row = 0;
		
		row += dao.update(dto);
		if(dto.getDeleteFile() != null) {
			int index = 0;
			for(String filePath : dto.getDelete()) {
				if(index == 0) {
					filePath = filePath.substring(1, filePath.length());
				}
				if(index == dto.getDelete().size() - 1) {
					filePath = filePath.substring(0, filePath.length() - 1);
				}
				File dest = new File(dir, filePath);
				
				if(dest.exists() && dest.isFile()) {
					dest.delete();
				}
				System.out.println("삭제할 파일 : " + filePath);
				index++;
			};
			row = dao.deleteFile(dto.getIdx());
		}
		if(!dto.getUpload().get(0).getOriginalFilename().equals("")) {
			dto.getUpload().forEach(file -> {
				String ext = file.getContentType().substring(file.getContentType().indexOf("/") + 1);
				String fileName = UUID.randomUUID().toString().replace("-", "");
				File dest = new File(dir, fileName + "." + ext);

				try {
					file.transferTo(dest);
					dto.getFilePath().add(dest.getName());
					
				} catch(IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			});
			
			HashMap<String, Object> param = new HashMap<>();
			
			param.put("review", dto.getIdx());
			param.put("filePath", dto.getFilePath());
			
			row += dao.uploadFile(param);
		}
		
		return row;
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public List<ReviewDTO> searchList(String search) {
		List<ReviewDTO> list = dao.select(search);
		
		list.forEach(dto -> {
			String name = dto.getName();
			
			if(name.length() > 25) {
				dto.setName(name.substring(0, 25) + "...");
			}
		});
		
		return list;
	}
}
