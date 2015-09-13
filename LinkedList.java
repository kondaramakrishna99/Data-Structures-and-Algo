/**
 * @(#)LinkedList.java
 *
 *
 * @author 
 * @version 1.00 2015/8/7
 */
import java.util.*;
public class LinkedList {
        
    /**
     * Creates a new instance of <code>LinkedList</code>.
     */
     
    public LinkedList() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Sunday",0);
        map.put("Monday",1);
        map.put("Monday",2);
        map.put("Tuesday",3);
        
        for(int i=0;i<map.size();i++)
        {
        	System.out.println("key is"+map.get("Monday"));
        	
        }
        
    }
}
