package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

   static ArrayList<User> list = new ArrayList<User>();
         static {
             list.add(new User(1311L, "Durgesh Tiwari", "23525625"));
             list.add(new User(1312L, "Durga Tiwari", "23525624"));
             list.add(new User(1313L, "rakesh Tiwari", "23525623"));
             list.add(new User(1314L, "rohit Tiwari", "23525621"));
         }



    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
