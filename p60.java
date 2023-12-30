//60. Implement an AVL tree for following node value.

import java.util.*;

public class p60 {
    
}

class node{
	int info;
	node lptr=null;
    node rptr=null;
	node(int info){
		this.info = info;
	}
}

class AVL{
    Scanner sc = new Scanner(System.in);
    node r;

    public void Insert(){
        System.out.println("enter an element to add:");
        int x=sc.nextInt();
        node n = new node(x);
		if(r==null){ 
            r=n;
        }
        else{
            node save=r;
            node pred=null;

        	while (save!=null) {
                pred=save;
                if (n.info>save.info) {
                    save=save.rptr;
                    if ( save==null) {
                        pred.rptr=n;
                    }
                }
                else if(n.info<save.info) {
                    save=save.lptr;
                    if ( save==null) {
                        pred.lptr=n;
                    }
                }
                else{
                    System.out.println("Value is already exist!!!!!");
                    break;
                }
            }
        } 
        
        while ( n.info<0) {
            
        }

    }
    

}