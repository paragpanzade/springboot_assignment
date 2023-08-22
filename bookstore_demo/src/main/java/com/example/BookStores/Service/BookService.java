package com.example.BookStores.Service;

import com.example.BookStores.Entity.BookEntity;

import java.util.List;

public interface BookService {

    public BookEntity create(BookEntity bookEntity);
    public List<BookEntity> getAllBooks();
    String deleteBook(Long id);
    BookEntity updateBook(Long id,BookEntity bookEntity);
}