/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2015/8/14
 */

public class Main {
        
  
    public static void main(String[] args) {
       Stack s=new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       
       for(int i=s.numberOfElements;i>0;i--)
       {
       		
       		System.out.println("top data: "+s.pop());
       }
       
       
    }
}
