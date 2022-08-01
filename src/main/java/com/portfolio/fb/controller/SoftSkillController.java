package com.portfolio.fb.controller;

import com.portfolio.fb.model.SoftSkill;
import com.portfolio.fb.services.ISoftSkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/soft-skills")
public class SoftSkillController {
    private final ISoftSkillService isoftServ;

    public SoftSkillController(ISoftSkillService isoftServ) {
        this.isoftServ = isoftServ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SoftSkill>> getAllSoftSkills(){
        return new ResponseEntity<>(isoftServ.getAllSoftSkills(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<SoftSkill> addSoftSkill(@RequestBody SoftSkill soft){
        SoftSkill newSoft = isoftServ.addSoftSkill(soft);
        return new ResponseEntity<>(newSoft, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SoftSkill> getSoftSkillById(@PathVariable Long id){
        return new ResponseEntity<>(isoftServ.getSoftSkillById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSoftSkillById(@PathVariable Long id){
        isoftServ.deleteSoftSkillById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<SoftSkill> updateSoftSkill(@RequestBody SoftSkill soft)  {
        SoftSkill updatedSoft = isoftServ.updateSoftSkill(soft);
        return new ResponseEntity<>(updatedSoft, HttpStatus.OK);
    }
}
