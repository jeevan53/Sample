package Jeevan;

import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,1,2,0,3,0,4,5,6};
	/*	int[] f = new int[array.length];
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				f[i] =array[i];
			}
		}
		*/
	//	int a[]= null;
		//System.out.println(a[5]);
		int current = array.length -1;
		for(int i = array.length-1;i>=0;i--) {
			if(array[i]!=0) {
				array[current] = array[i];
				current--;
			}
		}
		//System.out.println(array[11]);
		//System.out.println(current);
	for(int i = current;i>=0;i--) {
		array[i] = 0;
		}
		//System.out.println(current);
		for(int i:array){
			System.out.println(i);
		}
		
		HashMap<String,String> string = new HashMap<>();
		string.put("Hi","Welcome");
		
		string.put("Hi","Welcome");
		System.out.println(string);
	}
}
