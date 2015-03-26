package coding.interviews.arrays;

public class ArrayUtil {
	public static void printArray(int[] r){
		System.out.print("\n[");
		int i=0;
		for(; i<r.length-1; i++){
			System.out.print(r[i] + ",");
		}
		System.out.print(r[i] + "]");
	}
	
	public static boolean areArraysEqual(int[] a, int[] b){
		if(a.length == b.length){
			for(int i=0; i<a.length; i++){
				if(a[i] != b[i]){
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static int[] trimArr(int[] a, int cnt){
		int[] b = new int[cnt];
		
		for(int i=0; i<cnt; i++){
			b[i] = a[i];
		}
		
		return b;
	}
}
