package com.portfolio.fb.controller;

import com.portfolio.fb.model.Education;
import com.portfolio.fb.services.IEducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/educations")
public class EducationController {

    private final IEducationService ieduServ;

    public EducationController(IEducationService ieduServ) {
        this.ieduServ = ieduServ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAllEducations(){
        return new ResponseEntity<>(ieduServ.getAllEducations(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education edu){
        Education newEdu = ieduServ.addEducation(edu);
        return new ResponseEntity<>(newEdu, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable Long id){
        return new ResponseEntity<>(ieduServ.getEducationById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducationById(@PathVariable Long id){
        ieduServ.deleteEducationById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education edu)  {
        Education updatedEdu = ieduServ.updateEducation(edu);
        return new ResponseEntity<>(updatedEdu, HttpStatus.OK);
    }
}
