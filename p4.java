// 4. Write a program to find factorial of a number. (Using Loop)

import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i = n ; i > 0 ; i--)
		{
			factorial *= i;
		}
		System.out.println("Factorial of "+n+" is "+factorial);
    }
    
}