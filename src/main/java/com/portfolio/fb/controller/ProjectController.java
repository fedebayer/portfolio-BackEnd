package com.portfolio.fb.controller;

import com.portfolio.fb.model.Project;
import com.portfolio.fb.service.IProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://porfolio-fb.web.app/")
@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final IProjectService iprojectServ;

    public ProjectController(IProjectService iprojectServ) {
        this.iprojectServ = iprojectServ;
    }

    @GetMapping()
    public ResponseEntity<List<Project>> getProjects(){
        return new ResponseEntity<>(iprojectServ.getProjects(), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project newProject = iprojectServ.addProject(project);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id){
        return new ResponseEntity<>(iprojectServ.getProjectById(id), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProjectById(@PathVariable Long id){
        iprojectServ.deleteProjectById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping()
    public ResponseEntity<Project> updateProject(@RequestBody Project project)  {
        Project updatedProject = iprojectServ.updateProject(project);
        return new ResponseEntity<>(updatedProject, HttpStatus.OK);
    }
}
