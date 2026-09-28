package Sortingarray;

public class Removeduplicate {
	 public static void main(String[] args) {

	        int[] a = {10,20,20,30,40,40};

	        for(int i=0;i<a.length;i++)
	        {
	            boolean duplicate = false;

	            for(int j=0;j<i;j++)
	            {
	                if(a[i] == a[j])
	                {
	                    duplicate = true;
	                    break;
	                }
	            }

	            if(!duplicate)
	            {
	                System.out.print(a[i] + " ");
	            }
	        }
	    }
}
