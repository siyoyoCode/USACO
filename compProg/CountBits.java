package XOREncodedArray;

import java.util.Scanner;

public class CountBits {
	
	public static int countAllBits(int a) {
		int counter = 0;
		
		while(a != 0) {
			if((a & 1) == 1) {
				counter += 1;
			}
			
			a = a >> 1;
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int val = sc.nextInt();
			int answer = countAllBits(val);
			System.out.println(answer);
		}
		
		sc.close();
		
	}

}
