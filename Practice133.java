//Practiacl 133 insertion sort

import java.util.Scanner;

class Practice133
{
	public static void main(String args[])
	{
		int []array=new int[1000];

		/*for(int i=0;i<array.length;i++)
			array[i]=(int)(Math.random()*(array.length));*/
	
		for(int i=0;i<array.length;i++)
			array[i]=array.length-i;

		int key,j,comp=0,shift=0;
		
		long S=System.nanoTime();
		for(int i=1;i<array.length;i++)
		{
			key=array[i];
			j=i-1;
			
			while( j>-1 && key<array[j])
			{	comp++;
				shift++;
				array[j+1]=array[j];
				j--;
			}
			comp++;
			array[j+1]=key;
		}
		long E=System.nanoTime();

		/*for(int i=0;i<array.length;i++)
			System.out.println(array[i]);*/

		System.out.println("comparisions: "+comp);
		System.out.println("shifts: "+shift);
		System.out.println("time taken"+(E-S)+"seconds");
	}
}