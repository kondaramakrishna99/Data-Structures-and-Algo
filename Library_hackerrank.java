/**
 * @(#)Library_hackerrank.java
 *
 *
 * @author 
 * @version 1.00 2015/9/10
 */
import java.util.Scanner;
public class Library_hackerrank {
        
    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       String actual  = input.nextLine();
       String actualArray[] = actual.split(" ");
       if(actualArray[0].matches("\\d+"))
       		int actualDate= Integer.parseInt(actualArray[0]);
       		else System.out.println("Print number");
       int actualMonth= Integer.parseInt(actualArray[1]);
       int actualYear= Integer.parseInt(actualArray[2]);
       
       String ret  = input.nextLine();
       String retArray[] = ret.split(" ");
       int retDate= Integer.parseInt(retArray[0]);
       int retMonth= Integer.parseInt(retArray[1]);
       int retYear= Integer.parseInt(retArray[2]);
       
       
    }
}
