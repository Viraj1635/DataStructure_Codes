//46. Implement a program to create a node for singly linked list. Read the data in a node, print the node.

import java.util.*;

public class p46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll a = new ll();
        
        int y=0;
        while (y!=1) {
            System.out.println("enter 1 for add first, 2 for add last , 3 for delete from last, 4 for delete from front , 5 for pr:int , 6 for end: "); 
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    a.INSERT();
                    break;
                case 2:
                    a.INSEND();
                    break;
				case 3:
					a.deleteEnd();
					break;
                case 4:
					a.deleteFirst();
					break;
				case 5:
                    a.print();
                    break;
                case 6:
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

    public void INSERT(){
        System.out.println("enter an element to add at front:");
        int x=sc.nextInt();
        node n = new node(x);
		if(fr==null){
            fr = new node(x);
        }
        else{
        	n.link=fr;
        	fr=n;
		}
    }

    public void INSEND(){
        System.out.println("enter an element to add at front:");
        int x=sc.nextInt();
        node n = new node(x);
        if(fr==null){
            fr = new node(x);
        }
        else{
            node m = fr;
            while(m.link != null)
            {
                m = m.link;
            }
            m.link = n;
            n.link = null;
        }
    }

	public void deleteFirst(){
        if(fr==null){
            System.out.println("Queue is empty!!!!");
        }
        else{
            node tr=null;
            tr=fr;
            fr=fr.link;
            tr.link = null;
        }
	}

	public void deleteEnd(){
        if(fr==null){
            System.out.println("Queue is empty!!!!");
        }
        else{
            node m = fr;
            node tr=null;
            while(m.link != null)
            {
                tr=m;
                m=m.link;
            }
            tr.link = null;
        }
	}

    public void print(){
		node m=this.fr;
		while(m !=null){
			System.out.print(m.info+"-->");
			m = m.link;
		}
        if (fr==null){
            System.out.println("List is empty");
        }
        else{
			System.out.println("null");
		}  
		
	}
}





// public class p46{
// 	public static void main(String[] args) {
// 		Scanner cs = new Scanner(System.in);
// 		SLL ss = new SLL();
// 		ss.createLL();
// 		ss.display();
// 		boolean flag = true;
// 		while(flag)
// 		{
// 			System.out.println("Enter 1 for Insert from Front, 2 for Insert from End, 3 for sort, 4 for insert in sorted, 5 for display :");
// 			int a = cs.nextInt();
// 			switch(a)
// 			{
// 				case 1 : 
// 					ss.insertFront();
// 					break;
// 				case 2 :
// 					ss.insertEnd();
// 					break;
// 				case 3 :
// 					//ss.LLsort();
// 					break;
// 				case 4 : 
// 					ss.insertsord();
// 					break;	
// 				case 5 :
// 					ss.display();
// 					break;	
// 				case 6 :
// 					flag = false;
// 					break;		
// 			}
// 		}

// 	}
// }

// class MyNode2
// {
// 	int data;
// 	MyNode2 next;
// 	MyNode2(int data)
// 	{
// 		this.data = data;
// 	}
// }

// class SLL
// {
// 	MyNode2 head;
// 	MyNode2 tail;
// 	int count = 0;
// 	Scanner sc  = new Scanner(System.in);
	
// 	MyNode2 createLL(){

// 		int x = sc.nextInt();
// 		while(x != -1)
// 		{
			
// 			if(head == null)
// 			{
// 				head = new MyNode2(x);
// 				tail = head;
// 				count = 1;
// 				x = sc.nextInt();
// 				continue;
// 			}
			
// 			/*if(x == -1)
// 			{
// 				break;
// 			}*/
// 			MyNode2 newNode = new MyNode2(x);
// 			tail.next = newNode;
// 			tail = tail.next;
// 			count++;
// 			x = sc.nextInt();
			
// 		}
// 		return head;
// 	}

// 	void display()
// 	{
// 		MyNode2 temp = head;
// 		while(temp != null)
// 		{
// 			System.out.print(temp.data+"-->");
// 			temp = temp.next;
			
// 		}
// 		System.out.println("null");
// 	}
// 	// void insert(int x, int pos)
// 	// {
// 	// 	MyNode2 temp2 = head;
// 	// 	if(pos == 1)
// 	// 	{
// 	// 		MyNode2 temp4 = new MyNode2(x);
// 	// 		temp4.next = head;
// 	// 		head  = temp4;
// 	// 		return;
// 	// 	}
// 	// 	for(int i = 1 ; i < pos-1 ; i++)
// 	// 	{
// 	// 		temp2 = temp2.next;
// 	// 	}
// 	// 	MyNode2 temp3 = new MyNode2(x);
// 	// 	temp3.next  = temp2.next;
// 	// 	temp2.next = temp3; 

// 	// }
// 	public void insertFront()
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		MyNode2 n ;
// 		System.out.print("Enter the element : ");
// 		int x = sc.nextInt();
// 		n = new MyNode2(x);
// 		n.next = head;
// 		head = n;
		
// 	}
// 	public void insertEnd()
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		MyNode2 n;
// 		System.out.print("Enter an element : ");
// 		int x = sc.nextInt();
// 		n = new MyNode2(x);
// 		MyNode2 m = head;
// 		while(m.next != null)
// 		{
// 			m = m.next;
// 		}
// 		m.next = n;
// 		n.next = null;
		
// 	}
// 	// public void LLsort()
// 	// {
// 	// 	MyNode2 save,p;
// 	// 	p = head;
// 	// 	while(p.next != null)
// 	// 	{
// 	// 		save = p.next;
// 	// 		while(save.next != null)
// 	// 		{
// 	// 			if(p.data > save.data)
// 	// 			{
// 	// 				int b = p.data;
// 	// 				p.data = save.data;
// 	// 				save.data = b;
// 	// 			}
// 	// 			save = save.next;
// 	// 		}
// 	// 		p = p.next;
			
// 	// 	}
// 	// }
// 	public void insertsord()
// 	{
// 		Scanner sc = new Scanner(System.in);

// 		MyNode2 m,n,save;
// 		System.out.println("Enter an element : ");
// 		int x = sc.nextInt();
// 		m = new MyNode2(x);
// 		if(head == null)
// 		{
// 			m.next = null;
// 			head = m;
// 		}
// 		if(m.data <= head.data)
// 		{
// 			m.next = head;
// 			head = m;
// 		}
// 		save = head;
// 		n = save.next;
// 		while(n.next != null && m.data >= n.data)
// 		{
// 			save = save.next;
// 			n = save.next;
// 		}
// 		m.next = save.next;
// 		save.next = m;
		
// 	}
// }