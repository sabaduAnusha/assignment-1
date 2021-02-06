package Controller;

import Repository.ProjectRepository;
import service.ProjectService;

public class ProjectController {
    ProjectService projectService=new ProjectService();
    ProjectRepository projectRepository=new ProjectRepository();

    public void createProject(String name,int id,int module) {
        //validations
        //call create employee
        projectService.createProject(name, id, module);

    }

    }
