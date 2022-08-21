package com.portfolio.fb.controller;

import com.portfolio.fb.model.Person;
import com.portfolio.fb.service.IPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://porfolio-fb.web.app/")
@RestController
@RequestMapping("/persons")
public class PersonController {
    private final IPersonService ipersonServ;

    public PersonController(IPersonService ipersonServ) {
        this.ipersonServ = ipersonServ;
    }

    @GetMapping()
    public ResponseEntity<List<Person>> getPersons(){
        return new ResponseEntity<>(ipersonServ.getPersons(), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Person> addPerson(@RequestBody Person pers){
        Person newPers = ipersonServ.addPerson(pers);
        return new ResponseEntity<>(newPers, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id){
        return new ResponseEntity<>(ipersonServ.getPersonById(id), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePersonById(@PathVariable Long id){
        ipersonServ.deletePersonById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping()
    public ResponseEntity<Person> updatePerson(@RequestBody Person pers)  {
        Person updatedPers = ipersonServ.updatePerson(pers);
        return new ResponseEntity<>(updatedPers, HttpStatus.OK);
    }

}
