//Implementation and Time analysis of factorial program using iterative and recursive method
//iterative

import java.util.Scanner;

class Practice112
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter integer to find factorial");
		
		int F=inp.nextInt(),F2=F;

		long Is = System.nanoTime();				
		for(int i=F-1;i>0;i--)
			F*=i;
		
		long Ie = System.nanoTime();				
		long Idif=Ie-Is;
		System.out.println("\nFactorial Using Iterative method");
		System.out.println("factorial is "+F);

		double TInterative=System.nanoTime();
		System.out.println("time:"+Idif);

		long Rs = System.nanoTime();				
		F=fact(F2);

		long Re = System.nanoTime();
		long Rdif=Re-Rs;
		System.out.println("\nFactorial Using Recursive method");
		System.out.println("Factorial is:"+F);
		System.out.println("Time:"+Rdif);
		
		System.out.println("\nTime difference: "+(Rdif-Idif)+ " nano seconds");
	}

	public static int fact(int F)
	{
		if(F!=0)
			return F*fact(F-1);
		else
			return 1;
	}
}
