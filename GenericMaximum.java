package com.bridglab.corejava;

public class GenericMaximum {
	public static void main(String[] args) {
		String name1="apple", name2="peach", name3="banana";
		int max = name1.compareTo(name2);
		int max1 = name2.compareTo(name3);
		if(max>=1 && max1<=1) {
			System.out.println(name1+ " has maximum string value");
		}
		else if (max==0 && max1==0) {
			System.out.println(name1 +","+ name2+","+ name3+" are equal");
		}
		else if(max<=1 && max1>=1) {
			System.out.println(name2 +" has maximum string value");
		}
		else if(max<1 && max1<1)
			System.out.println(name3 +" has maximum string value");
			
		
	}	
}
