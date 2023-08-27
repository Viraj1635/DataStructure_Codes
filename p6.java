// 6. Write a program to find power of a number using loop.

import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=1;
        for (int i = b; i > 0; i--) {
            n=n*a;
        }
        System.out.println(n);
    }
}
