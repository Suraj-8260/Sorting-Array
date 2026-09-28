package Sortingarray;

public class Distinctelement {
	 public static void main(String[] args) {

	        int[] a = {10,20,20,30,40,40,50};

	        for(int i=0;i<a.length;i++)
	        {
	            int c = 0;

	            for(int j=0;j<a.length;j++)
	            {
	                if(a[i] == a[j])
	                {
	                    c++;
	                }
	            }

	            if(c == 1)
	            {
	                System.out.println(a[i]);
	            }
	        }
	    }
}
