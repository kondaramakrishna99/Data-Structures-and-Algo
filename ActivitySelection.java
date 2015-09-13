/**
 * @(#)ActivitySelection.java
 *
 *
 * @author 
 * @version 1.00 2015/8/16
 */
import java.util.ArrayList;
public class ActivitySelection {
        
    int s[] = {1,3,0,5,8,5};
    int f[] = {2,4,6,7,9,9};
    
    public static void main(String[] args) {
    	
    
    	 ActivitySelection p = new ActivitySelection();
    	 p.sort(); 
  		
    	 System.out.print("0 ");
    	 int lastItem=0;
    	 for(int i=1;i<p.s.length;i++) 
    	 {
    	 	if(p.s[i]>p.f[lastItem])
    	 	{
    	 		System.out.print(i+" ");
    	 		lastItem=i;
    	 	}
    	 }
    }
    
    public void sort()
    {
    	for(int i=0;i<this.f.length;i++)
    	{
    		int minIndex=i;
    		for(int j=i;j<this.f.length;j++)
    		{
    			if(f[j]<f[i])
    			{
    				minIndex = j;
    			}
    		}
    		int temp=this.f[i];
    		this.f[i]=this.f[minIndex];
    		this.f[minIndex]=temp;
    		
    		int temp1=this.s[i];
    		this.s[i]=this.s[minIndex];
    		this.s[minIndex]=temp1;
    	}
    }
    
}
