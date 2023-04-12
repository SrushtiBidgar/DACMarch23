package org.main.domain;

public class Q20 {
	public static void main1(String[] args) {
		//20d
		long l = 12541466l;
		String b = Long.toBinaryString(l);
		System.out.println(b);
		String h = Long.toHexString(l);
		System.out.println(h);
		String o = Long.toOctalString(l);
		System.out.println(o);
		
	}
	public static void main3(String[] args) {
		//20c
		String str = new String("1245212");
		long l = Long.parseLong(str);
		System.out.println(l);
	}
	public static void main2(String[] args) {
		//20b
		long l = 454154755l;
		Long li = Long.valueOf(l);
		System.out.println(li);
		}

	public static void main(String[] args) {
		//20a
		long l = 1547555l;
		String s = Long.toString(l);
		System.out.println(s);
		}

}
