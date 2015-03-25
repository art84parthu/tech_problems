package coding.interviews.arrays;

import java.util.*;

/*
 * Find common elements between arrays
 * arrays contain numbers in any order
 * duplicates might be there
 * but no two arrays are completely the same
 */
public class ArrayCompare {
	
	/*
	 * Array compare for just 2 arrays
	 */
	public static int[] getCommonElements(int[] A, int[] B){
		int lenA = A.length;
		int lenB = B.length;
		
		int[] smallArray = lenA < lenB ? A : B;
		int[] bigArray = lenA < lenB ? B : A;
		
		int[] common = new int[smallArray.length];
		int index = 0;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i=0; i<smallArray.length; i++){
			if(map.get(smallArray[i]) == null){
				map.put(smallArray[i], true);
			}
		}
		
		for(int i=0; i<bigArray.length; i++){
			if(map.get(bigArray[i]) != null){
				common[index] = bigArray[i];
				index++;
			}
		}
		return common;
	}
	
	
	/*
	 * Array compare for N arrays
	 */
	public static int[] getCommonElements(List<int[]> arrays){
		int count = 0;
		int numberOfArrays = arrays.size();
		int[] common = null;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int visitArrayCount = 0;
		int[] smallest = findSmallest(arrays);
		populateMapWithSmallest(smallest, map);
		visitArrayCount++;
		
		for(int[] arr : arrays){
			if(!areArraysEqual(arr, smallest)){
				visitArrayCount++;
				for(int i: arr){
					Integer value = map.get(i);
					if(value != null){
						//To accomodate duplicates
						if(value == (visitArrayCount - 1)){
							value++;
							map.put(i, value);
							if(value == numberOfArrays){
								count++;
							}
						}
					}
				}
			}
		}
		
		if(count > 0){
			common = new int[count];
			int index = 0;
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
				Integer key = entry.getKey();
				Integer value = map.get(key);
				if(value == numberOfArrays){ //Then only its present in all given arrays
					common[index] = key;
					index++;
				}
			}
		}
		
		return common;
	}
	
	private static int[] findSmallest(List<int[]> arrays){
		int[] smallest = arrays.get(0);
		for(int[] arr : arrays){
			if(arr.length < smallest.length){
				smallest = arr;
			}
		}
		return smallest;
	}
	
	private static void populateMapWithSmallest(int[] smallest, HashMap<Integer, Integer> map){
		for(int i: smallest){
			map.put(i, 1);
		}
	}
	
	private static boolean areArraysEqual(int[] a, int[] b){
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
	
	public static void main(String[] args){
		int[] a = new int[] {3, 5, 7, 1, 6};
		int[] b = new int[] {5, 2, 7, 2, 6, 3};
		int[] c = new int[] {2, 7, 9, 10, 3, 5, 6};
		int[] d = new int[] {3, 5, 3, 5, 23, 6, 12, 7, 9};
		int[] e = new int[] {13, 6, 5, 3, 7, 11};
		
		List<int[]> list = new ArrayList<int[]>();
		list.add(a); list.add(b); list.add(c); list.add(d); list.add(e);
		
		int[] r1 = getCommonElements(a, e);
		int[] r2 = getCommonElements(list);

		printArray(r1);
		printArray(r2);
	}
	
	private static void printArray(int[] r){
		System.out.print("\n[");
		int i=0;
		for(; i<r.length-1; i++){
			System.out.print(r[i] + ",");
		}
		System.out.print(r[i] + "]");
	}
}

