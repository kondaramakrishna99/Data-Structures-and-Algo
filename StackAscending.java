/**
 * @(#)StackAscending.java
 *
 *
 * @author 
 * @version 1.00 2015/8/14
 */

import java.util.Stack;
public class StackAscending {
        
    
    public static void main(String[] args) {
       Stack s1=new Stack();
       s1.push(2);
       s1.push(2);
       s1.push(3);
       s1.push(9);
       s1.push(5);
       s1.push(3);
       s1.push(7);
       
       Stack s2=new Stack();
       if(!s1.isEmpty())
       {
       		s2.push(s1.pop());
       }
       
       while(!s1.isEmpty())
       {
       		int temp = Integer.parseInt(s1.pop().toString());
       		while(!s2.isEmpty())
       		{
       			if(temp>=Integer.parseInt(s2.peek().toString()))
       			{
       				s2.push(temp);
       				break;
       			}
       			else if(temp<Integer.parseInt(s2.peek().toString()))
       			{
       				s1.push(s2.pop());       				
       			}
       		}
       		if(s2.isEmpty())
       		{
       			s2.push(temp);
       		}       		
       }
       int t = s2.size();
       for(int i=0;i<t;i++)
       {
       		System.out.println(s2.pop());
       }
       
    }
}
