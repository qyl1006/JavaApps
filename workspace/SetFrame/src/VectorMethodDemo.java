import java.util.Vector;


//��ʾVector��ķ���
public class VectorMethodDemo {

	public static void main(String[] args) {
		test();
		testIncreaseMethod(); //���ӷ���
	}

	private static void testIncreaseMethod() {
		/*����:
				1)boolean add(Object e) ��ָ��Ԫ�����ӵ���������ĩβ,�ȼ���addElement������ 
				2)void add(int index, Object element)  �ڴ�������ָ��λ�ò���ָ����Ԫ�ء� 
				3)boolean addAll(Collection c) :��c�����е�Ԫ�����ӵ���ǰ���϶�����.
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