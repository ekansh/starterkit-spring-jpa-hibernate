package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.config.AppConfig;
import com.example.entity.Category;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class CategoryServiceTest extends TestCase {
	@Autowired
	CategoryService categoryService;
	@PersistenceContext
	private EntityManager em;

	public CategoryServiceTest() {
	}



	/**
	 * CAT-1
	 */
	@Test
	public void testFindCategoryBasedOnID() {
		Category rootAChild1 = categoryService.find(1L);
	}


}