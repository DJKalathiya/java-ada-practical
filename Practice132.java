//Practical 1.3.2 selection sort

 public class Practice132
{
	public static void main(String[] args)
	{
		int array[]=new int[100];

		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*(array.length));
		}

		int min,key;
		
		long S=System.nanoTime();

		for(key=0;key<array.length-1;key++)
		{
			min=key;
			for(int i=key+1;i<array.length;i++)
			{
				if(array[i]<array[min])
					min=i;
			}
			int temp=array[key];
			array[key]=array[min];
			array[min]=temp;
			
		}

		long E=System.nanoTime();

		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);

		System.out.println("time taken: "+(E-S)+" nano seconds");
	}
	
}