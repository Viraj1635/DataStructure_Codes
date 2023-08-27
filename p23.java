//23. Create class Employee_Detail with attributes Employee_ID, Name, Designation,
//and Salary. Write a program to read the detail from user and print it. 

import java.util.*;

class Employee_Detail{
    Scanner sc = new Scanner(System.in);
    
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;

    public void getEmployeeInfo(){
        System.out.print("enter employee_id:");
        Employee_ID=sc.nextInt();
        System.out.print("enter name:");
        Name=sc.next();
        System.out.print("enter designation:");
        Designation=sc.next();
        System.out.print("enter salary:");
        Salary=sc.nextInt();
    }
    public void printEmployeesDetails(){
        System.out.println("Employee id is: " + Employee_ID);
        System.out.println("Employee name is: " + Name);
        System.out.println("Employee desidnation is: " + Designation);
        System.out.println("Employee salary is: " + Salary);
    }

}

public class p23 {
    public static void main(String[] args) {
        Employee_Detail p = new Employee_Detail();
        p.getEmployeeInfo();
        p.printEmployeesDetails();
    }
}
