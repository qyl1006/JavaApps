import java.util.Iterator;
import java.util.LinkedList;


public class test10 {
	public static void main(String[] args) {
		String str = "dafj,osf";
		String[] strs = str.split(",");
		for(String ele : strs){
			String s = ele.substring(0,1).toUpperCase() + ele.substring(1, ele.length());
			System.out.println(s);
		}
	}
}