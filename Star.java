class Star1 {
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println( );
		}
	}
}


class Star2{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}

class Star3 {
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}

class Star4 {
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}

class Star5 {
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
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

class Star10{
	public static void main(String args[])
	{
           for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=5; k++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}

    }
}

class Star11{
	public static void main(String args[])
	{
           for(int i=5; i>=1; i--)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=5; k++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}

    }
}

class Star {
	public static void main(String args[])
	{
		for(int i=1; i<=5;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int k1=4; k1>=i; k1--)
			{
			     System.out.print("*");	
			}
			System.out.println( );
		}
	}
}