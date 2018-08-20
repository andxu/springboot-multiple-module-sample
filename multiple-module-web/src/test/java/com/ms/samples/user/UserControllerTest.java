package com.ms.samples.user;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ms.samples.MmWebApplication;
import com.ms.samples.user.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MmWebApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    UserService userService;

    @Test
    public void testListUser() {
        assertEquals("Should have two elements.", 2, userService.list().size());
    }
}