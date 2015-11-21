package Utils;

import java.util.Scanner;

public class parse2DArray {
	public static int[][] parseArray(int n, Scanner sc) {
		int [][]arr = new int[n][n];
		for(int i = 0; i < n;i++) {
			String str = sc.nextLine();
			String []strArr = str.split(" ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(strArr[j]);
			}
		}
		return arr;
	}
}
