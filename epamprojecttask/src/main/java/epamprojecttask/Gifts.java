package epamprojecttask;

import java.util.*;

public class Gifts {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int w[]=new int[n];
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
			
		}
		int low,high;
		low=sc.nextInt();
		high=sc.nextInt();
		Choclates c= new Choclates();
		Sweets s=new Sweets();
		System.out.println(s.weight(w,low,high)+c.weight(w,low,high));
		System.out.println(s.count(w,low,high)+c.count(w,low,high));
		
		
	}
}
