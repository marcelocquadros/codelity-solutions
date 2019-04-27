
class Solution {
    public int solution(int A, int B) {
     
     int max = 0;
     for(int i = A; i <= B; i++) { //B was not included
    	 int result = maximumOperations(i, 0) ;
    	 if(result > max) {
    		 max = result;
    	 }
     }
    
      System.out.println(max);
      return max;
        
    }
    
    private int maximumOperations( int startNum, int count ){
    	
    	if(startNum < 3 ) return count;
    	
        double res = Math.sqrt(startNum);
                
        if(Math.floor(res) == res){
           return maximumOperations((int) res, count+1); 
        } else {
            return count;
        } 
    }
    
    //Solution without recursion after some research
    public int solution2(int A, int B) {
		
	int result = 0;
		
	while(B > A) {	
	   A = (int) Math.sqrt(A);   
	   B = (int) Math.sqrt(B);
			
	   if(B < 2)  break;
	   
	   result +=1;
	}
		
	System.out.println("Result is: "+ result );
		
	return result;
    }
}


public class MaxSquareRootOperations {
	public static void main(String ...args) {
		
		new Solution().solution(0, 16);
	}
}
