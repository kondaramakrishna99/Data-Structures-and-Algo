/**
 * @(#)BubbleSort.java
 *
 *
 * @author 
 * @version 1.00 2015/8/13
 */

public class BubbleSort {
        
    
    public static void main(String[] args) {
       int array[] = {2,3,4,1,5,9,8,6,7};
       
       
       for(int i=0;i<array.length;i++)
       {
       		for(int j=0;j<array.length;j++)
       		{
       			int temp=0;
       			if((j+1)!=array.length&&array[j+1]<array[j])
       			{
       				temp=array[j];
       				array[j]=array[j+1];
       				array[j+1]=temp;			
       			}
       		}
       }
       
       for(int i=0;i<array.length;i++)
       {
       		System.out.println(array[i]);
       }
       
    }
    
    public int[] swap(int array[],int first,int second)
    {
    	int temp = array[first];
    	array[first]= array[second];
    	array[second]=temp;
    	
    	return array;
    }
}
