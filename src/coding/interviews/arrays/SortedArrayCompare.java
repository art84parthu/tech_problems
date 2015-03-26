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
		
		common = ArrayUtil.trimArr(common, i+1);
		
		return common;
	}
	
	public static void main(String[] args){
		int[] a = new int[]{2, 4, 6, 8, 9};
		int[] b = new int[]{4, 7, 8, 9, 12};
		
		int[] c = getCommonElements(a, b);
		
		ArrayUtil.printArray(c);
	}
	
}
