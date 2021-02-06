package Repository;


    import java.util.List;
    import java.util.ArrayList;
public class EmployeeRepository {
    List<EmployeeModal> employeemodelList = new ArrayList<>();

    public void saveEmployeeModel(EmployeeModal EmployeeModal) {
        employeemodelList.add(EmployeeModal);
    }

    public List<EmployeeModal> listEmployee() {
        return employeemodelList;
    }
}

    //public List<EmployeeModal> listEmployeeModal() {






