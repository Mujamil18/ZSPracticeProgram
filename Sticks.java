

/*There are number of elements in an array arr = [ 1, 2, 3]
 * Take the smallest elemnt and subtract that elemnt with the other elemnt,
 * Return the number of elements in that array
 * Repeat the steps until the array length becomes zero.
 * Return the count of the elements in all the iterations.
 */
import java.util.*;
public class Sticks 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Sticks stick= new Sticks();
		System.out.println("Enter the number of sticks");
		int n= input.nextInt();
		System.out.println("Enter the numbers");
		int[] sticks = new int[n];
		for(int i=0; i<n; i++)
		{
			sticks[i] = input.nextInt();
		}
		int min;
	
		while(stick.getElementCount(sticks) != 1)
		{
//			n = stick.getElementCount(sticks);
			min = stick.getSmallestValue(sticks);
			System.out.println(min);
			int[] result = new int[n];
			result = stick.getNewArray(min, sticks);
			System.out.println("Array " + Arrays.toString(result));	
			sticks = result;
		}
	}
	public int getSmallestValue(int[] arr)
	{
		int min=arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i+1] < min)
			{
				min = arr[i+1];
			}
		}
		return min;
	}
	public int[] getNewArray(int min, int[] arr)
	{
		int n=arr.length-1;
		int[] newArray=new int[n];
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != min)
			{
//				System.out.println(i + " " + arr[i]);
				newArray[j]= arr[i]-min;
				j++;
			}
		}
		return newArray;
	}
	public int getElementCount(int[] arr)
	{ 
		return arr.length;
	}

}
