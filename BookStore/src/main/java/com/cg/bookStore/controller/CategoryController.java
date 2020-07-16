package com.cg.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.BookInformation;
import com.cg.bookStore.service.CategoryServiceImpl;

@RestController
public class CategoryController {

	@Autowired
	private CategoryServiceImpl categoryService;
	
	@DeleteMapping(value = "/deleteCategory",consumes = {"application/json"})
	public String deleteCategory(@RequestBody BookCategory category) {
		return categoryService.deleteCategory(category);
	}
	
	@PostMapping(value = "/createCategory",consumes = {"application/json"})
	public String createCategory(@RequestBody BookCategory category) {
		return categoryService.createCategory(category);
	}

	@PostMapping(value = "/addBook",consumes = {"application/json"})
	public String addBook(@RequestBody BookInformation book) {
		return categoryService.addBook(book);
	}
	@DeleteMapping(value = "/deleteBook",consumes = {"application/json"})
	public String deleteBook(@RequestBody BookInformation book) {
		return categoryService.deleteBook(book);
	}
}
