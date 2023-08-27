//24. Create array of object of class Student_Detail with attributes Enrollment_No,
//Name, Semester, CPI for 5 students, scan their information and print it

import java.util.*;

class Student_Detail{
    int Enrollment_No; 
    String Name;
    int Sem;
    int CPI;
    Scanner sc = new Scanner(System.in);
    
    public void getStudentInfo(){
        System.out.print("enter enrollment no.:");
        Enrollment_No=sc.nextInt();
        System.out.print("enter name:");
        Name=sc.next();
        System.out.print("enter semester:");
        Sem=sc.nextInt();
        System.out.print("enter cpi:");
        CPI=sc.nextInt();

    }
    public void printtStudentDetails() {
        System.out.println("Student enrollment no is: " + Enrollment_No);
        System.out.println("Student name is: " + Name);
        System.out.println("Student semster is: " + Sem);
        System.out.println("Student cpi is: " + CPI);
    }

}

public class p24{
    public static void main(String[] args) {
        Student_Detail[] s= new Student_Detail[5];
        for(int i=0; i<5; i++){
            s[i]=new Student_Detail();
            s[i].getStudentInfo();
            s[i].printtStudentDetails();
        }
        
        
    }
}