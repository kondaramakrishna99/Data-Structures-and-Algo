/**
 * @(#)HashCodeTest.java
 *
 *
 * @author 
 * @version 1.00 2015/8/24
 */
import java.util.Arrays;
public class HashCodeTest {
        
   
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        
        String s1="this is a career monk string";
        String s2="ihhs";
        
        
        String[] s1array = s1.split(" ");
        Arrays.sort(s1array);
        
        for(int i=0;i<s1array.length;i++)
        {
        	System.out.println(s1array[i]);
        	
        }
        s1="hsih";
        System.out.println("equal: "+Arrays.equals(s1array,s1array));
        System.out.println("s1 hash: "+s1.hashCode());
        System.out.println("s1 hash: "+s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(e1.hashCode()==e1.hashCode());
    }
}

class Employee
{
		
}
