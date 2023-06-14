package bitmanipulation;

import java.util.Scanner;

public class makeBinary {
	
	public static int convertToBinary(int a) {
		int num = 0;
		int power = 0;
		
		while(a > 0) {
			int lastDigit = a & 1;
			num += lastDigit * (Math.pow(10, power));
			power += 1;
			a = a >> 1;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int val = sc.nextInt();
			System.out.println(convertToBinary(val));
		}
		
		sc.close();
	}

}
