package com.ammarnaji.booklibraryapi.controller;


import com.ammarnaji.booklibraryapi.model.BookLibraryDTO;
import com.ammarnaji.booklibraryapi.model.Books;
import com.ammarnaji.booklibraryapi.service.BookLibraryService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BookLibraryController {

    final
    BookLibraryService bookLibraryService;

    public BookLibraryController(BookLibraryService bookLibraryService) {
        this.bookLibraryService = bookLibraryService;
    }

    @GetMapping("/")
    @Cacheable("bookLibraryDTO")
    public BookLibraryDTO findAllBooks() {
        BookLibraryDTO bookLibraryDTO = new BookLibraryDTO();
        bookLibraryDTO.setBooks(bookLibraryService.findAllBooks());
        return bookLibraryDTO;
    }

    @Cacheable("books")
    @GetMapping("/{id}")
    public Books findBookById(@PathVariable int id) {
        Books books = bookLibraryService.findBookById(id);
        return books;
    }

    @PostMapping("/add")
    public String addBook(@Valid @RequestBody Books books) {
        bookLibraryService.addBook(books);
        return "Book is added";
    }


    @PutMapping("/update")
    public String updateBook(@Valid @RequestBody Books books) {
        bookLibraryService.updateBook(books);
        return "Book is updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookLibraryService.deleteBooks(id);
        return "Book is deleted";
    }


}
