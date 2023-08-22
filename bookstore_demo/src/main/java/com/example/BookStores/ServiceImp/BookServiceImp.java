package com.example.BookStores.ServiceImp;

import com.example.BookStores.Entity.BookEntity;
import com.example.BookStores.Repository.BookRepository;
import com.example.BookStores.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImp implements BookService {
    @Autowired
    BookRepository bookRepository;

    public BookEntity create(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);

    }

    @Autowired
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }


    public BookEntity updateBook(Long id, BookEntity courceEntity) {
        Optional<BookEntity> curs = bookRepository.findById(id);
        if (curs.isPresent())
            return bookRepository.save(courceEntity);
        else
            return null;

    }

    public String deleteBook(Long id) {
        bookRepository.deleteById(id);
        return "No Contain of employee table";
    }
}
