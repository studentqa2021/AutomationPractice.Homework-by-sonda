package com.practice;

public class PracticeRevese {
	
public static void getRevese(String name){
	
	for(int i=(name.length()-1);i>=0;i--) {
		//System.out.println(name.charAt(i));
		System.out.print(name.charAt(i));
	}
	
}
public static void getReversewithStringBuilder(String name) {
	StringBuilder obj=new StringBuilder(name);
	System.out.println(obj.reverse());
}
public static void main(String[] args) {
	PracticeRevese.getRevese("BANGLADESH");
	System.out.println("");
	PracticeRevese.getReversewithStringBuilder("UNITED OF STATE");
}
}
