// 53. Write a menu driven program to implement following operations on the
// circular linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.
//  Insert a node at the end of the linked list.
//  Display all nodes.

import java.util.*;

public class p53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll a = new ll();
        
        int y=0;
        while (y!=1) {
            System.out.println("enter 1 for add first, 2 for add last , 3 for delete , 4 print , 5 for end: "); 
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    a.INS_First();
                    break;
                case 2:
                    a.INS_End(); 
                    break;
				case 3:
					a.DELETE();
					break;
                case 4:
                    a.print();
                    break;
                case 5:
                    y++;
            }  
        }
    
    }
}


class node{
	int info;
	node link;
	node(int info){
		this.info = info;
	}
}


class ll{
    Scanner sc = new Scanner(System.in);
    node fr=null;
    node re=null;

    public void INS_First(){
        System.out.println("enter an element to add at front:");
        int x=sc.nextInt();
        node n = new node(x);
		if(fr==null){
            n.link=new node(x);
            fr = n;
            re=n;
        }
        else{
        	n.link=fr;
        	fr=n;
            re.link=fr;
		}
    }

    public void INS_End(){
        System.out.println("enter an element to add at end:");
        int x=sc.nextInt();
        node n = new node(x);
		if(fr==null){
            n.link=new node(x);
            fr = n;
            re=n;
        }
        else{
        	re.link=n;
            n.link=fr;
            re=n;
		}
    }

	public void DELETE(){
        System.out.println("enter an element to delete:");
        int x=sc.nextInt();
        node n=new node(x);
        node save = fr;
        node pred=null;

        if(fr==null){
            System.out.println("Linked list is empty !!!!!!!!!!!!");
            return;
        }
        else{
            while(save.info != x && save!=re){
                pred=save;
                save=save.link;
            }
            if(save.info!=x){
                System.out.println("Element not found !!!!!!");
            }
            else{
                if(fr==re){
                    fr=null;
                    re=null;
                }
                else{
                    if(save==fr){
                        fr=fr.link;
                        save.link=null;
                        re.link=fr;
                    }
                    else if(save==re){
                        save.link=null;
                        pred=re;
                        re.link=fr;
                    }
                    else{
                            pred.link=save.link;
                            save.link=null;
                        }
                }
            }
        }
	}

    public void print(){
		node m=fr;
        if(fr==null){
            System.out.println("List is empty!!!!!!!");
        return;
        }
        if (fr==re) {
            System.out.println(fr.info+"-__->null");
        }
        else{
            while(m.link != fr){
                System.out.print(m.info+"-->");
                m = m.link;
            }
            System.out.print(m.info+"-->");
            if (fr==null){
                System.out.println("List is empty");
            }
            else{
                System.out.println("null");
            }
        }  
	}
}

