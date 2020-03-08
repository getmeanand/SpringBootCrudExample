package com.example.crud.CrudExample.dao;

import java.util.List;
import java.util.Optional;

import com.example.crud.CrudExample.entity.Book;

public interface BookDao {

	long save(Book book);

	
	  Optional<Book> get(int id);
	  
	  List<Book> list();
	   
	  void update(int id, Book bookDTO);
	  
	  void delete(int id);
	 
}
