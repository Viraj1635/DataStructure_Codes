// 11. Write a program to calculate average of first n numbers.

import java.util.*;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        double sum=0;
        double avg=0;
        sum=(n*(n+1))/2;
        avg=sum/n;
        System.out.println(avg);
    }
}
