//Binary search Practical 2.1

import java.util.Scanner;

class Practice21
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		int key,array []=new int[1000];
		int f=0,e=array.length-1,location;

		for(int i=0;i<array.length;i++)
			array[i]=i;
		System.out.print("Enter key:");
		key=inp.nextInt();

		long S=System.nanoTime();
	
		location=BinarySearch(array,f,e,key);
	
		long E=System.nanoTime();
		System.out.println("");
		if(location!=-1)
			System.out.println(key+" is at location "+location);
		else
			System.out.println("not found"+location);

		System.out.println("time taken is "+(E-S)+" ns.");
			

		
	}
	public static int BinarySearch(int []array,int f,int e,int key)
	{
		int m=(e+f)/2;
		//System.out.println("f="+f+" e="+e+" array[m]="+m);
		if(array[m]==key)
			return m;
		else if(array[m]>key && e>=f)
		{
			e=m-1;
			return BinarySearch(array,f,e,key);
			
		}
		else if(array[m]<key && e>=f)
		{
			f=m+1;
			return BinarySearch(array,f,e,key);
		}
		else 
			return -1;
	} 
}