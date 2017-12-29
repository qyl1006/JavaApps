package com._520it._01why;

//引出异常
class Car{
	int AAA = 1;
	int BBB = -1;
	
	int i = 4;
	//开车去上班的方法
	public int goCar(){
		if (i == 2) {
			System.out.println("路上爆胎了......");
			return BBB;
		}else if (i == 3){
			System.out.println("汽车没油了...");
			return BBB;
		}else if(i == 4){
			System.out.println("路上堵车了.....");
			return BBB;
		}else{
			System.out.println("High着到公司...");
			return AAA;
		}
	}
}

//员工开车上班
class Staff{
	private Car car;
	
	Staff(Car c){
		this.car = c;
	}
	
	//上班的方法
	public void goWork()
	{
		if (car.goCar() == -1){
			System.out.println("走路上班,迟到,罚款");
		}else{
			System.out.println("开开心心早到公司吃早餐,奖励");
		}
	}
	
	}
	

//测试类
public class WhyDemo {
	public static void main(String[] args) {
		//测试
		Car c = new Car();
		Staff s = new Staff(c);
		s.goWork();
	}
}
