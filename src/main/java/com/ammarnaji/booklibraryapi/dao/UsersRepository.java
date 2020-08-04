package com.ammarnaji.booklibraryapi.dao;

import com.ammarnaji.booklibraryapi.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

    public Users findByUsername(String username);

}
