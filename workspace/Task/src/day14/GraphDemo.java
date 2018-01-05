package day14;
/*
 * 需求: 求圆 长方形 三角形 面试
 * */
public class GraphDemo {
	public static void main(String[] args) {
		
		//测试
		//圆
		System.out.println(new Circular(10D).acreage());
		
		//长方形
		System.out.println(new Rectangle(12D, 11D).acreage());
		
		//三角形
		System.out.println(new Triangle(3D, 4D, 5D).acreage());
		
	}
}

//图形父类
abstract class Graphical{
	abstract public Double acreage();
}

//圆类
class Circular{
	private Double r;
	
	Circular(Double r){
		this.r = r;
	}
	
	//计算面积的方法
	public Double acreage(){
		return Math.PI * this.r * this.r;
	}
}

//长方形类
class Rectangle{
	private Double length;
	private Double wide;
	
	Rectangle(Double length, Double wide){
		this.length = length;
		this.wide = wide;
	}
	
	//面积
	public Double acreage(){
		return length * wide;
		
	}
}

//三角形类
class Triangle{
	private Double a;
	private Double b;
	private Double c;
	
	Triangle(Double a, Double b, Double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//面积
	public Double acreage(){
		Double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	
}




