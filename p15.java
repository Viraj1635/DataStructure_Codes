//15. Write a program to insert a number at a given location in an array

import java.util.*;

public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int [n+1];
        System.out.println("enter a number to add");
        int p=sc.nextInt();
        System.out.println("enter a index");
        int q=sc.nextInt();

        for(int j=0;j<n+1;j++){
            if(j<q-1){
                b[j]=a[j];
            }
            else if(j==q-1){
                b[j]=p;
            }
            else{
                b[j]=a[j-1];
            }
        }
        for(int k=0;k<n+1;k++){
            System.out.print(b[k]+" ");
        }
    }
}
