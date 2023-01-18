//Practical 4  heap sort

public class Practice14 {
	static int heapsize;

	public static void main(String[] args) {
		int array[] = new int[100];
		for (int i = 0; i < array.length; i++)
			array[i] = (int) (Math.random() * (array.length));

		// Max heap sort
		long S = System.nanoTime();

		array = BuildMaxHeap(array);

		for (int i = array.length - 1; i >= 1; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			heapsize--;
			array = MaxHeapify(array, 0);
		}
		long E = System.nanoTime();

		// Max heap over
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		System.out.println("time  taken is" + (E - S) + "nano seconds");
	}

	public static int[] MaxHeapify(int[] array, int i) // max heapify method
	{
		int L = 2 * i + 1;
		int R = 2 * i + 2;
		int largest;

		if (L <= heapsize - 1 && array[L] > array[i])
			largest = L;
		else
			largest = i;

		if (R <= heapsize - 1 && array[R] > array[largest])
			largest = R;

		if (largest != i) {
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;

			array = MaxHeapify(array, largest);
		}
		return array;
	}
	public static int[] BuildMaxHeap(int[] array) {
		heapsize = array.length;

		for (int i = (array.length / 2) - 1; i >= 0; i--)
			array = MaxHeapify(array, i);

		return array;
	}
}