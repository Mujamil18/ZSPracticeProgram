import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator 
{
   public static void main(String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter a number");
	   int input = scanner.nextInt();
	   FactorialCalculator calculator= new FactorialCalculator();
	   System.out.println(calculator.calculateFactorial(input));   	   
   }
   
   public BigInteger calculateFactorial(int number)
   {
	   BigInteger factorial= new BigInteger("1");
	   for(int i=1; i<=number; i++)
	   {
		  factorial = factorial.multiply(new BigInteger(""+i));  
	   }
	   return factorial;
   }
}
