package com.ammarnaji.booklibraryapi.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Book Name is mandatory")
    @Column(name = "bookname")
    private String bookName;

    @NotBlank(message = "Release date is mandatory")
    @Column(name = "releasedateyear")
    private String releaseDateYear;

    @NotBlank(message = "Author Name is mandatory")
    @Column(name = "author")
    private String Author;


    @NotBlank(message = "Genre is mandatory")
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getReleaseDateYear() {
        return releaseDateYear;
    }

    public void setReleaseDateYear(String releaseDateYear) {
        this.releaseDateYear = releaseDateYear;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }


    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", releaseDateYear='" + releaseDateYear + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
