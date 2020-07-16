package com.cg.bookStore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookStore.entities.BookInformation;

public interface BookDao extends JpaRepository<BookInformation, Integer>{

}
