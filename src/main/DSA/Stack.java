package main.DSA;

public class Stack {
	
	private final static int MAX = 10;
	private static int top = -1;
	private static int[] stackArray = new int[MAX];
	
	//isEmpty() operation of stack
	public static Boolean isEmpty()
    {
        return top == -1;
    }
	//isFull() operation of stack
	public static Boolean isFull()
    {
        return top == MAX-1;
    }
	//push operation of stack
	public static void push(int item)
	{
		if(!isFull()) {
			top ++;
			stackArray[top] = item;
			System.out.println("Pushed Value " + item);
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	//pop operation of stack
	public static void pop()
	{
		if(!isEmpty())
		{
			int topitem = stackArray[top --];
			System.out.println( "Poped out item " + topitem);
		}
		else
			System.out.println("Stack Underflow");
	}
	//displaying items of stack
	 public static void displayStack()
     {
         for (int i=0;i<61;i++)
         {
             System.out.print("-");
         }
         System.out.println();
         for (int n = 0; n < MAX; n++)
         {
             System.out.print("| 0" + n);
         }
         System.out.println(" |");
         
         for (int i = 0; i < 61; i++)
         {
             System.out.print("-");
         }
         System.out.println();

         for (int n = 0; n <= top; n++)
         {
                 System.out.print("| " + stackArray[n]);
         }
         System.out.print(" |");
         System.out.println();
         System.out.println();
     }
	 //search stack for particular value
	 public static void searchStack(int item)
	 {
		 for (int n = 0; n <= top; n++)
         {
                 if(item == stackArray[n])
                 {
                	 System.out.println(item +" is found on index " + n);
                 }
         }
	 }
	 //some operations on stack
	public static void main(String[] args) {
		push(10);
		push(15);
		push(20);
		push(25);
		push(30);
		push(35);
		push(40);
		push(45);
		push(55);
		push(65);
		push(75);
		displayStack();
		pop();
		pop();
		displayStack();
		searchStack(40);
		
	}
}
