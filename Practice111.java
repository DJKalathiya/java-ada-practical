//Implementation and Time analysis of factorial program using iterative and recursive method
//Recursive

import java.util.Scanner;

class Practice111
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Factorial Using Recursive method.\n\n");
		System.out.println("Enter int to find factorial");
		int F=inp.nextInt();

		F=fact(F);

		System.out.println("factorial is:"+F);
		System.out.println("time:"+System.nanoTime());
		//System.nano.Time();
		
	}
	
	public static int fact(int F)
	{
		if(F!=0)
			return F*fact(F-1);
		else
			return 1;
	}
}