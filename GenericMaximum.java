package com.bridglab.corejava;

public class GenericMaximum {
	public static void main(String[] args) {
		Integer number1=10, number2=10, number3=10;
		int max = number1.compareTo(number2);
		int max1 = number2.compareTo(number3);
		if(max==1 && max1<0) {
			System.out.println(number1+ " is maximum number");
		}
		else if (max==0 && max1==0) {
			System.out.println(number1 +","+ number2+","+ number3+" are equal");
		}
		else if(max<1 && max1==1) {
			System.out.println(number2 +" is maximum number");
		}
		else if(max<1 && max1<1)
			System.out.println(number3 +" is maximum number");
			
		
	}	
}
