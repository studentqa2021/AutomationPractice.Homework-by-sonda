package com.generic;

public class PracticeLoop {
	int a=20;
	int b= 40;
	public void getSwap() {
	
	System.out.println("before Swap a value=" + a);	
	System.out.println("before Swap a value=" + b);	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after Swap a value=" + a);	
	System.out.println("after Swap a value=" + b);
	
	}
	public static void main(String[] args) {
		new PracticeLoop().getSwap();
	}
}
	
	/*static String name="Smart Tech";
	public static void getReverse(String name){
		for(int i=(name.length()-1); i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}
		public static void main(String[] args) {
			getReverse("Sonda");
			
		

		}
	}
	
	/*	System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(7));
		System.out.println(name.charAt(name.length()-1));
	*/	
		
/*	for(int i=0;i<name.length();i++) {
		//System.out.print(name.charAt(i));
		System.out.println(name.charAt(i));
		
	}	*/
		
	/*for(int i=(name.length()-1); i>=0;i--) {
		System.out.print(name.charAt(i));
		//System.out.println(name.charAt(i));	
		
	
		//for(int i=0;i<=100;i++) {// +ve loop
		//	System.out.println(i);
			//for(int j=100;j>=0;j--) { -ve loop
		//	System.out.println(j);	
		//	}
			
			//for(int j=100;;j--) {//infinite loop
			//		System.out.println(j);	
		//if(j==60) {//condition(primitive data type)equal==,not equal!=)
		//break;	
		//}
		//			
	//	}
			
		}
	}*/


