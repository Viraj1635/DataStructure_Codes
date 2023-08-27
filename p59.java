// 59. Implement a menu based Binary search tree for following operation
//  Insert a node
//  Delete a node
//  Preorder Traversal
//  Post order Traversal
//  In order Traversal

import java. util.*;

public class p59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST a = new BST();
        
        int y=0;
        while (y!=1) {
            System.out.println("enter 1 to add, 2 for delete element , 3 to print in pre-order , 4 to print in in-order , 5 to print in post-order, 6 for end: "); 
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    a.Insert();
                    break;
                case 2:
                    a.DELETE(); 
                    break;
                case 3:
                    System.out.print("PreOrder: ");
                    a.preOrd();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("PreOrder: ");
                    a.inOrd();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("PreOrder: ");
                    a.postOrd();
                    System.out.println();
                    break;
                case 6:
                    y++;
                    break; 
            }   
        }
    }
}

class node{
	int info;
	node lptr=null;
    node rptr=null;
	node(int info){
		this.info = info;
	}
}

class BST{
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
    }

	public void DELETE(){
        System.out.println("enter an element to delete:");
        int x=sc.nextInt();
        node save=r;
        node pred=null;
        System.out.println(save.info);
        if(r==null){
            System.out.println("Tree is empty !!!!!!!!!!!!");
            return;
        }
        else{

            while(save.info!=x && save!=null ){
                pred=save;
                if (save.lptr!=null || save.rptr!=null) {
                    if (save.info < x) {
                        save=save.rptr;
                    }
                    else{
                        save=save.lptr;
                    }
                }
                else{
                    break;
                }
            }

            if(save.info!=x){
                System.out.println("Element not found !!!!!!");
            }
            else{
                if(save.lptr==null && save.rptr==null){
                    if (save==r) {
                        r=null;
                    }
                    else{
                        if (save.info<pred.info){
                            pred.lptr = null;
                            System.out.println(save.info);
                        }
                        else{
                            pred.rptr = null;
                        }
                    }
                }
                else if(save.lptr!=null && save.rptr==null || save.lptr==null && save.rptr!=null){
                    if (save.info<pred.info){
                        if (save.rptr==null) {
                            pred.lptr = save.lptr;
                        }
                        else{
                            pred.lptr = save.rptr;
                        }
                    }
                    else{
                        if (save.rptr==null) {
                            pred.rptr = save.lptr;
                        }
                        else{
                            pred.rptr = save.rptr;
                        }
                    }
                }
                else if(save.lptr!=null && save.rptr!=null){
                    node add=r;
                    if (save==r) {
                        add=r.rptr;
                        while (add.lptr!=null) {
                            add=add.lptr;
                        }
                        add.lptr=save.lptr;
                        r=save.rptr;
                        save.lptr=null;
                        save.rptr=null;
                    }
                    else{
                        if (save.info>pred.info) {
                            add=save.rptr;
                            while (add.lptr!=null) {
                                add=add.lptr;
                            }
                            add.lptr=save.lptr;
                            pred.rptr=save.rptr;
                            save.lptr=null;
                            save.rptr=null;
                        }
                        else{
                            add=save.rptr;
                            while (add.lptr!=null) {
                                add=add.lptr;
                            }
                            add.lptr=save.lptr;
                            pred.lptr=save.rptr;
                            save.lptr=null;
                            save.rptr=null;
                        }
                    }
                }
            }
        }
	}

    public void preOrd(node rt){
		if (rt==null){
            return;
        }
        System.out.print(rt.info+" ");
        preOrd(rt.lptr);
        preOrd(rt.rptr);
	}
    public void preOrd() {
        System.out.println(r.info);
        preOrd(r);
    }

    public void inOrd(node rt){
		if (rt==null){
            return;
        }
        inOrd(rt.lptr);
        System.out.print(rt.info+" ");
        inOrd(rt.rptr);

	}
    public void inOrd() {
        System.out.println(r.info);
        inOrd(r);
    }

    public void postOrd(node rt){
		if (rt==null){
            return;
        }
        postOrd(rt.lptr);
        postOrd(rt.rptr);
        System.out.print(rt.info+" ");
	}
    public void postOrd() {
        System.out.println(r.info);
        postOrd(r);
    }
}