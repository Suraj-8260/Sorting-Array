package Sortingarray;

import java.util.Arrays;

public class Leftrotation {
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5};
		int n=3;
		for(int i=1;i<=n;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
			//System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
}
