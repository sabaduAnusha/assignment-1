package Controller;
import Repository.EmployeeRepository;
import service.EmployeeService;
public class EmployeeController {
    EmployeeService employeeService=new EmployeeService();
    //EmployeeRepository employeeRepository=new EmployeeRepository();
    // public static void Createemployee(String name,int age,int id,int salary) {

    public void createEmployee(String name,int age,int id,int salary){
        //validations
        //call create employee
        employeeService.createModal(name,id ,age,salary);


    }
    public void Listemployee(){employeeService.ListEmployee();}
    public void deleteEmployeeModal(int deleteid){employeeService.deleteEmployee(deleteid);}
    public void updateEmployeemodal(int updateid){employeeService.UpdateEmployee(updateid);}

    public void listEmployee() {
    }
}

