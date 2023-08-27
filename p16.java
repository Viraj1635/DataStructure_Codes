//16. Write a program to delete a number from a given location in an array.

import java.util.*;

public class p16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int [n-1];
        System.out.println("enter a index to delete");
        int q=sc.nextInt();
        for(int j=0;j<b.length;j++){
            if(j<q-1){
                b[j]=a[j];
            }
            else if(j>=q-1){
                b[j]=a[j+1];
            }
        }
        for(int k=0;k<n-1;k++){
            System.out.print(b[k]+" ");
        }
    }
}