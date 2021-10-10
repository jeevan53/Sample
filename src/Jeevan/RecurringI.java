package Jeevan;

import java.util.HashMap;

public class RecurringI {
	//first recurring number
	public int recurring(int[] A) {
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
				return i;
			}
			else {
				map.put(i,1);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,3,4,5,6,6};
		RecurringI r = new RecurringI();
		int result =r.recurring(array1);
		if(result!=0) {
			System.out.println("First recurring number is "+result);
		}
		else {
			System.out.println("No recurring number");
		}
	}

}
