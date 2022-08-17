package com.portfolio.fb.service;

import com.portfolio.fb.model.Person;

import java.util.List;

public interface IPersonService {

    List<Person> getAllPersons();

    Person addPerson(Person pers);

    Person getPersonById(Long id);

    void deletePersonById(Long id);

    Person updatePerson(Person pers);
}
