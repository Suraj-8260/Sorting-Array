package Sortingarray;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args)
	{
		int[] a= {20,10,50,80,5};
		bubblesort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void bubblesort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j=j+1)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
