package bitmanipulation;

public class threeUniqueNumbers {
	
	public static int findUnique(int[] arr) {
		int[] sumAtRow = new int[32];
		
		for(int num : arr) {
			updateArr(sumAtRow, num);
		}
		
		for(int i = 0; i < 32; i++) {
			sumAtRow[i] = sumAtRow[i] % 3;
		}
		
		return convertToInt(sumAtRow);
		
	}
	
	public static void updateArr(int[] arr, int x) {
		
		int index = 0;
		while(index < 32) {
			arr[index] += x & 1;
			x = x >> 1;
			index ++;
		}
	}
	
	public static int convertToInt(int[] arr) {
		int power = 1;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] * power;
			power *= 2;
		}
		
		return sum;
	}
	
	public static void main(String[] arg) {
		int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 5};
		
		System.out.println(findUnique(arr));

	}

}
