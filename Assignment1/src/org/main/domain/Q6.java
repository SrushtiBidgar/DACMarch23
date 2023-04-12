package org.main.domain;

public class Q6 {
	public static void main(String[] args) {
		String str = "false";
		Boolean b = Boolean.valueOf(str);
		System.out.println(b);
	}
	public static void main3(String[] args) {
		//6c
		String str = "false";
		Boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
	}
	
	public static void main2(String[] args) {
		//6b
		Boolean b= true;
		Boolean bool = Boolean.valueOf(b);
		System.out.println(bool);
	}

	public static void main1(String[] args) {
		// 6a
		Boolean b = true;
		String s = String.valueOf(b);
		
		System.out.println(s);
	}

}
