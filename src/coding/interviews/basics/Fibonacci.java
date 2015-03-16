package coding.interviews.basics;

public class Fibonacci {

	
	public static int getFibonacciRecursive(int number){
		
		if(number == 0) return 0;
		
		if(number == 1 || number == 2){
			return 1;
		}
		
		return (getFibonacciRecursive(number-1) + getFibonacciRecursive(number-2));
	}
	
	public static int getFibonacciIterative(int number){
		if(number <= 1){
			return number;
		}
		
		int a=0, b=1, f=1;
		for (int i=2; i<=number; i++){
			f = a+b;
			a=b;
			b=f;
		}
		return f;
	}
	
	
	
	public static void main(String[] args){
		int number = 15;
		
		for(int i=0 ; i<= number; i++){
			System.out.print(getFibonacciRecursive(i) + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<=number; i++){
			System.out.print(getFibonacciIterative(i) + " ");
		}
	}
}
