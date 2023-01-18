//Practical 1.3.1 bubble sort

import java.lang.Math;
class Practice131
{
	public static void main(String args[])
	{
		int []array=new int[1000];
		int count=0,swap=0;

		/*for(int i=0;i<array.length;i++)
			array[i]=(int)(Math.random()*(array.length));*/

		for(int i=0;i<array.length;i++)
			array[i]=(array.length-1)-i;
	
		long S=System.nanoTime();
		for(int i=0;i<array.length;i++)
		{
			int j;
			for(j=0;j<array.length-1;j++)
			{	count++;
				if(array[j]>array[j+1])
				{
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					swap++;
				}
			}
		}
		long E=System.nanoTime();
		System.out.println("sorted  array:");
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);

		System.out.println("time taken: "+(E-S)+" ns.");
		System.out.println("comparisions"+count);
		System.out.println("swaps"+swap);
		
	}
}