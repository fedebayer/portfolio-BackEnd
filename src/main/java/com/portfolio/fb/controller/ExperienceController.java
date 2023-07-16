package com.portfolio.fb.controller;

import com.portfolio.fb.model.Experience;
import com.portfolio.fb.service.IExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"https://porfolio-fb.web.app/", "https://fedebayer.web.app/"})
@RestController
@RequestMapping("/experiences")
public class ExperienceController {

    private final IExperienceService iexpServ;

    public ExperienceController(IExperienceService iexpServ) {
        this.iexpServ = iexpServ;
    }

    @GetMapping()
    public ResponseEntity<List<Experience>> getExperiences() {
        return new ResponseEntity<>(iexpServ.getExperiences(), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Experience> addExperience(@RequestBody Experience exp) {
        Experience newExp = iexpServ.addExperience(exp);
        return new ResponseEntity<>(newExp, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable Long id) {
        return new ResponseEntity<>(iexpServ.getExperienceById(id), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExperienceById(@PathVariable Long id) {
        iexpServ.deleteExperienceById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping()
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience exp) {
        Experience updatedExp = iexpServ.updateExperience(exp);
        return new ResponseEntity<>(updatedExp, HttpStatus.OK);
    }
}
