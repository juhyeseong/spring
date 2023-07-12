package com.itbank.repository;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository
public interface TestDAO {

	Date getSysdate();

}
