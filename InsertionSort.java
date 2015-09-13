/**
 * @(#)InsertionSort.java
 *
 *
 * @author 
 * @version 1.00 2015/8/13
 */

public class InsertionSort {
        
   
    public static void main(String[] args) {
       
       int array[] = {2,3,4,1,5,9,8,6,7};
       InsertionSort s= new InsertionSort();
       
       for(int i=1;i<array.length;i++)
       {
       		array = s.insertAt(array,0,i-1,i);
       }
       
       for(int i=0;i<array.length;i++)
       {
       		System.out.println(array[i]);
       }
    }
    
    public int[] insertAt(int[] array,int start, int end, int index)
    {
    	int newIndex=index;
    	
    	for(int i=start;i<=end;i++)
    	{
    		if(array[index]<array[i])
    		{
    			newIndex=i;
    			break;
    		}
    		
    		else if(array[index]>array[i] && array[index]<array[i+1])
    		{
    			newIndex= i+1;
    			break;
    		}
    	}
    	
    	int temp = array[index];
    	for(int i= index;i>=newIndex+1;i--)
    	{
    		array[i]=array[i-1];
    	}
    	array[newIndex] =temp;
    	
    	return array;
    }
}
