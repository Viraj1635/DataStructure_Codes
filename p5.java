// 5. Write a program to find factorial of a number. (Using Recursion)

import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		System.out.println(fact(a));
    }
    public static int fact(int n){
        if (n==1||n==0) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
}
