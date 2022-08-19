package com.portfolio.fb.service;

import com.portfolio.fb.model.Person;
import com.portfolio.fb.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService implements IPersonService{
    private final PersonRepo personRepo;
    @Autowired
    public PersonService(PersonRepo personRepo){
        this.personRepo = personRepo;
    }
    @Override
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    @Override
    public Person addPerson(Person pers) {
        return personRepo.save(pers);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepo.findById(id).orElse(null);
    }
    @Override
    public void deletePersonById(Long id) {
        personRepo.deleteById(id);
    }

    @Override
    public Person updatePerson(Person pers) {
        return personRepo.save(pers);
    }

}
