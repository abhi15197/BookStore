package com.cg.bookStore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookStore.entities.BookCategory;

public interface CategoryDao extends JpaRepository<BookCategory, Integer>{

}
