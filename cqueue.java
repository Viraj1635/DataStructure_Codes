// 43. Write a menu driven program to implement following operations on the Circular Queue
// created using an Array
//  ENQUEUE
//  DEQUEUE
//  DISPLAY

import java.util.*;

public class cqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of queue:");
        int n=sc.nextInt();
        CQqueue q = new CQqueue(n);

        int y=0;
        while(y!=1){
            System.out.println("Enter 1 for Enqueue , 2 for Dequeue , 3 for display , 4 for break:");
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    q.cqinsert();
                    break;
                
                case 2:
                    q.cqdelete();
                    break;

                case 3:
                    q.display();
                    break;
                
                case 4:
                    y++;
            }
        }
    }
}

class CQqueue{
    Scanner sc = new Scanner(System.in);
    int fr=-1;
    int re=-1;
    int n;
    int a[];
    CQqueue(int n){
        this.n=n;
        a=new int[n];
    }
    public void cqinsert(){
        System.out.println("enter number to add to queue");
        int x=sc.nextInt();
        if(re==n-1){
            re=0;
        }
        else{
            re++;
        }
        if(fr==re){
            System.out.println("Queue Overflow");
        }
        else{
            a[re]=x;
            if(fr==-1){
                fr=0;
            }
        }
    }
    public void cqdelete(){
        if(fr==-1){
            System.out.println("Queue underflow");
        }
        else{
            a[fr]=0;
            if(fr==re){
                fr=-1;
                re=-1;
            }
            else{
                if(fr==re){
                    fr=0;
                }
                else{
                    fr++;
                }
            }
        }
    }
    public void display(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}