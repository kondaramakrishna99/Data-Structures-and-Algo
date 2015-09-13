/**
 * @(#)Sudoku.java
 *
 *
 * @author 
 * @version 1.00 2015/8/20
 */

public class Sudoku {
        
    
 	
    public static void main(String[] args) {
    	int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                      {5, 2, 0, 0, 0, 0, 0, 0, 0},
                      {0, 8, 7, 0, 0, 0, 0, 3, 1},
                      {0, 0, 3, 0, 1, 0, 0, 8, 0},
                      {9, 0, 0, 8, 6, 3, 0, 0, 5},
                      {0, 5, 0, 0, 9, 0, 6, 0, 0},
                      {1, 3, 0, 0, 0, 0, 2, 5, 0},
                      {0, 0, 0, 0, 0, 0, 0, 7, 4},
                      {0, 0, 5, 2, 0, 6, 3, 0, 0}};  
        
        Sudoku s = new Sudoku();	
        if(s.solveSudoko(grid))
        	System.out.println("Successful");
        else
        	System.out.println("FKED UP");
        	
        for(int i=0;i<grid.length;i++)	
        {
        	for(int j=0;j<grid[0].length;j++)
        	{
        		System.out.print("  "+grid[i][j]);
        	}
        	System.out.println();
        }
    }
    
    public boolean solveSudoko(int[][] grid)
    {
    	for(int i=0;i<grid.length;i++)
    	{
    		for(int j=0;j<grid[0].length;j++)
    		{
    			if(grid[i][j]==0)
    			{
    				int temp=assignNumber(i,j,grid);
    				if(temp==-1)
    				{
    					grid[i][j]=0;
    					return false;
    				}
    				else{
    					grid[i][j]=temp;
    				}
    			}
    		}
    	}
    	return true;
    }
    
    public int assignNumber(int i,int j,int[][] grid)
    {
    	for(int num=1;num<=9;num++)
    	{
    		//check row validity
    		boolean present=false;
    		for(int row=0;row<9;row++)
    		{
    			if(grid[row][j]==num)
    			{
    				present=true;
    				break;
    			}
    		}
    		
    		//check column validity
    		for(int col=0;col<9;col++)
    		{
    			if(grid[i][col]==num)
    			{
    				present=true;
    				break;
    			}
    		}
    		
    		//check small grid validity
    		
    		int smallGridRow = (i/3)*3;
    		int smallGridColumn = (j/3)*3;
    		
    		outerloop:
    		
    		for(int p=smallGridRow;p<smallGridRow+3;p++)
    		{
    			for(int q=smallGridColumn;q<smallGridColumn+3;q++)
    			{
    				if(grid[p][q]==num)
    				{
    					present=true;
    					break outerloop;	
    				}
    			}
    		}
    		
    		
    		if(present==false)
    		{
    			grid[i][j]=num;
    			if(solveSudoko(grid))
    			{
    				return num;
    			}
    		}
    	}
    	
    	return -1;
    }
}
