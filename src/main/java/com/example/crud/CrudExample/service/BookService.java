package com.example.crud.CrudExample.service;

import java.util.List;
import java.util.Optional;

import com.example.crud.CrudExample.entity.Book;

public interface BookService {

	long save(Book book);

	Optional<Book> get(int id);

	List<Book> list();

	void update(int id, Book bookDto);

	void delete(int id);

}
