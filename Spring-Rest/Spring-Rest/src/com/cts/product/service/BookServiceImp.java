package com.cts.product.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cts.product.dao.BookDao;
import com.cts.product.entity.Book;
@Service("bookService")
public class BookServiceImp implements BookService{

	
	   @Autowired
	   private BookDao bookDao;

	   @Transactional
	   @Override
	   public long save(Book book) {
	      return bookDao.save(book);
	   }

	   @Transactional
	   @Override
	   public Book get(long id) {
	      return bookDao.get(id);
	   }

	   @Transactional
	   @Override
	   public List<Book> list() {
	      return bookDao.list();
	   }

	   @Transactional
	   @Override
	   public void update(long id, Book book) {
	      bookDao.update(id, book);
	   }

	   @Transactional
	   @Override
	   public void delete(long id) {
	      bookDao.delete(id);
	   }

}
