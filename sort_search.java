package algpractice;

public class sort_search {
	public int[] selection_sort(int[] lst) {
		int[] array = lst;
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if (array[i]< array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	public int[] bubble_sort(int[] lst) {
		int[] array = lst;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i -1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
	}
	public int linear_search(int[] lst, int search) {
		int[] array = lst;
		int index = 0;
		for(int i = 0; i < array.length ; i++) {
			if (array[i] == search)
					index = i;
		}
		return index;
	}
	
	

}
