
public class Test5 {
	public static void main(String[] args) {
		char[] c = new char[]{'A','B','C','D','A','C','D'};
		char[] c2 = new char[]{'A','b'};
		
		System.out.println(test(c, c2));
	}
	
	public static int test(char[] c, char[] c2){
		
		for (int i = 0; i < c.length; i++) {
			//int temp = c2.length;
			int j = 0;
			int ii = i;
			while(c[ii] == c2[j]){
				if(j == c2.length -1){
					return i;
				}
				ii ++;
				j ++;
			}
		}
		return -1;
	}
}


