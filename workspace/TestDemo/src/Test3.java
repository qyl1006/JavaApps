
public class Test3 {
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[]{-1 ,0, -3, -4};
		Swap.swap(arr, 1, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}
}

class Swap{
	//���齻��λ��
	public static Integer[] swap(Integer[] arr, int index1, int index2){
		if(index1 == index2){
			return arr;
		}
		arr[index1] = arr[index1] ^ arr[index2];
		arr[index2] = arr[index1] ^ arr[index2];
		arr[index1] = arr[index1] ^ arr[index2];
		return arr;
	}
}