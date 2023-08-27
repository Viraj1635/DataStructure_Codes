//10. Write a program to calculate sum of numbers from m to n.

import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
