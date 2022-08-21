package com.portfolio.fb.controller;

import com.portfolio.fb.model.Skill;
import com.portfolio.fb.service.ISkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/skills")
public class SkillController {
    private final ISkillService iskillServ;

    public SkillController(ISkillService iskillServ) {
        this.iskillServ = iskillServ;
    }

    @GetMapping()
    public ResponseEntity<List<Skill>> getSkills(){
        return new ResponseEntity<>(iskillServ.getSkills(), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        Skill newSkill = iskillServ.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable Long id){
        return new ResponseEntity<>(iskillServ.getSkillById(id), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkillById(@PathVariable Long id){
        iskillServ.deleteSkillById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping()
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill)  {
        Skill updatedSkill = iskillServ.updateSkill(skill);
        return new ResponseEntity<>(updatedSkill, HttpStatus.OK);
    }
}
