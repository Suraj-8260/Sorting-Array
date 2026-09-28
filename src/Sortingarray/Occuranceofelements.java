package Sortingarray;

public class Occuranceofelements {
	public static void main(String[] args)
	{
		int[] a= {10,50,10,20,50,10,3};
		int[] copy=new int[a.length];
		for(int i=0;i<copy.length;i++)
		{
			copy[i]=a[i];
		}
		printoccurance(a);
	}
	public static void printoccurance(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			if(a[i]!=0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j]) {
						c++;
						a[j]=0;
					}
				}
				System.out.println(a[i]+"->"+c);
			}
		}
	}
}
