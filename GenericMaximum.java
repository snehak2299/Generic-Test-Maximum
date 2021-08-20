package com.bridglab.corejava;

public class GenericMaximum {
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
		
	}	
}
