package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Book;

public interface BookDao {
	
	long save(Book book);
	   Book get(long id);
	   List<Book> list();
	   void update(long id, Book book);
	   void delete(long id);

}
