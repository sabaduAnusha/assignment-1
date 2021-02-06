package Ui;

import java.util.Scanner;

public class UiConsole {
   public static Scanner scanner=new Scanner(System.in);
    static EmployeeController employeeController = new EmployeeController();


    public static void main(String[] args) {
       // EmployeeController  employeecontroller=new EmployeeController();

       int Employee = 0;
       PrintInstruction();
       //ProjectController projectController = new ProjectController();
       boolean quit = false;
       while (!quit) {
           System.out.println("enter your choice");
           int choice = scanner.nextInt();
           scanner.nextLine();
           switch (choice) {
               case 1:
                   createEmployee();
                   break;
               case 2:
                   //listEmployee();
                   break;
               case 3:
                   //updateEmployee();
                   break;
               case 4:
                   //deleteEmployee();
                   break;
               case 5:
                   quit = true;
                   break;

           }
       }
   }


    public static void createEmployee(){
       System.out.println("enter employee details");
       System.out.println("enter employee name");
       String name=scanner.next();
       System.out.println("enter employee id");
       int id=scanner.nextInt();
       System.out.println("enter employee age");
       int age=scanner.nextInt();
       System.out.println("enter employee salary");
       int salary=scanner.nextInt();
      // employeeController.createEmployee(name,id,salary,age);
       //employeeController.listEmployee();
       public static void Listemployee(){
           employeeController.Listemployee();

       }
       public static void deleteEmployee(){
           System.out.println("enter delete id");
           int deleteid=scanner.nextInt();
           employeeController.deleteemployee(deleteid);
       }
       //employeecontroller.listEmployee();
       public static void updateEmployee() {
           System.out.println("enter updated employeeid details");
           int updateid=scanner.nextInt();
           employeeController.updateEmployee(updateid);
       }
       //employeecontroller.listEmployee();
       public static void printInstructions(){
           System.out.println("choose your choice");
           System.out.println("1.create employee details");
           System.out.println("2.print the list of employee details");
           System.out.println("3.update employee details");
           System.out.println("4.delete employee details");
       }
       //System.out.println("enter project detalis");
       //System.out.println("enter project name");
       //String projectname=scanner.next();
       //System.out.println("enter projectid");
       //int Projectid= scanner.nextInt();
       //System.out.println("enter projectmodule");
       //int projectmodule=scanner.nextInt();
      // projectController.createProject(name,id,module);




   }

}
