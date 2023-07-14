package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.ReviewDTO;
import com.itbank.repository.ReviewDAO;

@Service
public class ReviewService {
	@Autowired private ReviewDAO dao;
	File dir = new File("C:\\upload");
	
	public ReviewService() {
		if(dir.exists() == false) {
			dir.mkdir();
		}
	}
	
	public List<ReviewDTO> selectAll() {
		List<ReviewDTO> list = dao.selectAll();
		
		list.forEach(review -> {
			String title = review.getTitle();
			
			if(title.length() > 25) {
				review.setTitle(title.substring(0, 25) + "...");
			}
		});
		
		return list;
	}
	
	@Transactional
	public int insert(ReviewDTO dto) {
		int row = 0;
		List<MultipartFile> fileList = dto.getUpload();
		List<String> fileNameList = new ArrayList<String>();
		
		row += dao.insertReview(dto);
		if(!(fileList.get(0).getSize() == 0)) {
			fileList.forEach(file -> {
				String ymd = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String fileName = file.getOriginalFilename();
				fileName = fileName.substring(0, fileName.lastIndexOf("."));
				String ext = file.getContentType().substring(file.getContentType().indexOf("/") + 1);
				File dest = new File(dir, ymd + "_" + fileName + "." + ext);
				
				try {
					file.transferTo(dest);
					fileNameList.add(dest.getName());
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			});
			int review = dao.selectMaxIdx();
			HashMap<String, Object> param = new HashMap<>();
			
			param.put("review", review);
			param.put("filePath", fileNameList);
			
			row += dao.uploadFile(param);
		}
		
		return row;
	}

	@Transactional
	public ReviewDTO selectOne(int idx) {
		ReviewDTO dto = dao.selectOneReview(idx);
		
		dto.setFilePath(dao.selectFile(idx));
		
		return dto;
	}

}
