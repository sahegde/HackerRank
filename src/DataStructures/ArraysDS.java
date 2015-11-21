package DataStructures;

import java.util.*;

public class ArraysDS {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = Integer.parseInt(sc.nextLine());
        String arrStr = sc.nextLine();
        String []arrValues = arrStr.split(" ");
        int []arr = new int[n];
        int []reverseArr = new int[n];
        for(int i = 0; i < n;i++) {
        	arr[i] = Integer.parseInt(arrValues[i]);
        	reverseArr[n-i-1] = arr[i];
        }
        
        for(int i = 0;i < n;i++) {
        	System.out.print(reverseArr[i]+" ");
        }
    }
}
