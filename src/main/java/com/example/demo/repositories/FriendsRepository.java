package com.example.demo.repositories;

import com.example.demo.models.Friends;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-04-15
 * Time: 11:13
 * Project: demo
 * Copyright: MIT
 */

public interface FriendsRepository extends CrudRepository<Friends, Long> {

    List<Friends> findByFirstName(String firstName);
    List<Friends> findByPhoneNumber(String phoneNumber);
    List<Friends> findByEmail(String email);
}
