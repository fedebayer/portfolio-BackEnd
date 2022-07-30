package com.portfolio.fb.controller;

import com.portfolio.fb.model.Person;
import com.portfolio.fb.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final IPersonService ipersonServ;

    public PersonController(IPersonService ipersonServ) {
        this.ipersonServ = ipersonServ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(ipersonServ.getAllPersons(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Person> addPerson(@RequestBody Person pers){
        Person newPers = ipersonServ.addPerson(pers);
        return new ResponseEntity<>(newPers, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id){
        return new ResponseEntity<>(ipersonServ.getPersonById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersonById(@PathVariable Long id){
        ipersonServ.deletePersonById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Person> updatePerson(@RequestBody Person pers)  {
        Person updatedPers = ipersonServ.updatePerson(pers);
        return new ResponseEntity<>(updatedPers, HttpStatus.OK);
    }

}
