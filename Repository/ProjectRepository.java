package Repository;

import Model.EmployeeModel;
import Model.ProjectModel;

import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {
    List<ProjectModall> projectmodalList = new ArrayList<>();

    public void saveProjectModel(ProjectModal ProjectModal) {
        projectmodalList.add(ProjectModal);

    }
}
