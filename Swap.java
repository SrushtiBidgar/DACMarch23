class Swap1{
	public static void main(String args[])
	{
		int x=105;
		int y=55;
		int temp;
		
		System.out.println("Number Before: x="+x +"y="+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("Number After: x="+x +"y="+y);
		
		
	}
}
class Swap{
	public static void main(String args[])
	{
		int x = 110;
		int y = 500;
		
		y = (x+y)-(x=y);
		System.out.println("x= "+x + "y= "+y);
	}
}