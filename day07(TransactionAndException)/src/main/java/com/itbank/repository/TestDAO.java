package com.itbank.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TestDAO {
	public String selectVersion();
}
