import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			array.add((int)(Math.random() * 100));
		}
		
		QuickSort quickSort = new QuickSort(array);
		quickSort.sort(0, array.size() - 1);
		System.out.print("result : ");
		quickSort.printArray();
	}
}
