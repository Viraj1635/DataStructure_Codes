//33. Implement a program to convert in-fix notation to post-fix notation using stack.

import java.util.*;
import java.util.Stack;

public class p33_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String in=sc.next();
        int i= in.length();
        in="("+in;
        Stack<Character> s = new Stack<Character>();
        
        s.push(')');
        String pol="";
        int rank=0;

        char next=in.charAt(i);
        System.out.println(next+"  "+i);

        while(next!=-1){
            System.out.println(next+" "+i);
            System.out.println(g(s.peek()));
            while(g(s.peek())>f(next)){
                char temp;
                temp=s.pop();
                pol=pol+temp;
                rank=rank+r(temp);
                if(rank<1){
                    System.out.println("invalid");
                    return;
                }
            }
            if(g(s.peek())!=f(next)){
                s.push(next);
            }
            else{
                s.pop();
            }
            System.out.println(s);
            i--;
            next =in.charAt(i);
            System.out.println(next+" "+i);
            System.out.println(s);
            System.out.println(pol);
        }
        
        if(!s.isEmpty() || rank!=1){
            System.out.println("invalid");
        }
        else{
            System.out.println("valid");
            System.out.println("Postfix: " +pol);
        }
    }   

    public static int g(char x){
        if(x=='+'||x=='-'){
            return 2;
        }
        else if(x=='*'||x=='/'){
            return 4;
        }
        else if(x=='^'){
            return 5;
        }
        else if((x>=65 && x<=90) || (x>=97 && x<=122)){
            return 8;
        }
        else if(x=='('){
            return 0;
        }
        else{
            return 0;
        }
    } 
    public static int f(char x){
        if(x=='+'||x=='-'){
            return 1;
        }
        else if(x=='*'||x=='/'){
            return 3;
        }
        else if(x=='^'){
            return 6;
        }
        else if((x>='a' && x<='z') || (x>='A' && x<='Z')){
            return 7;
        }
        else if(x=='('){
            return 9;
        }
        else{
            return 0;
        }
    }
    public static int r(char x){
        if(x=='+'||x=='-'){
            return -1;
        }
        else if(x=='*'||x=='/'){
            return -1;
        }
        else if(x=='^'){
            return -1;
        }
        else if((x>=65 && x<=90) || (x>=97 && x<=122)){
            return 1;
        }
        else{
            System.out.println("invalid");
            return 0;
        }
    } 
}
