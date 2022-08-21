package com.portfolio.fb.controller;

import com.portfolio.fb.model.Education;
import com.portfolio.fb.service.IEducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://porfolio-fb.web.app/")
@RestController
@RequestMapping("/educations")
public class EducationController {

    private final IEducationService ieduServ;

    public EducationController(IEducationService ieduServ) {
        this.ieduServ = ieduServ;
    }

    @GetMapping()
    public ResponseEntity<List<Education>> getEducations(){
        return new ResponseEntity<>(ieduServ.getEducations(), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Education> addEducation(@RequestBody Education edu){
        Education newEdu = ieduServ.addEducation(edu);
        return new ResponseEntity<>(newEdu, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable Long id){
        return new ResponseEntity<>(ieduServ.getEducationById(id), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEducationById(@PathVariable Long id){
        ieduServ.deleteEducationById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("")
    public ResponseEntity<Education> updateEducation(@RequestBody Education edu)  {
        Education updatedEdu = ieduServ.updateEducation(edu);
        return new ResponseEntity<>(updatedEdu, HttpStatus.OK);
    }
}
