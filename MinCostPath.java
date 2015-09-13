
public class MinCostPath {
        
    
    public static void main(String[] args) {
       int costs[][] = {{1,2,3},{4,8,2},{1,5,3}};
       MinCostPath s = new MinCostPath();
       int i=2;
       int j=2;
       int tc[][] = new int[3][3];
       tc[0][0] = s.findMinCosts(costs,0,0,tc,2,2);
       System.out.println(tc[][1]);
       
    }
    
    public int findMinCosts(int[][] costs,int i,int j,int[][] tc,int destI,int destJ)
    {
    	if(i==destI && j==destJ)
    	{
    		tc[i][j] = costs[i][j];
    		return tc[i][j];
    	}
    	
    	else if(i==destI)
    	{
    		if(tc[i][j]!=0)
    			return tc[i][j];
    		else
	    		tc[i][j]= costs[i][j]+findMinCosts(costs,i,j+1,tc,destI,destJ);
    		return tc[i][j];
    	}
    	
    	else if(j==destJ)
    	{
    		if(tc[i][j]!=0)
    			return tc[i][j];
    		else
	    		tc[i][j]= costs[i][j]+findMinCosts(costs,i+1,j,tc,destI,destJ);
    		return tc[i][j];
    	}
    	
    	else{
    		int temp1=0;
    		int temp2=0;
    		int temp3=0;
    		if(tc[i+1][j+1]!=0)
    			temp1= tc[i+1][j+1];
    		else
	    		temp1 = findMinCosts(costs,i+1,j+1,tc,destI,destJ);
	    	
	    	if(tc[i+1][j]!=0)
    			temp2= tc[i+1][j];
    		else
    			temp2 = findMinCosts(costs,i+1,j,tc,destI,destJ);
    			
    		if(tc[i][j+1]!=0)
    			temp3= tc[i][j+1];
    		else
    		    temp3 = findMinCosts(costs,i,j+1,tc,destI,destJ);
    			
    		tc[i][j] = (costs[i][j]+findMin(temp1,temp2,temp3));	
    		 return tc[i][j];
    	}
    }
    
    public int findMin(int temp1,int temp2,int temp3)
    {
    	if(temp1<temp2 && temp1<temp3)
    		return temp1;
    	else if(temp2<temp1 && temp2<temp3)
    		return temp2;
    	else return temp3;
    }
    
}
