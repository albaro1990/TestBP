package com.bp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bp.test.dao.impl.GenericDaoImpl;


@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = GenericDaoImpl.class)
public class TestBPApplication{

	
	
	public static void main(String[] args) {
		SpringApplication.run(TestBPApplication.class, args);
	}



}
