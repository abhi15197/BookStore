package com.cg.bookStore.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookStore.DAO.CategoryDao;
import com.cg.bookStore.DAO.BookDao;
import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.BookInformation;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private CategoryDao categoryDao;
	private BookDao bookDao;
	public String deleteCategory(BookCategory category) {
		
		try {
		if(category.getBook()==null)
		{
			categoryDao.delete(category);
			return "Category Deleted";
		}
		else 
			return "Cannot Delete as Books are Present in the category";
		}
		catch(Exception e)
		{
			return "Exception Caused";
		}
	}
	public String createCategory(BookCategory category) {
		
		categoryDao.save(category);
		return "created";
	}
	public String addBook(BookInformation book) {
		
		bookDao.save(book);
		return "Added";
	}
	public String deleteBook(BookInformation book) {
		bookDao.delete(book);
		return "deleted";
	}
}
