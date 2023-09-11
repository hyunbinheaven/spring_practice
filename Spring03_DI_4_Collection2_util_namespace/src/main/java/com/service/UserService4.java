package com.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.dto.Cat;

public class UserService4 {

	Properties phones;

	public Properties getPhones() {
		return phones;
	}

	// setter 메서드 의존성 주입
	public void setPhones(Properties phones) {
		this.phones = phones;
	}

	
	
}
