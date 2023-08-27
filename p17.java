//17 Write a program to insert a number in an array that is already sorted in an ascending order

import java.util.*;

public class p17{
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
        int b[]=new int [n+1];
        System.out.println("enter a number to add");
        int p=sc.nextInt();
        int q=0;
        for(int i=0;i<n;i++){
            if (a[i]==p) {
                q=i;
            }
        }

        for(int j=0;j<n;j++){
            if(j<q-1){
                b[j]=a[j];
            }
            else {
                b[j]=p;
            }
            if(j>q-1){
                b[j]=a[j-1];
            }
        }
        for(int k=0;k<n+1;k++){
            System.out.print(b[k]+" ");
        }
    }
}
