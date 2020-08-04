package com.ammarnaji.booklibraryapi.service;

import com.ammarnaji.booklibraryapi.dao.BooksRepository;
import com.ammarnaji.booklibraryapi.dao.UsersRepository;
import com.ammarnaji.booklibraryapi.model.Books;
import com.ammarnaji.booklibraryapi.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookLibraryService {

    final
    BooksRepository booksRepository;
    final
    UsersRepository usersRepository;

    public BookLibraryService(BooksRepository booksRepository, UsersRepository usersRepository) {
        this.booksRepository = booksRepository;
        this.usersRepository = usersRepository;
    }

    public List<Books> findAllBooks() {
        return booksRepository.findAll();
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    public Books findBookById(int id) {
        return booksRepository.findAllById(id);
    }

    public void addBook(Books books) {
        booksRepository.save(books);
    }

    public void updateBook(Books books) {
        booksRepository.save(books);
    }

    public void deleteBooks(int id) {
        booksRepository.deleteById(id);
    }
}
