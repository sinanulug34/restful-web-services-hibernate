package com.medium.learning.jpa.howtolearnjpa.service;

import com.medium.learning.jpa.howtolearnjpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        //Open transaction
        entityManager.persist(user);
        //Close transaction
        return user.getId();
    }
}
