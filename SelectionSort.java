/**
 * @(#)SelectionSort.java
 *
 *
 * @author 
 * @version 1.00 2015/8/13
 */

public class SelectionSort {
        
    
    public static void main(String[] args) {
       
       int array[] = {2,3,4,1,5,9,8,6,7};
       SelectionSort s = new SelectionSort();
       int minIndex;
       
       for(int i=0;i<array.length;i++)
       {
       		System.out.println(i+" index: "+array[i]);
       }
       for(int i=0;i<array.length;i++)
       {
       		minIndex = s.min(array,i,array.length-1);
       		System.out.println("min index: "+minIndex+" element is: "+array[minIndex]);
       		
       		array = s.swap(array,i,minIndex);
       }
       
       for(int i=0;i<array.length;i++)
       {
       		System.out.println(array[i]);
       }
       
    }
    
    public int min(int array[],int start,int end)
    {
    	int m = array[start];
    	int minIndex=start;
    	int i=0;
    	for(i=start+1;i<=end;i++)
    	{
    		if(m>array[i])
    		{
    			m = array[i];
    			minIndex = i;
    		}
    	}
    	
    	return minIndex;
    }
    
    public int[] swap(int array[],int first,int second)
    {
    	int temp = array[first];
    	array[first]= array[second];
    	array[second]=temp;
    	
    	return array;
    }
}
