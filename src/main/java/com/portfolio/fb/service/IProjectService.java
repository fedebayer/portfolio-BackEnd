package com.portfolio.fb.service;

import com.portfolio.fb.model.Project;

import java.util.List;

public interface IProjectService {
    List<Project> getAllProjects();

    Project addProject(Project project);

    Project getProjectById(Long id);

    void deleteProjectById(Long id);

    Project updateProject(Project project);
}
