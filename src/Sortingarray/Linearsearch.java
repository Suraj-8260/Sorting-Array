package Sortingarray;

import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args)
	{
		int[] a= {15,20,3,5,8,30};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element to search :");
		int n=sc.nextInt();
		boolean ch=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("element found at index"+i);
				ch=true;
				break;
			}
		}
		if(!ch)
			System.out.println("element not found");
	}
}
