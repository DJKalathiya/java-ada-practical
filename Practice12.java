//Linear Search algorithm
import java.util.Scanner;
class Practice12
{
	public static void main(String args[])
	{
		int key,location=0,flag=0;
		int []array=new int[10000];
		Scanner inp=new Scanner(System.in);
		System.out.print("enter the key:");
		key=inp.nextInt();
		for(int i=0;i<array.length;i++)
			array[i]=i;

		long S=System.nanoTime();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
			{	flag=1;
				location=i;
				break;}
		}

		long E=System.nanoTime();
		
		if(flag==1)
			System.out.println(key+" is at location "+location);
		else
			System.out.println("not found");

		System.out.println("the time taken is "+ (E-S) +" ns");
	}
}