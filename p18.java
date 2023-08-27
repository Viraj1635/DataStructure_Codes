//18. Write a program to delete a number from an array that is already sorted in an ascending order.

import java.util.*;

public class p18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int b[]=new int [n-1];
        System.out.println("enter a number to delete");
        int q=sc.nextInt();
        for(int j=0;j<b.length;j++){
            if(a[j]<q){
                b[j]=a[j];
            }
            else if(a[j]>=q){
                b[j]=a[j+1];
            }
        }
        for(int k=0;k<n-1;k++){
            System.out.print(b[k]+" ");
        }
    }
}