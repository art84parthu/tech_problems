package coding.interviews.arrays;

public class SortedArrayCompare {
	public static int[] getCommonElements(int[] A, int[] B){
		int lenA = A.length;
		int lenB = B.length;
		
		int[] small = A;
		int[] big = B;
		if(lenA > lenB){
			small = B;
			big = A;
		}
		
		int indexA = 0;
		int indexB = 0;
		
		int[] common = new int[small.length];
		int i = 0;
		while(indexA < lenA && indexB < lenB){
			int a = small[indexA];
			int b = big[indexB];
			if(a == b){
				common[i] = a;
				i++;
				indexA++; indexB++;
			}else if (a < b){
				indexA++;
			}else if(b < a){
				indexB++;
			}
		}
		
		common = trimArr(common, i+1);
		
		return common;
	}
	
	private static int[] trimArr(int[] a, int cnt){
		int[] b = new int[cnt];
		
		for(int i=0; i<cnt; i++){
			b[i] = a[i];
		}
		
		return b;
	}
}
