package service;

import Repository.EmployeeRepository;

import java.util.Scanner;
import java.util.List;

public class EmployeeService {
    EmployeeRepository employeeRepository=new EmployeeRepository();
    Scanner sc=new Scanner(System.in);


    public void createModal(String name,int id,int age,int salary) {
        EmployeeModal employeemodal = new EmployeeModal(id, salary,name,age);

        employeemodal.setId(id);

        employeemodal.setName(name);
        employeemodal.setAge(age);
        employeemodal.setSalary(salary);

        employeeRepository.saveEmployeeModal(employeemodal);
    }
    List<EmployeeModal>employeelist=employeeRepository.listEmployee();
     //   employeeRepository.listEmployeeModal();
        public void ListEmployee(){
            for(EmployeeModal emp:employeelist){
                System.out.println(emp);
        }
    }
    public void deleteEmployee(int deleteid){
        for(EmployeeModal emp:employeelist)
            if(emp.getId()==deleteid)
                employeelist.remove(emp);
    }
    public void UpdateEmployee(int updateid){
        for(EmployeeModal emp:employeelist)
            if(emp.getId()==updateid){
                System.out.println("enter employee name");
                String name=sc.next();
                System.out.println("enter employee id");
                int id=sc.nextInt();
                System.out.println("enter employee salary");
                int salary=sc.nextInt();
                System.out.println("enter employee age");
                int age=sc.nextInt();
                emp.setName(name);
                emp.setId(id);
                emp.setSalary(salary);
                emp.setAge(age);
            }
    }

}
