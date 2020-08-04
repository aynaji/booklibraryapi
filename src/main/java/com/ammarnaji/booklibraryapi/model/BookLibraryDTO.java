package com.ammarnaji.booklibraryapi.model;


import java.util.Arrays;

public class BookLibraryDTO {

    private Books[] books;

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookLibraryDTO{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
