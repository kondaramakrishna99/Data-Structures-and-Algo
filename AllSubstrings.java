/**
 * @(#)AllSubstrings.java
 *
 *
 * @author 
 * @version 1.00 2015/8/22
 */

public class AllSubstrings {
        
    
    public static void main(String[] args) {
       
       AllSubstrings s = new AllSubstrings();
       s.permutation("", "ABCD");
    }
    
    public void permutation(String prefix, String str)
    {
    	int n=str.length();
    	if(n==0)
    	{
    		System.out.println(prefix);
    	}
    	else{
    		for(int i=0;i<n;i++)
    		{
    			permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
    		}
    	}
    	
    }
}
