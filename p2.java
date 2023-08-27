// 2. Write a program to find whether a number is odd or even

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("number is even:");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
