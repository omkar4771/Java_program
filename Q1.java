package program_200;

/* Write a java program to accept names of 'n' cities, insert same 
into array list collection and display the same array remove all toese element*/

import java.util.*;
public class Q1
{

	public static void main(String[] args) 
	{
		String c;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of cities");
		n=sc.nextInt();
		ArrayList a1=new ArrayList();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter city name"+i+" :");
			c=sc.next();
			a1.add(c);
		}
		System.out.println("cities are :");
		System.out.println(a1);
		a1.removeAll(a1);
		System.out.println("After removing the content are :"+a1);

	}

}
