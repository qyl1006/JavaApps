
public class Test7 {
	public static void main(String[] args) {
//		System.out.println(test());
		test2();
		Integer i = 1;
//		System.out.println(i);
//		
//		++ i;
//		System.out.println(i);
	}

	private static Integer test2() {
		Integer i = 1;
		try{
			return i;
//			return i;
		}finally{
			++ i;
			System.out.println(i);
		}
	}

//	private static Integer test() {
//	}
}