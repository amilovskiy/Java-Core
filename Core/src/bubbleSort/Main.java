package bubbleSort;

public class Main {

	public static void main(String[] args) {
		
		int arr[] = {8, 6, 5, 7, 4, 6, 3, 2, 1, 9};
		int tmp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j-1]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				} 
			}
		}
		
		for (Integer i : arr) {
			System.out.println(i);
		}
	}

}
