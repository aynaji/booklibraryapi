package com.ammarnaji.booklibraryapi.model;


import java.util.List;

public class BookLibraryDTO {

    private List<Books> books;

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookLibraryDTO{" +
                "books=" + books +
                '}';
    }
}
