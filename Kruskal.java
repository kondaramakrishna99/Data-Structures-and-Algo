
import java.util.ArrayList;
public class Kruskal {
        
    
    public static void main(String[] args) {
    	
      //int graph[][] = {{10,0,1},{6,0,2},{5,0,3},{15,1,3},{4,2,3}};   
      int graph[][] = {{
            14,3 , 5},
            {10,5 , 4},
            {8 ,0 , 7},
            {1 ,7 , 6},
            {4 ,0 , 1},
            {2 ,8 , 2},
            {7 ,2 , 3},
            {9 ,3 , 4},
            {2 ,6 , 5},
            {4 ,2 , 5},
            {7 ,7 , 8},
            {8 ,1 , 2},
            {6 ,8 , 6},
            {11,1 , 7} };
      Kruskal s = new Kruskal();
      graph=s.sort(graph);
      boolean isCycle=false;
     // System.out.println(graph[0][1]+"-->"+graph[0][2]+" -- "+graph[0][0]);
      //int vertices[] = s.findVertices(graph);
      ArrayList<Integer> MSTnodes = new ArrayList<Integer>();
      MSTnodes.add(graph[0][1]);
      MSTnodes.add(graph[0][2]);
      for(int i=1;i<graph.length;i++)
      {
      	 MSTnodes=s.findVertices(graph,i,MSTnodes); //found verices
      }
      
      int parents[] = new int[MSTnodes.size()];
      for(int i=0;i<MSTnodes.size();i++)
      {
      	 //System.out.println(i+"node: "+MSTnodes.get(i));
      	 parents[i]=i;
      }
      
      for(int i=0;i<graph.length;i++)
      {
      	 parents=s.isCycle(graph,i,parents);  	 
      }
      
      
      
       
    }
    
    public ArrayList<Integer> findVertices(int[][] graph,int index,ArrayList<Integer> MSTnodes)
    {
    //	System.out.println("CHECK :"+ graph[index][1]+"-->"+graph[index][2]+" -- "+graph[index][0]);
    	if(MSTnodes.contains(graph[index][1]) && MSTnodes.contains(graph[index][2]))
    	{
    		//System.out.println("came here");
    		return MSTnodes;
    	}
    		
    	else if(MSTnodes.contains(graph[index][1]) && !MSTnodes.contains(graph[index][2]))
    	{
    		
    		MSTnodes.add(graph[index][2]);
    		//System.out.println(graph[index][1]+"-->"+graph[index][2]+" -- "+graph[index][0]);
    	}
    	
    	else if(!MSTnodes.contains(graph[index][1]) && MSTnodes.contains(graph[index][2]))
    	{
    		MSTnodes.add(graph[index][1]);
    		//System.out.println(graph[index][1]+"-->"+graph[index][2]+" -- "+graph[index][0]);
    	}
    	
    	else if(!MSTnodes.contains(graph[index][1]) && !MSTnodes.contains(graph[index][2]))
    	{
    		MSTnodes.add(graph[index][2]);
    		MSTnodes.add(graph[index][1]);
    		//System.out.println(graph[index][1]+"-->"+graph[index][2]+" -- "+graph[index][0]);
    	}
    	return MSTnodes;
    }
    
    public int[] isCycle(int[][] graph,int index,int parents[])
    {
    	if(parents[graph[index][1]]!=parents[graph[index][2]])
    	{
    		System.out.println(graph[index][1]+"-->"+graph[index][2]+" -- "+graph[index][0]);
    		int temp1=parents[graph[index][1]];
    		int temp2=parents[graph[index][2]];
    		if(parents[graph[index][1]]<parents[graph[index][2]])
    		{
    			
    			for(int k=0;k<parents.length;k++)
	    		{
	    			if(parents[k]==temp2)		
	    				parents[k]=temp1;
	    		}	
    		}
    		
    		else if(parents[graph[index][1]]>parents[graph[index][2]])
    		{
    			for(int k=0;k<parents.length;k++)
	    		{
	    			if(parents[k]==temp1)		
	    				parents[k]=temp2;
	    		}	
    		}
    	}
    	return parents;
    }
    
    
    public int[][] sort(int[][] graph)
    {
    	for(int i=0;i<graph.length;i++)
    	{
    		int minIndex=i;
    		for(int j=i+1;j<graph.length;j++)
    		{
    			if(graph[j][0]<graph[minIndex][0])
    			{
    				minIndex=j;
    			}
    		}
    		if(minIndex!=i)
    		{
    			int temp=graph[i][0];
    			graph[i][0] = graph[minIndex][0];
    			graph[minIndex][0]=temp;
    			
    			temp=graph[i][1];
    			graph[i][1] = graph[minIndex][1];
    			graph[minIndex][1]=temp;
    			
    			temp=graph[i][2];
    			graph[i][2] = graph[minIndex][2];
    			graph[minIndex][2]=temp;
    			
    		}
    	}
    	
    	return graph;
    }
}
