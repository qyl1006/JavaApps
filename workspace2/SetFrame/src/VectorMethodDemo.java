import java.util.Vector;


//演示Vector类的方法
public class VectorMethodDemo {

	public static void main(String[] args) {
		test();
		testIncreaseMethod(); //增加方法
	}

	private static void testIncreaseMethod() {
		/*增加:
				1)boolean add(Object e) 将指定元素添加到此向量的末尾,等价于addElement方法。 
				2)void add(int index, Object element)  在此向量的指定位置插入指定的元素。 
				3)boolean addAll(Collection c) :把c集合中的元素添加到当前集合对象中.
		 */
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(1, 12);
		System.out.println(v);
	}

	private static void test() {
		Vector v = new Vector(5);
		v.add(123);
		
		StringBuilder sb = new StringBuilder(5);
		sb.append("A");
		v.add(sb);
		sb.append("D");
		System.out.println(v);
		
	}
}
