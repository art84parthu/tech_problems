package coding.interviews.basics;

public class ReverseNumber {

	public static int reverse(int n){
		assert(n >= 0);
		if(n < 10) return n;
		
		int rev = 0;
		while (n != 0){
			rev = n % 10 + rev * 10;
			n = n/10;
		}
		return rev;
	}
	
	public static void main(String[] args){
		System.out.println(reverse(89334));
		System.out.println(reverse(76583));
	}
}
