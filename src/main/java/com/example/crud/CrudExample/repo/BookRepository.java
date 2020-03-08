package com.example.crud.CrudExample.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.CrudExample.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {

}
