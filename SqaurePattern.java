
public class SquarePattern {

	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i == 0 || j == 0 || i == n-1 || j == n-1)
				{
					System.out.print(ConsoleColors.BLUE+ " *");
				}
				else
				{
					System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
				}
			}
			System.out.println();
		}

	}

}
