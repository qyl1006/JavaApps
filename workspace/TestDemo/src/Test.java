
public class Test {
	public static void main(String[] args) {
		//����
		int[] arr = new int[]{1, 2, 3, -2, -333, 4, 5, 32, 22,  6, 7};
		print(arr);
		swap(arr, 1, 5);
		print(arr);
		
		test(arr);
		print(arr);
		
		System.out.println(12 ^ 12);
		
		System.out.println((121313 >> 12) == (121313 >>> 12) );
		System.out.println(11 >>> 1);
		
	}
	
	//����λ��
	public static int[] swap(int[] arr, int index1, int index2){
		if (index1 == index2) {
			return arr;
		}
		arr[index1] = arr[index1] ^ arr[index2];
		arr[index2] = arr[index1] ^ arr[index2];
		arr[index1] = arr[index1] ^ arr[index2];
		return arr;
	}
	
	//��ӡ����
	
	public static void print(int[] arr){
		if (arr == null) {
			System.out.println("null");
			return;
		}
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				str += arr[i] + "]";
			}else{
			str += arr[i] + ",";
			}
		}
		System.out.println(str);
	}
	
	
	//����
	public static int[] test(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int min = i -1;
			int m = min;
			for (int j = i; j < arr.length; j++) {
				if (arr[m] > arr[j]) {
					m = j;
				}
			}
			swap(arr, min, m);
		}
		return arr;
	}
}






