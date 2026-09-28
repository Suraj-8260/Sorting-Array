package Sortingarray;

public class Uniqueelement {
	public static void main(String[] args)
	{
		int[] a= {80,7,40,60,80,40,60,20,3};
		System.out.println("unique elements are :");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}
