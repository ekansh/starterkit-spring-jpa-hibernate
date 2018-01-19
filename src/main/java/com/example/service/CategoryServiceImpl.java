package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.dao.CategoryDao;
import com.example.entity.Category;

/**
 * @author ekansh
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;


	@Transactional(readOnly = true)
	@Override
	public Category find(Long categoryid) {
		Category find = categoryDao.find(categoryid);
		return find;
	}


}
