
import java.util.HashMap;
public class StringDuplicatesHashing {
        
    
    public static void main(String[] args) {
        
        String str= "abcdeceaghi";
        HashMap h = new HashMap();
        
        int[] arr= {1,2,3,4,5};
        
        for(int i=0;i<str.length();i++)
        {
        	if(!h.containsKey(str.charAt(i)))
        	{
        		h.put(str.charAt(i),1);
        	}
        	else{
        		str=str.substring(0,i)+str.substring(i+1,str.length());
        		i--;
        	}
        }
        
        System.out.println(str);
    }
}
