package com.bridglab.corejava;

public class GenericMaximum<T extends Comparable<T>> {
	T name1,name2,name3;
	
	
	public GenericMaximum(T name1, T name2, T name3) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
	}
	public void maximum() {
		maximum(name1,name2,name3);
	}

	public static <T extends Comparable<T>> void maximum(T name1, T name2, T name3) {
		int max = name1.compareTo(name2);
		int max1 = name2.compareTo(name3);
		if(max>=1 && max1>=1) {
			System.out.println(name1+ " has maximum value");
		}
		else if (max==0 && max1==0) {
			System.out.println(name1 +","+ name2+","+ name3+" are equal");
		}
		else if(max<=1 && max1>=1) {
			System.out.println(name2 +" has maximum value");
		}
		else if((max<1 && max1<1)||(max>=1 && max1<=1))
			System.out.println(name3 +" has maximum value");
		
	}
	
	public static void main(String[] args) {
		String name1="apple", name2="peach", name3="banana";
		maximum(name1,name2,name3);
		Integer number1= 20, number2=30, number3=90;
		maximum(number1,number2,number3);
		Float num1=4.7f, num2=1.9f, num3=5.1f;
		maximum(num1,num2,num3);
		
		//refactor 2 using generic class
		new GenericMaximum(name1,name2,name3).maximum();
		new GenericMaximum(number1,number2,number3).maximum();
		new GenericMaximum(num1,num2,num3).maximum();
		
	}	
}
