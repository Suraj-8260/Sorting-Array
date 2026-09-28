package Sortingarray;

import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args)
	{
		int[] a= {18,5,24,24,52,1,7,45};
		selectionsort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void selectionsort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int minindex=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minindex])
					minindex=j;
			}
			int temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;
		}
	}
}
