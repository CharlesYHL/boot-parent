package com.yhl.boot.repository;

import com.yhl.boot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Charles
 * @Title: UserRepository
 * @Package com.yhl.boot.repository
 * @Description: TODO
 * @date 2017/11/3 15:14
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
