import java.util.ArrayList;
public class Dijkstra {
        
    //int[] visitedNodes;
    public static void main(String[] args) {
       
       int graph[][] = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                      {4, 0, 8, 0, 0, 0, 0, 11, 0},
                      {0, 8, 0, 7, 0, 4, 0, 0, 2},
                      {0, 0, 7, 0, 9, 14, 0, 0, 0},
                      {0, 0, 0, 9, 0, 10, 0, 0, 0},
                      {0, 0, 4, 14, 10, 0, 2, 0, 0},
                      {0, 0, 0, 0, 0, 2, 0, 1, 6},
                      {8, 11, 0, 0, 0, 0, 1, 0, 7},
                      {0, 0, 2, 0, 0, 0, 6, 7, 0}
                     };
                     
      int keyNodes[] = new int[graph.length];
      int visitedNodes[] = new int[graph.length];
      ArrayList<Integer> sptSet = new ArrayList<Integer>();
      
      
      for(int i=0;i<keyNodes.length;i++) 
      {
      	keyNodes[i]=Integer.MAX_VALUE;
      	visitedNodes[i] = -1;
      }
      int root=0;
      keyNodes[root]=0;
      sptSet.add(root);
      visitedNodes[root] = 1;
      Dijkstra s= new Dijkstra();
      int index=root;
      for(int i=0;i<keyNodes.length;i++)
      {	
      	keyNodes = s.relax(graph,index,keyNodes,visitedNodes);
      	index = s.extractMin(keyNodes,visitedNodes);
      	//sptSet.remove()
      //	sptSet.add(index);
      	visitedNodes[index]=1;
      }
      
      for(int i=0;i<keyNodes.length;i++) 
      {
      	System.out.println(i+"node distance is "+keyNodes[i]);
      	
      }
      
    }
     
      public int[] relax(int[][] graph,int index,int[] keyNodes,int[] visitedNodes)
      {
      	for(int i=0;i<keyNodes.length;i++)
      	{
      		if(visitedNodes[i]==-1 &&i!=index &&graph[i][index]!=0)
      		{
      			if(keyNodes[i]>keyNodes[index]+graph[index][i])
      			{
      				//System.out.println("index: "+index+"keyIndex: "+keyNodes[index]+" key["+i+"] "+keyNodes[i]+"edge: "+graph[index][i]);
      				keyNodes[i]=keyNodes[index]+graph[index][i];
      				//System.out.println("index: "+index+"keyIndex: "+keyNodes[index]+" key["+i+"] "+keyNodes[i]+"edge: "+graph[index][i]);
      			}
      		}
      	}
      	return keyNodes;
      }
      
      public int extractMin(int[] keyNodes,int[] visitedNodes)
      {
      	int min=Integer.MAX_VALUE;
      	int minIndex=1;
      	for(int i=0;i<keyNodes.length;i++)
      	{
      		if(visitedNodes[i]==-1)
      		{
      			if(keyNodes[i]<min)
      			{
      				min=keyNodes[i];
      				minIndex=i;
      			}
      		}
      	}
      	
      	return minIndex;
      }
      
    
}
