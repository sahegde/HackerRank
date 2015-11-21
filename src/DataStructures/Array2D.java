package DataStructures;

import java.util.Scanner;

import Utils.parse2DArray;

public class Array2D {
	
	public Array2D() {
		
	}
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 6;
		int [][]arr = parse2DArray.parseArray(n, sc);
		int [][]hourGlassPoints = {{-1,-1},{-1,0},{-1,1},{1,-1},{1,0},{1,1}};
		
		int maxsum = Integer.MIN_VALUE;
		for(int i=1;i < n-1;i++) {
			for(int j=1; j < n-1;j++) {
				int sum = 0;
				sum += arr[i][j];
				for(int k = 0; k < n;k++) {
					sum += arr[i+hourGlassPoints[k][0]][j+hourGlassPoints[k][1]];
				}
				if(sum > maxsum) {
					maxsum = sum;
				}
			}
		}
		System.out.println(maxsum);
	}
    
}
