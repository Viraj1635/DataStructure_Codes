// 42. Write a menu driven program to implement following operations on the Queue
// created using an Array
//  ENQUEUE
//  DEQUEUE
//  DISPLAY

import java.util.*;

public class p42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of queue:");
        int n=sc.nextInt();
        Queue q = new Queue(n);

        int y=0;
        while(y!=1){
            System.out.println("Enter 1 for Enqueue , 2 for Dequeue , 3 for display , 4 for break:");
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    q.enqueue();
                    break;
                
                case 2:
                    q.dequeue();
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

class Queue{
    Scanner sc = new Scanner(System.in);
    int fr=-1;
    int re=-1;
    int n;
    int a[];
    Queue(int n){
        this.n=n;
        a=new int[n];
    }
    public void enqueue(){
        System.out.println("enter number to add to queue");
        int x=sc.nextInt();
        if(re>=n-1){
            System.out.println("Queue overflow");
        }
        else{
            re++;
            a[re]=x;

            if(fr==-1){
                fr=0;
            }
        }
    }
    public void dequeue(){
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
                fr++;
            }
        }
    }
    public void display(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}