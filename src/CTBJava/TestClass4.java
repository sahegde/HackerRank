package CTBJava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class TestClass4 {
	static BigInteger [][]map = null;
	private static BigInteger findRoutes(int x,int y) {
		if(x < 0 || y < 0 || (x == 0 && y ==0)) {
			return BigInteger.ZERO;
		}
		
		if(map[x][y].equals(BigInteger.ZERO)) {
			map[x][y] = findRoutes(x-1,y).add(findRoutes(x, y-1));
			return map[x][y];
		}else {
			return map[x][y];
		}
	}
	
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        BigInteger []res = new BigInteger[T];
        
        for (int i = 0; i < T; i++) {
        	String []point = br.readLine().split(" ");
        	int x = Integer.parseInt(point[0]);
        	int y = Integer.parseInt(point[1]);
        	int biggest = (x > y) ? x : y;

        	map = new BigInteger[biggest+1][biggest+1];
        	for (BigInteger[] row: map)
        	    Arrays.fill(row, new BigInteger("0"));
        	
        	for(int k = 0;k <= biggest;k++) {
        		map[k][0] = BigInteger.ONE;
        	}
        	for(int k = 0;k <= biggest;k++) {
        		map[0][k] = BigInteger.ONE;
        	}
        	map[1][1] = new BigInteger("2");
        	
        	res[i] = findRoutes(x,y);
        	
        }

        for(int i = 0; i < T;i++) {
            System.out.println("Case #"+(i+1)+": "+(res[i].mod(new BigInteger("7000000000"))));
        }
    }
}
