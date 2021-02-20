package com.medium.learning.jpa.howtolearnjpa.service;

import com.medium.learning.jpa.howtolearnjpa.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandlineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandlineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Uluğ", "Admin");
        userRepository.save(user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieved :" + userWithIdOne);

        List<User> userList = userRepository.findAll();
        log.info("All users :" + userList);


    }
}
