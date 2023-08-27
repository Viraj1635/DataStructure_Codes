//21. Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in third matrix and print it.

import java.util.*;

public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int p=3;
            int q=2;
            int r=2;
            int s=3;
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
                    for (int n = 0; n < q; n++) {
                        c[i][j]+=a[i][n]*b[n][j];
                    }
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
