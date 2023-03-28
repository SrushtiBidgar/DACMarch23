class Pyramid1 {
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=9; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(i+" ");
			}
			System.out.println( );
		}
	}
}

class Pyramid2 {
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=9; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println( );
		}
	}
}

class Pyramid3 {
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=9; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
	}
}

class Pyramid4 {
	public static void main(String args[])
	{
		for(int i=1; i<=9;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int k=9; k>=i; k--)
			{
				System.out.print(i+" ");
			}
			for(int k1=8; k1>=i; k1--)
			{
			     System.out.print(k1+" ");	
			}
			System.out.println( );
		}
	}
}



class Pyramid5 {
	public static void main(String args[])
	{
		for(int i=9; i>=1;i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int k=i; k<=9; k++)
			{
				System.out.print(k+" ");
			}
			for(int k1=8; k1>=i; k1--)
			{
			     System.out.print(k1+" ");	
			}
			System.out.println( );
		}
	}
}



class Pyramid6 {
	public static void main(String args[])
	{
		for(int i=1; i<=9;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=9; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int k1=8; k1>=i; k1--)
			{
			     System.out.print("*");	
			}
			System.out.println( );
		}
	}
}

class Pyramid {
	public static void main(String args[])
	{
		for(int i=1; i<=9;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=9; k>=i; k--)
			{
				System.out.print(k+" ");
			}
			for(int k1=8; k1>=i; k1--)
			{
			     System.out.print(" ");	
			}
			System.out.println( );
		}
	}
}

class HalfPyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}


class InvertedHlfPyramid {
	public static void main(String args[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}


class FullPyramid {
	public static void main(String args[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
	}
}


class InvertedFullPyramid {
	public static void main(String args[])
	{
		for(int i=1; i<=6;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6; k>=i; k--)
			{
				System.out.print("* ");
			}
			for(int k1=5; k1>=i; k1--)
			{
			     System.out.print(" ");	
			}
			System.out.println( );
		}
	}
}

