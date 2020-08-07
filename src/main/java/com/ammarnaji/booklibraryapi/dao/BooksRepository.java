package com.ammarnaji.booklibraryapi.dao;

import com.ammarnaji.booklibraryapi.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

    Books findAllById(int id);

}
