/**
 * @(#)LL.java
 *
 *
 * @author 
 * @version 1.00 2015/8/7
 */
import java.util.HashMap;
public class LL {
        
    int data;
    LL next;
    
    public LL()
    {
    	data=0;
    	next = null;	
    }
    
    public LL(int d)
    {
    	data=d;
    	next=null;
    }
    
    
    public void add(int d)
    {
    	LL endNode = new LL(d);
    	LL head = this;
    	System.out.println("data" + head.data);
    	while(head.next!=null)
    	{
    		head=head.next;
    	}
    	head.next=endNode;
    	
    }
    
   public void printList()
   {
   		LL head=this;
   		int i=0;
   		while(head!=null)
   		{
   			
   			System.out.println("element "+(i+1)+"is : "+head.data);
   			head=head.next;
   			i++;
   		}
   }
   
   public int size()
   {
   		LL head=this;
   		int i=0;
   		while(head!=null)
   		{
   			i++;
   			head=head.next;
   		}
   		return i;
   }
   
   public LL reverse(LL head)
   {
   		LL prev = null;
   		LL curr=head;
   		LL nex;
   		while(curr!=null)
   		{
   			nex = curr.next;
   			curr.next= prev;
   			prev = curr;
   			curr=nex;
   		}
   		return prev;
   }
   
   public LL getIndex(int k)
   {
   		LL head = this;
   		for (int i=1;i<=k;i++)
   		{
   			head=head.next;
   		}
   		return head;		
   }
   
   public boolean isLoop(LL head)
   {
   		LL curr=head;
   		HashMap<LL,Integer> map = new HashMap<LL,Integer>();
   		if(curr==null)
   			return true;
   		else map.put(curr,0);
   		int i=1;
   		while(curr.next!=null)
   		{
   			curr=curr.next;
   			if(map.get(curr)==null)
   			{
   				map.put(curr,i);
   				i++;
   			}
   			else
   				return true;
   		}
   		return false;
   }
    public static void main(String args[])
    {
    	LL list = new LL();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	
    	list.printList();
    	System.out.println("Making loop");
    	//list.getIndex(3).next=list.getIndex(1);
    	/*LL head=list;
    	for (int i=0;i<=10;i++)
   		{
   			System.out.println("element"+(i+1)+": "+head.data);
   			head=head.next;
   		}
   		
    	System.out.println(list.size());*/
    	//LL rev = list.reverse(list);
    	
    	System.out.println("isloop : "+list.isLoop(list));
    	
    
    }
}
