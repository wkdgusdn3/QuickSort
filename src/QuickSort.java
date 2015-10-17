import java.util.ArrayList;

public class QuickSort {

	ArrayList<Integer> array;
	
	QuickSort(ArrayList<Integer> array) {
		this.array = array;
	}
	
	void sort(int first, int last) {
		
		
		System.out.println("first : " + first + " last : " + last);
//		printArray();
		
		if(first == last || last < 0) {
			
		} else{
			int key = array.get(first);
			int i = first;
			int j = first + 1;
			
			while(j <= last) {
				if(key > array.get(j)) {
					int temp = array.get(j);
					array.set(j, array.get(i+1));
					array.set(i+1, temp);
					
					i++;
				}
				
				j++;
			}
			
			int temp = array.get(first);
			array.set(first, array.get(i));
			array.set(i, temp);
		
			printArray();
			
			sort(first, i-1);
			sort(i+1, last);		
		}
	}
	
	void printArray() {
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i) + " ");			
		}
		System.out.println();
	}
	
	void printSubArray(int first, int last) {
		for(int i=first; i<=last; i++) {
			System.out.print(array.get(i) + " ");			
		}
		System.out.println();
	}
}
