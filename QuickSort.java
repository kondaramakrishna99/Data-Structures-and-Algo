/**
 * @(#)QuickSort.java
 *
 *
 * @author 
 * @version 1.00 2015/8/14
 */
import java.util.Stack;
public class QuickSort {
       
    static int array[] = {2,3,4,1,5,9,8,6,7,0,-2};
    
    public static void main(String[] args) {
          
       QuickSort s = new QuickSort();
       s.quickSort(0,s.array.length-1);
       for(int i=0;i<s.array.length;i++)
       {
       		System.out.println(i+" index: "+s.array[i]);
       }   
    }
     public void quickSort(int start,int end)
    {
    	if(start>=end || end<=0)
    	{
    		return;
    	}
    	int p = partition(start,end);
		
        swap(p,start);
        
       	quickSort(start,p-1);	
    	quickSort(p+1,end);
       			
    }
    
    public int partition(int start,int end)
    {
    	int i=start;
    	for(int j=i+1;j<=end;j++)
    	{
    		if(array[j]<=array[start])
    		{
                    swap(i+1,j);
                    i++;        
    		}
    	}
    	return i;
    }
    
    public void swap(int first,int second)
    {
    	int temp = array[first];
    	array[first]=array[second];
    	array[second]=temp;
    }
}
