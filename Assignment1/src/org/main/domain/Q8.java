package org.main.domain;

public class Q8 {
	public static void main(String[] args) {
		//8c
		String s = new String("123");
		Byte b = Byte.valueOf(s);
		System.out.println(b);
	}
	public static void main2(String[] args) {
		    //8b
		byte b = 123;
		Byte bInst = Byte.valueOf((byte) 123);
		System.out.println(bInst);
	}
           
	

	public static void main1(String[] args) {
		//8a
		byte b = 123;
		String s = Byte.toString(b);
		System.out.println(s);
		
	}

}
