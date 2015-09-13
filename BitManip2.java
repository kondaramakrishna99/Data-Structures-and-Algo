/**
 * @(#)BitManip2.java
 *
 *
 * @author 
 * @version 1.00 2015/8/17
 */
import java.util.Scanner;
public class BitManip2 {
        
    
    public static void main(String[] args) {

		int i=5;
		int j=2;
       System.out.println(Integer.toBinaryString(i));
       System.out.println("shift "+Integer.toBinaryString(i<<1));
       System.out.println(Integer.toBinaryString(j));
      // System.out.println(Integer.toBinaryString((0xaaaaaaaa)));
      // j=i;
       //System.out.println(Integer.toBinaryString(i));  
       i=(j+i)-(j=i);
       System.out.println("j: "+Integer.toBinaryString(j)); 
       	 i=i^j;
       System.out.println("i "+Integer.toBinaryString(i)); 
       	
       	Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        int number1 = input.nextInt(); 	
        System.out.println(number + number1); 	     
    }
}
