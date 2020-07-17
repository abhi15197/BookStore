package com.cg.bookStore.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookStore.DAO.CategoryDao;
import com.cg.bookStore.DAO.CategoryDaoImpl;
import com.cg.bookStore.DAO.BookDao;
import com.cg.bookStore.DAO.BookDaoImpl;
import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.BookInformation;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {

//	@Autowired
//	private CategoryDao categoryDao;
//	private BookDao bookDao;
	
	@Autowired
	private CategoryDaoImpl categoryDaoImpl;
	private BookDaoImpl bookDaoImpl;
	
	public String deleteCategory(BookCategory category) {
	
		
	
		return categoryDaoImpl.deleteCategory(category);
	
	}
	
	
	
	
	
	
	
	
	
//	public String deleteCategory(BookCategory category) {
//		
//		try {
//			String categoryName=category.getCategoryName();
//			Optional<BookCategory> newCategory=categoryDao.findAll().stream().
//					filter(f->f.getCategoryName().equalsIgnoreCase(categoryName)).findFirst();
//			BookCategory bookCategory=newCategory.get();
//		if(bookCategory.getBook().isEmpty())
//		{
////			categoryDao.delete(bookCategory);
////			return "Category Deleted";
//			
//			return categoryDaoImpl.deleteCategory(bookCategory);
//			
//		}
//		else 
//			return "Cannot Delete as Books are Present in the category";
//		}
//		catch(Exception e)
//		{
//			return "Exception Caused";
//		}
//	}
	
//	public String createCategory(BookCategory category) {
//		categoryDao.save(category);
//		return "created";
//	}
//	public String addBook(BookInformation book) {
//		bookDao.save(book);
//		return "Added";
//	}
//	public String deleteBook(BookInformation book) {
//		bookDao.delete(book);
//		return "deleted";
//	}
//	public BookCategory getCategory(int id) {
//		
//		return categoryDao.getOne(id);
//	}
}
