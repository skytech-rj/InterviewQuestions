package com.st.matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } 
			};
			
			printSpiralOfMatrix(arr);
	}

	private static void printSpiralOfMatrix(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		int r=0,c=0,i;
		while(r<m && c<n){
			
			for(i=c; i<n; i++){
				System.out.println(arr[r][i]);
			}
			r++;
			for(i=r; i<m; i++){
				System.out.println(arr[i][n-1]);
			}
			n--;
			if(r<m){
				for(i=n-1;i>=c;i--){
					System.out.println(arr[m-1][i]);
				}
				m--;
			}
			
			if(c<n){
				for(i=m-1; i>=r; i--){
					System.out.println(arr[i][c]);
				}
				c++;
			}
			
			
		}
		
	}
}
