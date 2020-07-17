package com.cg.bookStore.DAO;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cg.bookStore.entities.BookCategory;

public class CategoryDaoImpl {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public String deleteCategory(BookCategory category) {
		try {
		Query query=entityManager.createQuery("Select b from BookCategory b");
		@SuppressWarnings("unchecked")
		List<BookCategory>	list=query.getResultList();
		String categoryName=category.getCategoryName();
		Optional<BookCategory> newCategory=list.stream().
				filter(f->f.getCategoryName().equalsIgnoreCase(categoryName)).findFirst();
		BookCategory newBookCategory=newCategory.get();
			if(newBookCategory.getBook().isEmpty())	{
		entityManager.remove(newBookCategory);
		return "Category Deleted";
			}
			else
				return "Category Contains Book";
		}
		catch(Exception e)
		{
			return e.getMessage()+"Not Deleted";
		}
	}

}
