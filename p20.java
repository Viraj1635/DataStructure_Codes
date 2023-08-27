//20. Read two 2x2 matrices and perform addition of matrices into third matrix and print it

import java.util.*;

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int p=2;
            int q=2;
            int r=2;
            int s=2;
            if (q!=r) {
                System.out.println("matrices can't multiplied.");
                return;
            }
            int a[][]=new int [p][q];
            int b[][]=new int [r][s];
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<s;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            int c[][]=new int [p][s];
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                        c[i][j]=a[i][j]+b[i][j];
                }
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        
    }
}
