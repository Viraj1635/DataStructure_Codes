//WAP for stack to recognize strings aca, bcb, abcba, abbcbba

import java.util.*;

public class p29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String b=sc.next();
        b=b.concat("_");
        int n=b.length();
        Stack s=new Stack(n);
        System.out.println(b.length());
        boolean c=b.contains("c");
        if (c==true) {
            
        }
        else{
            System.out.println("Invalid string");
            return;
        }
        s.push('c');
        
        char next=' ';
        int i=0;
        next=b.charAt(i);
        while (next!='c') {
            if (next==' ') {
                System.out.println("Invalid string");
                return;
            }
            else{
                s.push(next);
            }
            i++;
            next=b.charAt(i);
        }
        i++;
        next=b.charAt(i);
    
        while (s.a[s.top-1]!='c') {
            if (s.a[s.top-1]!=next) {
                System.out.println("Invalid String");
                return;
            }
            else{
                s.pop();
            }
            i++;
            next=b.charAt(i);
        }
        next=b.charAt(i);
        if (next=='_') {
            System.out.println("Valid String");
        }
        else{
            System.out.println("Invalid String");
        }
    }
}

class Stack{
    Scanner sc=new Scanner(System.in);
    int top=0;
    int n;
    char a[];
    Stack(int n){
        this.n=n;
        a=new char[n];
    }
    public void push(char x){
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
            if(top<=0){
                System.out.println("stack underflow");
            }
            else{
                a[top--]=0;
            }
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