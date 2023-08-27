//8. Write a program to check whether a number is prime or not.

import java.util.*;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for (int i = 2; i <a/2; i++) {
            if(a%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("not Prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
