package CTBJava;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass3 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        Long [][]diffSalary = new Long[T][T];
        
        for (int i = 0; i < T; i++) {
        	int N = Integer.parseInt(br.readLine());
    		String []ramSalaries = br.readLine().split(" ");
    		String []shyamSalaries = br.readLine().split(" ");
    	
    		for(int j = 0; j < N;j++) {
    			long ramDaySalary = Long.parseLong(ramSalaries[j]);
    			long shyamDaySalary = Long.parseLong(shyamSalaries[j]);
    			if(ramDaySalary != shyamDaySalary) {
    				diffSalary[i][0] = ramDaySalary;
    				diffSalary[i][1] = shyamDaySalary;
    				break;
    			}
    		}
        	
        }

        for(int i = 0; i < T;i++) {
            System.out.println(diffSalary[i][0]+" "+diffSalary[i][1]);
        }
    }
}
