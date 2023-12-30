//27. Write a menu driven program to implement following operations on the Stack
// created using an Array
//  PUSH
//  POP
//  DISPLAY
//  PEEP
//  CHANGE

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter length of stack");
        int n=sc.nextInt();
        Stack s=new Stack(n);
        int y=0;
        while(y!=1){
            System.out.println("enter 1 for push, 2 for pop, 3 for peep, 4 for change, 5 for display, 0 for end"); 
            int x=sc.nextInt();
            switch(x){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peep();
                    break;
                case 4:
                    s.change();
                    break;
                case 5:
                    s.display();
                    break;
                case 0:
                    y++;
            }
        }
    }
}

class Stack{
    Scanner sc=new Scanner(System.in);
    int top=0;
    int n;
    int a[];
    Stack(int n){
        this.n=n;
        a=new int[n];
    }
    public void push(){
        System.out.println("enter number to add to stack");
        int x=sc.nextInt();
        if(top>=n){
            System.out.println("stack overflow");
        }
        else{
            a[top++]=x;
        }
    }
    
    public void pop(){
        if(top==0){
            System.out.println("stack is empty");
        }
        else{
            if(top<0){
                System.out.println("stack underflow");
            }
            else{
                a[top--]=0;
            }
        }
    }

    public void peep(){
        System.out.println("enter number to peep");
        int x=sc.nextInt();
        if(top-x<0){
            System.out.println("stack underflow");
        }
        else{
            System.out.println("number at index "+(top-x)+":"+a[top-x]);
        }
    }

    public void change(){
        System.out.println("enter number to change");
        int x=sc.nextInt();
        System.out.println("enter new number to change");
        int y=sc.nextInt();
        if(top-x<0){
            System.out.println("stack underflow");
        }
        else{
            a[top-x]=y;
        }
    }

    public void display(){
        if(top == 0){
            System.out.println("stack underflow");
        }
        else{
            for(int temp:a){
                System.out.println(temp+" ");
            }
        }
    }
}