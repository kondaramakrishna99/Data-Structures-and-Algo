/**
 * @(#)HeapSort.java
 *
 *
 * @author 
 * @version 1.00 2015/8/14
 */

public class HeapSort {
        
    
    public static void main(String[] args) {
        
        int array[] = {2,3,4,1,5,9,8,6,7,0,-2};
        HeapSort s = new HeapSort();
        if(array.length==0)
        	System.out.println("Array should contain elements");
        else
        	s.heapSort(array,array.length-1);
        	
       for(int i=0;i<array.length;i++)
       {
       		System.out.println(i+" index: "+array[i]);
       }
    }
    
    public int[] heapSort(int[] array,int lastIndex)
    {
    	if(lastIndex==0)
    	{
    		return array;
    	}
    	array = buildMaxHeap(array,lastIndex);
       for(int i=0;i<array.length;i++)
       {
       		System.out.println("---"+i+" index: "+array[i]);
       }
    	array = swap(array,0,lastIndex);
    	for(int i=0;i<array.length;i++)
       {
       		System.out.println("After swap"+i+" index: "+array[i]);
       }
    	array = heapSort(array,lastIndex-1);
    	return array;
    }
    
    public int[] buildMaxHeap(int[] array,int lastIndex)
    {
    	//int lastParent = (int)Math.ceil((lastIndex-1)/2);
    	int lastParent = (lastIndex%2!=0)?(int)Math.floor(lastIndex/2):(int)Math.floor(lastIndex/2)-1;
    	System.out.println("lastparent : "+array[lastParent]+" index is: "+lastParent);
    	for(int i=lastParent;i>=0;i--)
    	{
    		array = heapify(array,i,lastIndex);
    	}
    	return array;
    }
    
    public int[] heapify(int[] array,int parent,int lastIndex)
    {
    	int leftChild = 2*parent+1;
    	int rightChild= 2*parent+2;
    	if(rightChild > lastIndex)
    	{
    		System.out.println("no right parent");
    		if(array[leftChild]>array[parent])
    		{
	    		int temp = array[parent];
	    		array[parent] = array[leftChild];
	    		array[leftChild] = temp;
    		}
    			
    	}
    	else if(array[leftChild]>array[rightChild] && array[leftChild]>array[parent])
    	{
    		int temp = array[parent];
    		array[parent] = array[leftChild];
    		array[leftChild] = temp;
    		
    	}
    	
    	else if(array[rightChild]>array[leftChild] && array[rightChild]>array[parent])
    	{
    		int temp = array[parent];
    		array[parent] = array[rightChild];
    		array[rightChild] = temp;
    	}
    	
    	return array;
    }
    
    public int[] swap(int[] array, int parent,int leftChild)
    {
    		int temp = array[parent];
    		array[parent] = array[leftChild];
    		array[leftChild] = temp;
    		
    		return array;
    }
}
