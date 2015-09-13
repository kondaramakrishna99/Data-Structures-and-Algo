

public class BitManipultaion {
        
    
    public static void main(String[] args) {
    	int num1 = 839;
    	System.out.println(Integer.toBinaryString(num1));
    	int num2 = 7;
    	System.out.println(Integer.toBinaryString(num2));
        int j=5;
        int i=3;
        
        int k=0;
        int temp=1;
        while(k<=j)
        {
        	if(k>=i)
        	{
        		temp=1<<k;
        		temp=~temp;
        		num1=num1&temp;
        	}
        	k++;
        }
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num1|(num2<<i)));
    }
    
    
}
