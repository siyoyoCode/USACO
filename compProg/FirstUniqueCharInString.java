import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharInString {
	
	public static int firstUniqChar(String s) { //returns index
		
		HashMap<Character, Integer> stringMap = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			int count;
			
			if(stringMap.get(s.charAt(i)) == null) {
				count = 0;
			} else {
				count = stringMap.get(s.charAt(i));
			}
			
			stringMap.put(s.charAt(i), count + 1);
		}
		
		for(Character key : stringMap.keySet()) {
			if (stringMap.get(key) == 1) {
				return s.indexOf(key);
			}
		} 
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(firstUniqChar(sc.next()));
		
		sc.close();
		
	}

}
