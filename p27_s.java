import java.util.*;
public class p27_s
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number index : ");
		int n = sc.nextInt();
		MyStack s = new MyStack(n);
		
		boolean flag  = true;
		while(flag){
			System.out.print("Enter 1 for \'Push\' \nEnter 2 for \'Pop\' \nEnter 3 for \'Peep\' \nEnter 4 for \'Change\' \nEnter 5 for \'Display\' \n Enter 6 For \'break\' :");
			int x = sc.nextInt();
			switch(x)
			{
				case 1 :
						 s.fn_push();
						 break;
				case 2 :
						 s.fn_pop();	
						 break;

				case 3 :
						 s.fn_peep();
						 break;

				case 4 :
						 s.fn_change();
						 break;

				case 5 :
						 s.fn_display();
						 break;
				case 6 : 
						 flag = false;
						 break;	
			}
			System.out.println();
		}

		
	}
}
class MyStack
{
	Scanner cs = new Scanner(System.in);
	int n ;
	int top = 0;;
	int a[];
	MyStack(int n)
	{
		this. n = n;
		a = new int[n];
	}
	// int a1[] = new int[n];
	public void fn_push()
	{
		System.out.print("Enter number to be added : ");
		int x = cs.nextInt();
		if(top >= n)
		{
			System.out.println("Stack Overflow!!!!!");

		}
		else
		{
			a[top] = x;
			System.out.println("A number is pushed");
			top++;
		}



	}
	public void fn_pop()
	{
		
		if(top == 0)
			System.out.println("Stack is Empty!!!!");
		else 
		{
			if(top <= 0)
				System.out.println("Stack UnderFlow!!!");
			else 
			{
				System.out.println("A number is pop!");
				top--;
				a[top] = 0;
				
			}
		}
		
	}
	public void fn_peep()
	{
		
			System.out.print("Enter number index to peep the number : ");
			int x = cs.nextInt();
			if(top - x < 0)
			{
				System.out.print("Stack UnderFlow!!!!");
			}
			else
			{
				System.out.println("Number at index "+(top-x)+": "+a[top-x]);
			}
		
	}
	public void fn_change()
	{
		
			System.out.print("Enter number index to change the number : ");
			int x = cs.nextInt();
			System.out.print("Enter number to be with change : ");
			int ch = cs.nextInt();
			if(top - x < 0)
			{
				System.out.print("Stack UnderFlow!!!!");
			}	
			else
			{

				a[top-x] = ch;
				System.out.println("A number is poped at index "+(top-x));
			}
		
		
	}

	public void fn_display()
	{
		
			if(top == 0)
				System.out.println("Stack UnderFlow!!!!");
			else
			{
				for(int temp : a)
				{
					System.out.print(temp+" ");
				}
			}
	}


}