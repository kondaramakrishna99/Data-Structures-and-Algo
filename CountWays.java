

public class CountWays {
        
    
    public static void main(String[] args) {
		
		int endStep = 3;
		int initialStep=0;
		CountWays c= new CountWays();
		int map[] = new int[endStep+1];
		int NumOfSteps=0;
		System.out.println(c.countNumWays(initialStep,endStep,map,NumOfSteps));
		
		
		
    }
    
    public int countNumWays(int stepNum, int endStep,int[] map,int NumOfSteps)
    {
    	if(stepNum==endStep)
    		return 1;
    	else if(stepNum>endStep)
    	{
    		return 0;
    	}
    	else if(map[stepNum]>0)
    	{
    		return map[stepNum];
    	}
    	else{
    		NumOfSteps = countNumWays(stepNum+1,endStep,map,NumOfSteps)+
    			countNumWays(stepNum+2,endStep,map,NumOfSteps)+
    				countNumWays(stepNum+3,endStep,map,NumOfSteps);
    		map[stepNum] = NumOfSteps;
    		return NumOfSteps;
    	}
    	//return NumOfSteps;
    }
    
}
