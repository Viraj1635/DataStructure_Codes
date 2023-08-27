//22. Write a program to swap two numbers using user-defines method.

import java.util.*;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        swap(a,b);
    }
    public static void swap(int a, int b) {
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("new a is "+a+" and new b is "+b);
    }
}
