/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a={1,2,3,4,5};
	    int k=array_max(a);
	    int x=array_sum(a);
	    System.out.println("largest element="+k);
	    System.out.println("sum of elements="+x);
	}
	
	 public static int array_max(int[] a)
	  {
	       int max=a[0];
	       for(int i=0;i<a.length;i++)
	        {
	             if(a[i]>max)
	              max=a[i];
	        }
	        return max;
	  }
	   
	  public static int array_sum(int[] a)
	  {
	       int s=0;
	       for(int i=0;i<a.length;i++)
	            s+=a[i];
	       return s;     
	        
	  }
}
