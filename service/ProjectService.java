package service;

import Repository.ProjectRepository;

public class ProjectService {
    ProjectRepository projectRepository=new ProjectRepository();

    public void createProject(String name,int id,int module){
        projectRepository.createProject(name,id,module)
    }
}

