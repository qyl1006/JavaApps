import java.util.ArrayList;
import java.util.List;

//����
public class TestDemo10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("3");
		list.add("5");
		list.add("5");
		list.add("5");
		list.add("5");
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i ++){
			if("3".equals(list.get(i))){
				list.remove(i);
			}
			System.out.println(list.size());
		}
		System.out.println(list);
	}
}