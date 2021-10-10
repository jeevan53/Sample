package Jeevan;

import java.util.HashMap;

public class OccurenceI {
	//first recurring number
	public void recurring(int[] A) {
		//Time complexity is O(n^2)
	/*	for(int i =0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]==A[j]) {
					return A[i];
				}
			}
		}
		return 0;
		*/
		//key =A[i], value = count;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:A) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
		int key =0;
		int repeat = -1;
		for(int i:A) {
			int value = map.get(i);
			if(value>repeat) {
				key = i;
				repeat = value;
			}
			System.out.println("Element "+i+" Occured "+map.get(i)+" times");
		}
		System.out.println("KEY = " + key + ", REPEATED = " + repeat);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,2,2,5,5,5,6,6};
		OccurenceI r = new OccurenceI();
		r.recurring(array1);
	}

}
