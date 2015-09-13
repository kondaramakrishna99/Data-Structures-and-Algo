import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyHackerRank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        String p = input.nextLine();
        for(int i=0;i<num;i++)
            {
            String temp = 	input.nextLine();
            //System.out.println("asdsa "+temp1);
            StringBuilder temp1 = new StringBuilder(temp);
            String revTemp = temp1.reverse().toString();
            boolean funny = true;
            for(int k=0;k<temp.length()-1;k++)
                {
                    
                if( Math.abs((int)temp.charAt(k+1)-(int)temp.charAt(k))!= Math.abs((int)revTemp.charAt(k+1)-(int)revTemp.charAt(k)))
                    {
                    funny=false;
                        break;
                }   
               
               System.out.println(temp.charAt(k+1));
               System.out.println((int)temp.charAt(k+1));
               	System.out.println(Math.abs((int)temp.charAt(k+1)-(int)temp.charAt(k)));
               		System.out.println(Math.abs((int)revTemp.charAt(k+1)-(int)revTemp.charAt(k)));
               		//System.out.println(funny);
            }
            System.out.println(funny);
        }
    }
}