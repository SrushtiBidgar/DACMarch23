package org.main.domain;

public class Q16 {
	public static void main(String[] args) {
		//16d
		int i = 1231;
		String b = Integer.toBinaryString(i);
		System.out.println(b);
		String h = Integer.toHexString(i);
		System.out.println(h);
		String o = Integer.toOctalString(i);
		System.out.println(o);
		
		
	}
	public static void main3(String[] args) {
		//16c
		String s = new String("1231");
		Integer i = Integer.valueOf(s);
		System.out.println(i);
	}
	public static void main2(String[] args) {
		//16b
		int i = 1211;
		Integer integer = Integer.valueOf(i);
		System.out.println(i);
	}

	public static void main1(String[] args) {
		//16a
		int i = 1241;
		String s = Integer.toString(i);
		System.out.println(s);
		
	}

}
