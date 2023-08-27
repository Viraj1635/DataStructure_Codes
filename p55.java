//55. impliment of doubly linked list 

import java.util.*;

public class p55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dll a = new Dll();
        
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
	node lptr=null;
    node rptr=null;
	node(int info){
		this.info = info;
	}
}


class Dll{
    Scanner sc = new Scanner(System.in);
    node fr;
    node re;

    public void INS_First(){
        System.out.println("enter an element to add at front:");
        int x=sc.nextInt();
        node n = new node(x);
		if(fr==null){
            fr=n;
            re=n;
        }
        else{
        	n.rptr=fr;
            fr.lptr=n;
        	fr=n;
		}
    }

    public void INS_End(){
        System.out.println("enter an element to add at front:");
        int x=sc.nextInt();
        node n = new node(x);
        if(fr==null){
            fr=n;
            re=n;
        }
        else{
            n.lptr=re;
            re.rptr=n;
            re=n;
        }
    }

	public void DELETE(){
        System.out.println("enter an element to delete:");
        int x=sc.nextInt();
        node n = new node(x);
        node save=fr;
        node pred=null;
        if(fr==null){
            System.out.println("Linked list is empty !!!!!!!!!!!!");
            return;
        }
        else{
            while(save.info != x && save!=re){
                pred=save;
                save=save.rptr;
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
                        fr=fr.rptr;
                        fr.lptr=null;
                        save.rptr=null;
                    }
                    else if(save==re){
                        re=re.lptr;
                        re.rptr=null;
                        save.lptr=null;
                    }
                    else{
                        pred.rptr=save.rptr;
                        save.rptr.lptr=pred;
                        save.rptr=null;
                        save.lptr=null;
                    }
                }
            }
        }
	}

    public void print(){
		node m=fr;
		while(m !=null){
			System.out.print(m.info+"-->");
			m = m.rptr;
		}
        if (fr==null){
            System.out.println("List is empty");
        }
        else{
			System.out.println("null");
		}  
		
	}
}

