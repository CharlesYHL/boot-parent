package com.yhl.boot.service;

import com.yhl.boot.domain.User;
import com.yhl.boot.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

/**
 * @author Charles
 * @Title: UserDetailsServiceImpl
 * @Package com.yhl.boot.service
 * @Description: TODO
 * @date 2017/11/3 15:20
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository myUserRepository;

    // 通过构造器注入MyUserRepository
    public UserDetailsServiceImpl(UserRepository myUserRepository) {
        this.myUserRepository = myUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User myUser = myUserRepository.findByUsername(username);
        if (myUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(myUser.getUsername(), myUser.getPassword(), emptyList());
    }
}