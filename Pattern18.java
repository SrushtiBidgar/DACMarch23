class Pattern18
{
	public static void main(String args[])
	{
		int a=65;
		for(int i=4; i>=0; i--)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char)(j+a)+"   ");
			}
			System.out.println(  );
		}
	}
}