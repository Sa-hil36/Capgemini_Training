package com.hackerrank.stereotypes.service;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public Person retrieve(Integer id){
        return contactRepository.findById(id).orElse(null);
    }

    public Person save(Person person){
        return contactRepository.save(person);
    }
}
