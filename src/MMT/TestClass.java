package MMT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        long []res = new long[n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String []strArr = str.split(" ");
            long []arr = new long[strArr.length];
            for(int j = 0; j < strArr.length;j++) {
            	arr[j] = Long.parseLong(strArr[j]);
            }
            
            long maxHeightGap = ((arr[1] - arr[0]) > (arr[2] - arr[1])) ? (arr[1] - arr[0] - 1) : (arr[2] - arr[1] - 1);
            res[i] = maxHeightGap;
        }

        for(int i = 0; i < n;i++) {
            System.out.println(res[i]);
        }
    }
}
