import java.util.Arrays;


public class Test6 {
	public static void main(String[] args) {
		String str = "name=Will;age=17&&name=Hello;age=18";
		String[] s1 = str.split("&&");
		System.out.println(s1.length);
		System.out.println("01" + Arrays.toString(s1));
		
		Pase[] p = new Pase[2];
		p[0] = new Pase();
		p[1] = new Pase();
		
		for (int i = 0; i < s1.length; i++) {
			String[] s2 = s1[i].split(";");
			System.out.println(s2.length);
			
			for (int j = 0; j < s2.length; j++) {
				if(s2[j].contains("name")){
					String[] s3 = s2[j].split("=");
					p[i].setName(s3[1]);
				}else{
					String[] s3 = s2[j].split("=");
					p[i].setAge(Integer.valueOf(s3[1]));
				}
			}
		}
		System.out.println(Arrays.toString(p));
		
		
		
	}
}

class Pase{
	private String name;
	private Integer age;
	
	Pase(){}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(Integer age){
		this.age = age;
	}
	
	public String toString(){
		return "name:" + this.name + " age:" +this.age;
	}
}