package Jeevan;

public class mergeSortedArrays {

	public void merge(int[] A,int[] B,int[] mergeArray) {
		int i =0,j = 0,k=0;
		while(i<A.length && j<B.length ) {
			if(A[i]<B[j]) {
				mergeArray[k++] = A[i++];
			}
			else 
			{
				mergeArray[k++] = B[j++];
			}
		}
		// Store remaining elements of first array
        while (i < A.length)
       	mergeArray[k++] = A[i++];
     
        // Store remaining elements of second array
        while (j < B.length)
        	mergeArray[k++] = B[j++];
        
		for(int k1:mergeArray) {
			System.out.print(k1+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeSortedArrays m = new mergeSortedArrays();
		int[] array1 = new int[] {0,3,4,31};
		int[] array2 = new int[] {4,6,30,33};
		//0,3,4,4,6,30,31
		int[] merge = new int[array1.length+array2.length];
		m.merge(array1,array2,merge);
		}
	
}
