package com.ammarnaji.booklibraryapi.service;

import com.ammarnaji.booklibraryapi.dao.UsersRepository;
import com.ammarnaji.booklibraryapi.model.Users;
import com.ammarnaji.booklibraryapi.model.UsersPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserDetailService implements UserDetailsService {


    private UsersRepository usersRepository;

    public SecurityUserDetailService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepository.findByUsername(username);
        if (users == null)
            throw new UsernameNotFoundException("User 404");
        System.out.println("you logged in");
        return new UsersPrincipal(users);
    }
}
