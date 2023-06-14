package bitmanipulation;

public class maxConsecutiveOnes {
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int currentCounter = 0;
        int max = 0;
        int index = 0;
        
        while(index < nums.length){
        	
        	if(nums[index] == 1) {
        		currentCounter += 1;
        		System.out.println("currentCount: " + currentCounter);
        		
        	} else {
        		currentCounter = 0; //reset counter
        	}
        	
    		max = Math.max(max, currentCounter); //update max
        	index ++;
        }
        
        return max;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 0, 1, 1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}

}
