/**
 * @(#)MergeSort.java
 *
 *
 * @author 
 * @version 1.00 2015/8/13
 */
import java.util.Arrays;
public class MergeSort {
        
    
    public static void main(String[] args) {
        int array[] = {2,3,4,1,5,9,8,6,7,0};
        MergeSort s= new MergeSort();
        array = s.mergesort(array);
        
       for(int i=0;i<array.length;i++)
       {
       		System.out.println(i+" index: "+array[i]);
       }
    }
    
    public int[] mergesort(int[] array)
    {
    	MergeSort s= new MergeSort();
    	
    	if(array.length<=1)
    	{
    		System.out.println("leaf node "+array[0]);
    		return array;
    	}
    	
    	int middle=(int)Math.floor(array.length/2);
 
    	int[] array1 = s.mergesort(Arrays.copyOfRange(array,0,middle));
    	int[] array2 = s.mergesort(Arrays.copyOfRange(array,middle,array.length));
    	array = s.merge2(array1,array2);
 
    	return array;
    }
    
    public int[] merge(int[] array1,int[] array2 )
    {
    	int[] mergeArray = new int[array1.length+array2.length];
    	
    	for(int i=0;i<array1.length;i++)
    	{
    		mergeArray[i]=array1[i];
    	}
    	for(int j=0;j<array2.length;j++)
    	{
    		mergeArray[array1.length+j]=array2[j];
    	}
    	
      
       for(int i=array1.length;i<mergeArray.length;i++)
       {
       		MergeSort s =new MergeSort();
       		mergeArray = s.insertAt(mergeArray,0,i-1,i);
       }
       
      
    	
    	return mergeArray;
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
    
    public int[] merge2(int[] array1, int[] array2)
    {
    	int a1=0;
    	int b1=0;
    	
    	if(array1.length==0)
    		return array2;
    	if(array2.length==0)
    		return array1;
    		
    	int mergeArray[] = new int[array1.length+array2.length];
    	int i=0;
    	for(i=0;i<mergeArray.length;i++)
    	{
    		if(array1[a1]<array2[b1])
    		{
    			mergeArray[i]=array1[a1];
    			a1++;
    		}
    		
    		else 
    		{
    			mergeArray[i]= array2[b1];
    			b1++;
    		}
    		
    		if(a1==array1.length || b1==array2.length)
    		{
    			break;
    		}
    	}
    	
    	if(a1==array1.length)
    	{
    		for(int k=b1;k<array2.length;k++)
    		{
    			mergeArray[++i]=array2[b1++];
    		}
    	}
    	
    	if(b1==array2.length)
    	{
    		for(int k=a1;k<array1.length;k++)
    		{
    			mergeArray[++i]=array1[a1++];
    		}
    	}
    	
    	return mergeArray;
    }
    
    
}
