package com.bridglab.corejava;

public class GenericMaximum<T extends Comparable<T>> {
	T name1,name2,name3,name4;
	
	
	public GenericMaximum(T name1, T name2, T name3, T name4) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4; //added 4th parameter
	}
	public void maximum() {
		maximum(name1,name2,name3,name4);
	}

	public static <T extends Comparable<T>> void maximum(T name1, T name2, T name3,T name4) {
		T max = name1;
		if(name2.compareTo(max) > 0) {
			max = name2;
		}
		if(name3.compareTo(max) > 0) {
			max = name3;
		}
		if(name4.compareTo(max) > 0) {
			max = name4;
		}
		
		System.out.println(max);
		
		
	}
	
	public static void main(String[] args) {
		String name1="apple", name2="peach", name3="banana", name4 ="coconut";
		maximum(name1,name2,name3,name4);
		Integer number1= 20, number2=30, number3=90, number4 = 110;
		maximum(number1,number2,number3,number4);
		Float num1=4.7f, num2=1.9f, num3=5.1f, num4=7.1f;
		maximum(num1,num2,num3,num4);
		
		//refactor 2 using generic class
		new GenericMaximum(name1,name2,name3,name4).maximum();
		new GenericMaximum(number1,number2,number3,number4).maximum();
		new GenericMaximum(num1,num2,num3,num4).maximum();
		
	}	
}
