package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

   static ArrayList<Contact> list = new ArrayList<>();
    static Contact c1=new Contact(1L, "amit@gmail.com", "Amit", 1311L);
    static Contact c2= new Contact(2L, "anil@gmail.com", "Anil", 1311L);
    static Contact c3=new Contact(3L, "rohan@gmail.com", "Rohan", 1312L);
    static Contact c4=new Contact(4L, "sameer@gmail.com", "Sameer", 1314L);
    static {
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
    }



    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
