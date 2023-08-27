// 7. Write a program to find factors of a given number.

import java.util.*;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 1; i <=a; i++) {
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
