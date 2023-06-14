package bitmanipulation;

import java.util.Comparator;
import java.util.PriorityQueue;


public class sortByNumOfBits {
	
	public int[] sortByBits(int[] arr) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(
			new Comparator<Integer>() {
				public int compare(Integer a, Integer b) {
					int aBit = getSetBits(a);
					int bBit = getSetBits(b);
					
					if(aBit == bBit) {
						return a - b;
					} else {
						return aBit - bBit;
					}
				}
			});
		
		for(int i : arr) {
			minHeap.add(i);
		}
		
		int index = 0;
		while(minHeap.size() > 0) {
			int min = minHeap.poll();
			arr[index] = min;
			index++;
		}
		
		return arr;
		
    }
	
	public int getSetBits(int a) {
		int counter = 0;
		while(a > 0) {
			a = a & (a-1);
			counter ++;
		}
		
		return counter;
	}
	
	
	public static void main(String[] args) {
		
		
		
	}

}
