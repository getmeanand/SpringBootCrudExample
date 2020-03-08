package com.example.crud.CrudExample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.crud.CrudExample.dao.BookDao;
import com.example.crud.CrudExample.entity.Book;

@Service
@Transactional(readOnly = true)
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao bookDao;

	@Transactional
	public long save(Book book) {
		return bookDao.save(book);
	}

	@Override
	public Optional<Book> get(int id) {
		return bookDao.get(id);
	}

	@Override
	public List<Book> list() {
		return bookDao.list();
	}

	@Transactional
	@Override
	public void update(int id, Book bookDto) {
		bookDao.update(id, bookDto);
	}

	@Transactional
	@Override
	public void delete(int id) {
		bookDao.delete(id);
	}

}
