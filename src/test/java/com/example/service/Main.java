package com.example.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.entity.Category;

public class Main {
	static CategoryService categoryService;
	static {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		categoryService = app.getBean(CategoryService.class);
	}

	public static void main(String[] args) {
		System.out.println("--");
	}
	

	

}
