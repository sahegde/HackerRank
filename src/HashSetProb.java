import java.util.HashSet;
import java.util.Scanner;


public class HashSetProb {
	private static Scanner sc;
    public static void main(String[] args) {
    	sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.nextLine());
    	int []res = new int[n];
    	int count = 0;
    	HashSet<String> h = new HashSet<String>();
    	for(int i = 0; i < n;i++) {
    		String input = sc.nextLine();
    		if(!h.contains(input)) {
    			count++;
        		h.add(input);
    		}
    		res[i] = count;
    	}
    	
    	for(int i = 0; i < n;i++) {
    		System.out.println(res[i]);
    	}
    }
}
