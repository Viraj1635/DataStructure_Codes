//51. Write a program to implement queue using singly linked list.

import java.util.*;

public class p51 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
		SLL ss = new SLL();
		boolean flag = true;
		while(flag){
			System.out.println("Enter 1 for Insert at End, 2 for delete from first, 3 for display ,4 for break :");
			int a = cs.nextInt();
			switch(a){
				case 1 : 
					ss.insertEnd();
					break;
				case 2 :
					ss.deleteFirst();
					break;
				case 3 :
					ss.display();
					break;	
				case 4 :
					flag = false;
					break;		
			}
		}
    }
}

class MyNode2{
	int info;
	MyNode2 link;
	MyNode2(int info)
	{
		this.info = info;
	}
}

class SLL{
	MyNode2 head;
	int count = 0;
	Scanner sc  = new Scanner(System.in);

	void display(){
		MyNode2 temp = head;
		while(temp != null){
			System.out.print(temp.info+"-->");
			temp = temp.link;
			
		}
        if(head==null){
            System.out.println("Queue is empty!!!!");
        }
        else{
		    System.out.println("null");
        }
	}
	
	public void insertEnd(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element : ");
        int x = sc.nextInt();
        if(head==null){
            head = new MyNode2(x);
        }
        else{
            MyNode2 n;
            n = new MyNode2(x);
            MyNode2 m = head;
            while(m.link != null)
            {
                m = m.link;
            }
            m.link = n;
            n.link = null;
            count++;
        }
	}
    public void deleteFirst(){
        if(head==null){
            System.out.println("Queue is empty!!!!");
        }
        else{
            MyNode2 tr=null;
            tr=head;
            head=head.link;
            tr.link = null;
            count--;
        }
	}
}