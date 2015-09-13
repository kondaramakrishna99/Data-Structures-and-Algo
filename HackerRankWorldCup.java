/**
 * @(#)HackerRankWorldCup.java
 *
 *
 * @author 
 * @version 1.00 2015/9/11
 */
import java.util.Scanner;
import java.util.Arrays;

public class HackerRankWorldCup {
        
    public static void main(String[] args) {
		
		int ratings[] = new int[10];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			ratings[i]=input.nextInt();			
		}        
        
        Arrays.sort(ratings);
        
        System.out.println(ratings[9]+ratings[7]+ratings[5]);
    }
}
