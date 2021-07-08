package com.practice;

public class PracticeSWAP {
int a=10;
int b=40;
void getSwap() {
	System.out.println("the value of a is="+a);
	System.out.println("the value of a is="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("the value after swap a="+a);
	System.out.println("the value after swap b="+b);
}
public static void main(String[] args) {
	 PracticeSWAP obj= new  PracticeSWAP();
	 obj.getSwap();
}
}
