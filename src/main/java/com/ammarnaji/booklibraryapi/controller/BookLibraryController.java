package com.ammarnaji.booklibraryapi.controller;


import com.ammarnaji.booklibraryapi.model.Books;
import com.ammarnaji.booklibraryapi.service.BookLibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookLibraryController {

    final
    BookLibraryService bookLibraryService;

    public BookLibraryController(BookLibraryService bookLibraryService) {
        this.bookLibraryService = bookLibraryService;
    }

    @GetMapping("/")
    public List<Books> findAllBooks() {
        return bookLibraryService.findAllBooks();
    }

    @GetMapping("/{id}")
    public Books findBookById(@PathVariable int id) {
        return bookLibraryService.findBookById(id);
    }

    @PostMapping("/add")
    public String addBook(@RequestBody Books books) {
        bookLibraryService.addBook(books);
        return "Book was added";
    }


    @PutMapping("/update")
    public String updateBook(@RequestBody Books books) {
        bookLibraryService.updateBook(books);
        return "Book is updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookLibraryService.deleteBooks(id);
        return "Book is deleted";
    }


}
