package com.portfolio.fb.controller;

import com.portfolio.fb.model.Experience;
import com.portfolio.fb.services.IExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/experiences")
public class ExperienceController {

    private final IExperienceService iexpServ;

    public ExperienceController(IExperienceService iexpServ) {
        this.iexpServ = iexpServ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getAllExperiences(){
        return new ResponseEntity<>(iexpServ.getAllExperiences(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience exp){
        Experience newExp = iexpServ.addExperience(exp);
        return new ResponseEntity<>(newExp, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable Long id){
        return new ResponseEntity<>(iexpServ.getExperienceById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperienceById(@PathVariable Long id){
        iexpServ.deleteExperienceById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience exp)  {
        Experience updatedExp = iexpServ.updateExperience(exp);
        return new ResponseEntity<>(updatedExp, HttpStatus.OK);
    }
}
