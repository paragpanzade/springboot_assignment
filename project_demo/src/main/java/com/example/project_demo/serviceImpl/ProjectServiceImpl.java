package com.example.project_demo.serviceImpl;

import com.example.project_demo.entity.Project;
import com.example.project_demo.repository.ProjectRepository;
import com.example.project_demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository proj_repo;
    @Override
    public String deleteProject(Long id) {
        if (proj_repo.existsById(id)){
            proj_repo.deleteById(id);
            return "Project Deleted Successfully.";
        }
        else {
            return "Data not found!!";
        }
    }

    @Override
    public String updateProject(Long id, Project project) {
        if (proj_repo.existsById(id)){
            proj_repo.save(project);
            return "Project Updated Successfully.";
        }
        else {
            return "Data not found!!";
        }
    }

    @Override
    public List<Project> readProject() {
        return proj_repo.findAll();
    }

    @Override
    public Project createProject(Project project) {
        return proj_repo.save(project);
    }
}
