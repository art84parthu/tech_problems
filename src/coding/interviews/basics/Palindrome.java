package coding.interviews.basics;

public class Palindrome {

	public static boolean isPalindrome(int n){
		int div = 1;
		while (n / div >= 10){
			div = div * 10;
		}
		
		while(n != 0){
			int h = n / div;
			int t = n % 10;
			
			if(h != t) return false;
			
			n = (n % div) / 10;
			div = div/100;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(isPalindrome(689345));
		System.out.println(isPalindrome(583385));
		System.out.println(isPalindrome(5836385));
	}
}
