package com._520it.eclipse;


public class App {
	public static void main(String[] args) {
		System.out.println("¿ªÊ¼");
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int index = binarySearch0(arr, 0, arr.length, 11);
		
		System.out.println(index);
		
		
		
	}
	
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
            int key) {
		int low = fromIndex;
		int high = toIndex - 1;
		
		while (low <= high) {
		int mid = (low + high) >>> 1;
		int midVal = a[mid];
		
		if (midVal < key)
		low = mid + 1;
		else if (midVal > key)
		high = mid - 1;
		else
		return mid; // key found
		}
		return -(low + 1);  // key not found.
		}

}
