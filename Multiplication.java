public class Multiplication
{	
	public static void main(String[]args)
	{	
		System.out.println("Question 1");
		System.out.println("\t\t" +"10x10 Mutiplication Table");
		
		for (int row =1 ; row<=10 ; row ++)
		{
			System.out.print("\t<" + row + ">");

		}
		System.out.print("\n");

		for (int row =1 ; row<=10 ; row ++)
		{	
			for (int column= 1; column<= 10; column++)
			{
				if (column == 1)
				{
					System.out.print("<" + row + ">" + "   ");
				}
				System.out.print("\t"+column*row+ "  ");	
			}
			System.out.print("\n\n\n");
		}

		System.out.println("Question 2");
		int maxRow = (int)(Math.random( ) * 10+1);
		int maxCol = (int)(Math.random( ) * 10+1);
		System.out.println("\t\t" +"maxRow and maxCol Mutiplication Table" + " ( with row equals to " + maxRow + " and column equals to " + maxCol + " )" );

		for (int row =1 ; row<=maxCol ; row ++)
		{
			System.out.print("\t<" + row + ">");

		}
		System.out.print("\n");

		for (int row =1 ; row<=maxRow ; row ++)
		{	
			for (int column= 1; column<= maxCol; column++)
			{
				if (column == 1)
				{
					System.out.print("<" + row + ">" + "   ");
				}
				System.out.print("\t"+column*row+ "  ");	
			}
			System.out.print("\n\n\n");
		}

		System.out.println("Question 3");
		maxRow = (int)(Math.random( ) * 10+1);
		maxCol = (int)(Math.random( ) * 10+1);
                getMultiplication(10,10);
		getMultiplication(maxRow ,maxCol);
		System.out.print("\n\n\n");
		System.out.println("Question 4");
		getMultiplicationWhile(10,10);
		getMultiplicationWhile(maxRow ,maxCol);

	}
	
	static void getMultiplication (int maxRow, int maxCol)
	{
		System.out.println("\t\t" + maxRow + " and " + maxCol + " Mutiplication Table");

		for (int row =1 ; row<=maxCol ; row ++)
		{
			System.out.print("\t<" + row + ">");

		}
		System.out.print("\n");

		for (int row =1 ; row<=maxRow ; row ++)
		{	
			for (int column= 1; column<= maxCol; column++)
			{
				if (column == 1)
				{
					System.out.print("<" + row + ">" + "   ");
				}
				System.out.print("\t"+column*row+ "  ");	
			}
			System.out.print("\n");
		}
	}

	static void getMultiplicationWhile (int maxRow, int maxCol)
	{
		System.out.println("\t\t" + maxRow + " and " + maxCol + " Mutiplication Table");

		for (int row =1 ; row<=maxCol ; row ++)
		{
			System.out.print("\t<" + row + ">");

		}
		System.out.print("\n");
		
		int count = 1;
		while(count <= 10)
		{	
			for (int column= 1; column<= maxCol; column++)
			{
				if (column == 1)
				{
					System.out.print("<" + count + ">" + "   ");
				}
				System.out.print("\t"+column*count+ "  ");	
			}
			System.out.print("\n");
			count++;
		}
	}		
}

