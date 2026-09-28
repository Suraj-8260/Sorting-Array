package Sortingarray;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args)
	{
		int[] a= {80,20,5,51,12,49,1,25,45,56,50};
		int ele=49;
		Arrays.sort(a);
		int si=0;
		int ei=a.length-1;
		boolean check=false;
		while(si<=ei)
		{
			int mid=(si+ei)/2;
			if(ele==a[mid])
			{
				System.out.println("element found....");
				check=true;
				break;
			}
			else if(ele>a[mid])
				si=mid+1;
			else if(ele<a[mid])
				ei=mid-1;	
		}
		if(check)
			System.out.println("element found.....");
		else
			System.out.println("elements not found.....");
	}
}
