package com.example.BookStores.Controller;

import com.example.BookStores.Entity.BookEntity;
import com.example.BookStores.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<BookEntity> create(@RequestBody BookEntity bookEntity)
    {
        return ResponseEntity.ok().body(this.bookService.create(bookEntity));
    }

    @GetMapping("/read")
    public List<BookEntity> getData()
    {
        return bookService.getAllBooks();
    }

    @PutMapping("/update/{courseId}")
    public BookEntity updateCourse(@PathVariable("courseId")Long id, @RequestBody BookEntity bookEntity)
    {
        return this.bookService.updateBook(id,bookEntity);
    }

    @DeleteMapping("/delete/{bookId}")
    public ResponseEntity<String> deleteCourse(@PathVariable("bookId")Long id)
    {
        return ResponseEntity.ok().body(this.bookService.deleteBook(id));
    }
}
