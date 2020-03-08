package com.example.crud.CrudExample.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.crud.CrudExample.entity.Book;
import com.example.crud.CrudExample.repo.BookRepository;

@Repository
public class BookDaoImp implements BookDao {

	@Autowired
	private BookRepository bookRepository;

	Session session = null;

	@Override
	public long save(Book book) {
		Book newBook = bookRepository.save(book);
		System.out.println("test is created With Id::" + newBook.getId());
		return newBook.getId();
	}

	@Override
	public Optional<Book> get(int id) {

		return bookRepository.findById(id);
	}

	@Override
	public List<Book> list() {
		return bookRepository.findAll();
	}

	@Override
	public void delete(int id) {
		bookRepository.deleteById(id);
	}

	@Override
	public void update(int id, Book bookDto) {
		Optional<Book> oldBook = get(id);
		Book book = oldBook.get();
		book.setAuthor(bookDto.getAuthor());
		book.setTitle(bookDto.getTitle());
		bookRepository.flush();
		
	}

}
