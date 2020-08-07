package com.ammarnaji.booklibraryapi.model;


import javax.persistence.*;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "bookname")
    private String bookName;
    @Column(name = "releasedateyear")
    private String releaseDateYear;
    @Column(name = "author")
    private String Author;
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
