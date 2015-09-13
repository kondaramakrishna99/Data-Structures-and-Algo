/**
 * @(#)BinarySearch.java
 *
 *
 * @author 
 * @version 1.00 2015/8/12
 */
package SearchAndSoring;


import java.util.*;

public class BinarySearch {
        
    public BinarySearch() {
    }
    
    public static void main(String[] args) {
		//ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] numbers = new int[10];
		for(int i=0;i<10;i++)
		{
			numbers[i] = i;
			System.out.println(i+"th index: "+i);
		}
		
		Scanner input= new Scanner(System.in);
		int item = input.nextInt();
		BinarySearch b = new BinarySearch();
		int result = b.binarySearch(numbers,0,numbers.length-1,item);
		System.out.println(result);
		
    }
    
    public int binarySearch(int array[],int start,int end,int item)
    {
    	
    	int middle =(int) Math.floor((start+end)/2);
    	System.out.println("start : "+start+"middle: "+middle+"end: "+end);
    	if(start==end )
    	{
    		if(item==array[start])
    			return start;
    		else 
    			return -1;
    	}
    	
    	if(item==array[middle])
    		return middle;
    	else if(item>array[middle])	
    	{
    		return binarySearch(array,1+middle,end,item);
    	}
    	
    	else if(item<array[middle])
    		return binarySearch(array,0,middle-1,item);
    	
    	return -1;
    }
}

/*
 *
 * A iterative binary search function. It returns location of x in
// given array arr[l..r] if present, otherwise -1
int binarySearch(int arr[], int l, int r, int x)
{
  while (l <= r)
  {
    int m = l + (r-l)/2;
 
    if (arr[m] == x) return m;  // Check if x is present at mid
 
    if (arr[m] < x) l = m + 1; // If x greater, ignore left half
 
    else r = m - 1; // If x is smaller, ignore right half
  }
  return -1; // if we reach here, then element was not present
}
 *
 *
 */