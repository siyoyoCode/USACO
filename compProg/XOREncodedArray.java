package XOREncodedArray;

public class XOREncodedArray {
	
	public static int[] findOriginalArr(int[] arr, int firstNum) {
		
		int[] answer = new int[arr.length + 1];
		answer[0] = firstNum;
		
		for(int i = 1; i < answer.length; i++) {
			answer[i] = answer[i-1] ^ arr[i-1];
			//System.out.println(answer[i-1] | arr[i-1]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int[] answerArr = findOriginalArr(arr, 1);
		
		for(int i : answerArr) {
			System.out.println(i);
		}
		
	}
}


