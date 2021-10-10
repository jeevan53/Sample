package Jeevan;

public class Reverse {

	public boolean checkPalindrome(String s) {
		for(int i =s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		String str = "jeev i veej";
		boolean result = r.checkPalindrome(str);
		if(result) {
			System.out.println(str+" is palindrome string");
		}
		else
		{
			System.out.println(str+" is not palindrome string");
		}
		}
	}


