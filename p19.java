//19. Write a program to merge two unsorted arrays.

import java.util.*;

public class p19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st index: " );
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("2nd index: " );
        int q=sc.nextInt();
        int b[]=new int [q];
        for(int i=0;i<q;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int [(n+q)];
        for(int j=0;j<(n+q);j++){
            if(j<n){
                c[j]=a[j];
            }
            else if(j>=n&&j<n+q){
                c[j]=b[j-n];
            }
        }
        for(int k=0;k<n+q;k++){
            System.out.print(c[k]+" ");
        }
    }
}