package com.example.project_demo.service;

import com.example.project_demo.entity.Project;

import java.util.List;

public interface ProjectService {
    String deleteProject(Long id);
    String updateProject(Long id, Project project);
    List<Project> readProject();
    Project createProject(Project project);
}
