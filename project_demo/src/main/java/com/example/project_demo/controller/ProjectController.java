package com.example.project_demo.controller;

import com.example.project_demo.entity.Project;
import com.example.project_demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @PostMapping("/create")
    public ResponseEntity<Project> createProduct(@RequestBody Project project){
        return ResponseEntity.ok().body(this.projectService.createProject(project));
    }

    @GetMapping("/read")
    public List<Project> readProduct(){
        return this.projectService.readProject();
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Long id, @RequestBody Project project){
        return this.projectService.updateProject(id, project);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        return this.projectService.deleteProject(id);
    }
}
