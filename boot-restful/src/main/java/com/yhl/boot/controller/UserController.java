package com.yhl.boot.controller;

import com.yhl.boot.domain.User;
import com.yhl.boot.exception.UsernameIsExitedException;
import com.yhl.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Charles
 * @Title: UserController
 * @Package com.yhl.boot.controller
 * @Description: TODO
 * @date 2017/11/3 15:22
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository applicationUserRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /*public UserController(UserRepository myUserRepository,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = myUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }*/

    @RequestMapping("/userList")
    @ResponseBody
    public Map<String, Object> userList(){
        List<User> myUsers = applicationUserRepository.findAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("users",myUsers);
        return map;
    }

    /**
     * 该方法是注册用户的方法，默认放开访问控制
     * @param user
     */
    @PostMapping("/signup")
    public void signUp(@RequestBody User user) {
        User user1 = applicationUserRepository.findByUsername(user.getUsername());
        if(null != user1){
            throw new UsernameIsExitedException("用户已经存在~");
        }
        user.setPassword(DigestUtils.md5DigestAsHex((user.getPassword()).getBytes()));
        applicationUserRepository.save(user);

    }

}