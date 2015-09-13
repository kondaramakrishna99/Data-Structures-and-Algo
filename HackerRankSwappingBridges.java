/**
 * @(#)HackerRankSwappingBridges.java
 *
 *
 * @author 
 * @version 1.00 2015/9/12
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class HackerRankSwappingBridges {
        
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        int numOfNodes[] = new int[number];
        int result[] = new int[number];
        
        for(int i=0;i<number;i++)
        {
        	numOfNodes[i] = input.nextInt();
        	Edge edges[] = new Edge[numOfNodes[i]];
        	for(int k=0;k<numOfNodes[i];k++)
        	{
        		int node = input.nextInt();
        		edges[k] = new Edge(k+1,node);
        	}
        	int nodes[] = new int[numOfNodes[i]];
        	//nodes[0] = Integer.MIN_VALUE;
        	for(int k=0;k<numOfNodes[i];k++)
        	{
        	//	System.out.println(edges[k].start + "---->"+edges[k].end);
        		nodes[k] = Integer.MAX_VALUE;
        	}
        	
			for(int k=0;k<edges.length;k++)
        	{
        		int min = Math.min(edges[k].start,edges[k].end);
        		if(nodes[min-1]>=min)
        		{
        			for(int p=0;p<nodes.length;p++)
        			{
        				if(nodes[p]==nodes[min-1])
        					nodes[p] = min;
        			}
        			
        		}
        		min = min-1;
        		if(nodes[edges[k].start-1] >= nodes[min])
        			nodes[edges[k].start-1] = nodes[min];
        		if(nodes[edges[k].end-1] >= nodes[min])
        			nodes[edges[k].end-1] = nodes[min];
        	}        	
        	
        	//find unique elements
        	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        	for(int q=0;q<nodes.length;q++)
        	{
        		if(!hm.containsKey(nodes[q]))
        			hm.put(nodes[q],nodes[q]);	
        	}
        	
        	System.out.println(hm.size()-1);
        }
        
    }
}

class Edge
{
	int start;
	int end;
	
	Edge(int s,int e)
	{
		start=s;
		end=e;
	}
}
