package com.portfolio.fb.services;

import com.portfolio.fb.model.Project;
import com.portfolio.fb.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectService implements IProjectService{
    private final ProjectRepo projectRepo;
    @Autowired
    public ProjectService(ProjectRepo projectRepo){
        this.projectRepo = projectRepo;
    }
    @Override
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    @Override
    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepo.findById(id).orElse(null);
    }
    @Override
    public void deleteProjectById(Long id) {
        projectRepo.deleteById(id);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

}
