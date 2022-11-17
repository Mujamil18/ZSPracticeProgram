
public class DigitFive 
{
	public static void main(String[] args)
	{
		DigitFive digit = new DigitFive();
		int min=100, max=1000;
		System.out.println(digit.countNumbers(min, max));
		
	}
	//counting numbers which has at least one digit five
	public int countNumbers(int min, int max)
	{
		int count=0, rem=0, num;
		for(int i=min; i<max; i++)
		{
//			System.out.println("Checking whether the number contains 5 or not");
			num =i;
			while(num>0)
			{
				rem = num%10;
				if(rem == 5)
				{
					count++;
					break;
				}
				else
				{
				   num/=10;
				}
			}
		}
		return count;
	}

}
