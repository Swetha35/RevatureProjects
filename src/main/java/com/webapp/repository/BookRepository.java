package com.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByOrderByPriceDesc();

	List<Book> findByOrderByPriceAsc();

	List<Book> findByOrderByReleasedDateDesc();

}