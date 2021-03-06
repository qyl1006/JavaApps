package com._520it.day01;
/*
 * 假设我现在是球队的教练,我需要安排上场的球员(安排5个).
	模拟数据存储的案例,模拟上场球员的球衣号码的存储:
        Integer[] players = null;

			作为一个教练,要安排上场:
           1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码.
           2):安排5个球员上场:[11,22,33,44,55].
           3):查询指定位置的球员的球衣号码是多少.查询索引位置为2的球衣号码是:33.
           4):根据球衣号码查询该球员在场上的索引位置. 44球衣号的球员在场上的索引位置是:3.
           5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333. 333把33替换了.
           6):替换球衣号码为22的球员,替换之后为222.
           7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位.).
           8):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55].

 * 
 */
public class MyArrayList {
	public static void main(String[] args) {
		//需求
		//1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码.
		PlayersMatch p = new PlayersMatch(5);
		
		//2):安排5个球员上场:[11,22,33,44,55].
		p.add(11);
		p.add(22);
		p.add(33);
		p.add(44);
		p.add(55);
		
		// 3):查询指定位置的球员的球衣号码是多少.查询索引位置为2的球衣号码是:33.
		System.out.println(p.inquireNumber(2));
		
		// 4):根据球衣号码查询该球员在场上的索引位置. 44球衣号的球员在场上的索引位置是:3.
		System.out.println(p.inquireIndex(44));
		
		// 5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333. 333把33替换了.
		p.replaceIndex(2, 333);
		//p.print();
		
		//6):替换球衣号码为22的球员,替换之后为222.
		p.replaceNumber(22, 222);
		
		//7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位.)
		//p.delete(2);
		p.deleteSwap(1);
		
		//8):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55].
		System.out.println(p.toString());
		
		//打印数组players
		p.printAll();
		
		System.out.println(p.count());
		p.clean();
		p.printAll();
	}
}

class PlayersMatch{
	Integer[] players = null;
	private static final int DEFAULT = 5; 
	private int count;   //场上球员的人数,默认0
	
	PlayersMatch(){
		this.players = new Integer[DEFAULT];
	}
	
	PlayersMatch(int i){
		if(i < 0){
			throw new NegativeArraySizeException("容量不能为负数或零");
		}
		this.players = new Integer[i];
	}
	
	//添加球员功能
	public void add(Integer number){
		if (number < 0) {
			throw new IllegalArgumentException("不能为负数");
		}
		if (count == players.length ) {
			Integer[] newArr = new Integer[players.length * 2];
			System.arraycopy(players, 0, newArr, 0, Math.min(players.length, newArr.length));
			players = newArr;
		}
		players[count ++] = number;
		//count ++;
	}
	
	//查询功能---根据索引查询球衣号码
	public Integer inquireNumber(int index){
		if (index < 0 || index > count) {
			throw new IllegalArgumentException("索引越界");
		}
		return players[index];
	}
	
	//查询功能--->根据球衣号码查询索引-->若没有返回-1
	public int inquireIndex(Integer number){
		if (number < 0) {
			throw new IllegalArgumentException("球衣号码不能为负数");
		}
		
		for (int i = 0; i < count; i++) {
			if (players[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	//修改功能-->根据索引位置-->替换该位置的球员号
	public void replaceIndex(int index, Integer number){
		if (index < 0 || index > count) {
			throw new IllegalArgumentException("索引越界");
		}
		if (number < 0) {
			throw new IllegalArgumentException("球衣号码不能为负数");
		}

		players[index] = number;
	}
	
	//修改功能--->根据球衣号码--->替换该号码的球员号
	public void replaceNumber(Integer num1, Integer num2){
		if (num1 < 0 || num2 < 0) {
			throw new IllegalArgumentException("球衣号码不能为负数");
		}
		
		int index = this.inquireIndex(num1);
		players[index] = num2;
	}
	
	//删除功能  -->把索引为index的球员罚下场
	public void delete(int index){
		if (index < 0 || index > count) {
			throw new IllegalArgumentException("索引越界");
		}
		
		for (int i = index; i < count - 1; i++) {
			players[index] = players[index + 1];
		}
		players[count - 1] = null;
		count --;
	}
	
	////删除功能2  -->把索引为index的球员罚下场
	public void deleteSwap(int index){
		if (index < 0 || index > count) {
			throw new IllegalArgumentException("索引越界");
		}
		
		for (int i = index; i < count - 1; i++) {
			Swap.swap(players, index, index + 1);
		}
		players[count - 1] = null;
		count --;
	}
	

	//打印功能
	public String toString(){
		if (players == null) {
			return null;
		}
		if (count == 0) {
			return "[]";
		}
		StringBuilder str = new StringBuilder(count * 3 + 1);
		str.append("[");
		for (int i = 0; i < count; i++) {
			if(i == (count - 1)){
				str.append(players[i] + "]");
			}else{
				str.append(players[i] + ",");
			}
		}
		return str.toString();
	}
	
	//清理数组 
	public void clean(){
		players = new Integer[DEFAULT];
	}
	
	//打印数组长度
	public int count(){
		return count;
	}
	
	//打印当前数组players的所有元素
	public void printAll(){
		System.out.println("========分割线=======");
		for (int i = 0; i < players.length; i++) {
			System.out.print(players[i] + " ");
		}
	}
	
}

class Swap{
	//   ---->  整数 数组交换位置--->只用于整数数组
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