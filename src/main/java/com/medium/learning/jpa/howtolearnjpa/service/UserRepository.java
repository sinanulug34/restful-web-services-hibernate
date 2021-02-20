package com.medium.learning.jpa.howtolearnjpa.service;

import com.medium.learning.jpa.howtolearnjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//we need a primary key and the primary key of the user is long
//spring data jpa provides a common abstraction called JPA repository
public interface UserRepository  extends JpaRepository<User,Long> {

}
