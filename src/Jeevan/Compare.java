package Jeevan;

public class Compare {
	
	public boolean compare(char[] array1,char[] array2) {
		for(int i = 0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j])
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array1 = new char[] {'a','b','c','d','e'};
		char[] array2 = new char[] {'x','y','z','e'};
		Compare c = new Compare();
		boolean result = c.compare(array1,array2);
		if(result) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
