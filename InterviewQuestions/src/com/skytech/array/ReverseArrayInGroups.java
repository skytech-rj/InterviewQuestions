package com.skytech.array;

public class ReverseArrayInGroups {

	public static void main(String[] args) {
		int[] ar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int n = 3;

		//reverseArray(ar);

		reverseArrayInGroupsOfGivenSize(ar, n);

	}

	private static void reverseArray(int[] ar) {
		int len = ar.length;
		int left = 0, right = len - 1;
		while (left < right) {
			int temp = ar[left];
			ar[left] = ar[right];
			ar[right] = temp;
			left++;
			right--;
		}
		
		for(int i= 0; i<len; i++){
			System.out.println(ar[i]);
		}
	}

	private static void reverseArrayInGroupsOfGivenSize(int[] ar, int k) {
		int len = ar.length;
		for(int i=0; i< len; i=i+k){
			int left=i;
			int right= Math.min(len, i+k)-1;
			while (left < right) {
				int temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
			
		}
		System.out.println("Reversed in groups:");
		for(int i= 0; i<len; i++){
			System.out.println(ar[i]);
		}
	}

}
