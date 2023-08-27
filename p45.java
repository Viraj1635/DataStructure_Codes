//45. Write a sample java code to implement a node structure

import java.util.*;

public class p45 {
    public static void main(String[] args) {
        node n1 = new node();
		n1.info = 5;
		node n2 = new node();
		n2.info = 10;
		n1.link = n2;
		node n3 = new node();
		n3.info = 15;
		n2.link = n3;
		n3.link = null;
		print(n1);


    }
    public static void print(node p){
        node m=p;
        while(m!=null){
            System.out.println(m.info);
			m = m.link;
        }
    }
}
class node{
    int info;
    node link;
    node fr;
}