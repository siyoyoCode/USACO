package powerOfFour;


import java.util.Scanner;


public class powerOfFour {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int val = sc.nextInt();
		
		
		while((val & 1) != 1) {
			val = val >> 1;
			counter += 1;
			//System.out.println(val);
		}
		
		if(counter % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		//System.out.println(5 & 3);
	}


}
