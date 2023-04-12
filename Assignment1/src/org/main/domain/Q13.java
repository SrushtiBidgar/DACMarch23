package org.main.domain;

public class Q13 {
	//13c
	public static void main(String[] args) {
		String str = new String("1231");
		Short s = Short.parseShort(str);
		System.out.println(s);
	}
	//13b
	public static void main2(String[] args) {
		Short s = Short.valueOf((short) 1221);
		System.out.println(s);
	}

	public static void main1(String[] args) {
		//13a
		Short s = 1221;
		String str = Short.toString(s);
		System.out.println(str);
	}

}
