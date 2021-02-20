package com.medium.learning.jpa.howtolearnjpa.service;

import com.medium.learning.jpa.howtolearnjpa.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandlineRunner implements CommandLineRunner {

    @Autowired
    UserDAOService userDAOService;

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandlineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Sinan", "Admin");
        long insert = userDAOService.insert(user);
        log.info("New user is created :" + user);

    }
}
