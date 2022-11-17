import java.util.Scanner;

public class MagicNumber 
{
	public static void main(String[] args)
	{
		MagicNumber magic = new MagicNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a three digit number");
		int input=scanner.nextInt();
		//Step 1: getting reverse of the input number
		//step 2: getting difference
		//step 3: taking reverse of the output
		//step 4: adding the original(difference) number and reverse number
		//step 5: result will be 1089.1089 is magic number.
	    int num= input;
		if(num == magic.reverseInput(input))
		{
			System.out.println("Number should not be a palindrome. Try again!");
		}
		else
		{	
		int reverse = magic.reverseInput(input);
		int difference = magic.getDifference(input, reverse);
		int diffReverse = magic.reverseInput(difference);
		int sum = magic.sum(difference, diffReverse);
		System.out.println("The result is " + sum);
		System.out.println("Yes!, " + sum + " is a magic number");
		}
	}
	//Reversing the Number
	public int reverseInput(int input)
	{
		int reverse =0, rem=0;
		while(input > 0)
		{
		   rem = input % 10;
		   reverse = (reverse*10)+ rem;
		   input/=10;
		}
		return reverse;
	}
	//get the difference of the reversed number
	public int getDifference(int input, int reverse)
	{
		int difference = reverse - input;
		return Math.abs(difference);
	}
	//Adding the reversed number
	public int sum(int difference, int diffReverse)
	{
		return difference+diffReverse;
	}
}
