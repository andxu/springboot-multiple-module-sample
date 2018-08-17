package com.ms.samples.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ms.samples.user.User;

@Service
public class UserServiceImpl  implements UserService {

    @Override
    public List<User> list() {
        User user1 = new User();
        user1.setUserId("1");
        user1.setUsername("admin");
        user1.setPassword("admin");
        User user2 = new User();
        user2.setUserId("2");
        user2.setUsername("jack");
        user2.setPassword("test1");
        return Arrays.asList(user1, user2);
    }
}