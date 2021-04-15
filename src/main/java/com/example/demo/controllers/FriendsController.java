package com.example.demo.controllers;

import com.example.demo.models.Friends;
import com.example.demo.repositories.FriendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-04-15
 * Time: 12:53
 * Project: demo
 * Copyright: MIT
 */
@RestController
@RequestMapping(path="/demo")
public class FriendsController {

    @Autowired
    private FriendsRepository friendsRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewFriend (@RequestParam String firstName,
                                              @RequestParam String email,
                                              @RequestParam String phoneNumber){
        Friends friend = new Friends();
        friend.setFirstName(firstName);
        friend.setEmail(email);
        friend.setPhoneNumber(phoneNumber);
        friendsRepository.save(friend);
        return "Friend added";
    }

    @GetMapping(path="/allfriends")
    public @ResponseBody List<Friends> getAllFriends () {
        return (List<Friends>)friendsRepository.findAll();
    }
}
