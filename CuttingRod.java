import java.util.Arrays;
public class CuttingRod {
        
    
    public static void main(String[] args) {
      
       int len[] = {1,2};
       int prices[] = {2,5};
       int size=5;
       CuttingRod s = new CuttingRod();
       int value = s.cutRod(size,len,prices);
       System.out.println("Max value is : "+value);
    }
    
    public int cutRod(int size,int[] len,int[] prices)
    {
    	if(size<=0)
    		return 0;
    	if(len.length==0 || prices.length==0)
    		return 0;
    		
    	for(int i=0;i<prices.length;i++)
    	{
    		System.out.print("  "+prices[i]);
    	}
    	System.out.println("size is: "+size);
    	if(size-len[0]>=0)
    	{
    		int temp1 = prices[0]+cutRod(size-len[0],len,prices);
	    	System.out.println("temp1 : "+temp1 + "length : "+size);
	    	int temp2 = cutRod(size,Arrays.copyOfRange(len,1,len.length),Arrays.copyOfRange(prices,1,prices.length));
	    	System.out.println("temp2 : "+temp2 + "length : "+size);
	    	if(temp1>temp2)
	    	{
	    		System.out.println("returning temp1");
	    		return temp1;
	    		
	    	}
	    	else
	    	{
	    		System.out.println("returning temp2");
	    		return temp2;
	  
	    	}	
    	}
    	
    	else
    		return 0;
    	
    		
    }
}
