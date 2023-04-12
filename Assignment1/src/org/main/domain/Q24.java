package org.main.domain;

public class Q24 {
	public static void main4(String[] args) {
		float f = 1542.12f;
		String s = Float.toHexString(f);
		System.out.println(s);
	}
	public static void main(String[] args) {
		//24c
		String s = new String("15457");
		Float f = Float.parseFloat(s);
		System.out.println(f);
	}
	public static void main2(String[] args) {
		//24b
		float f = 565.25f;
		Float fl = Float.valueOf(f);
		System.out.println(fl);
	}

	public static void main1(String[] args) {
		//24a
		float f = 252.21f;
		String s = Float.toString(f);
		System.out.println(s);
		
	}

}
