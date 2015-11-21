import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	private static Scanner sc;
	
	private static boolean isSibling(char s,char r) {
		boolean areSiblings = false;
		if(s == '{' && r == '}') {
			areSiblings = true;
		}else if(s == '(' && r == ')') {
			areSiblings = true;
		}else if(s == '[' && r == ']'){
			areSiblings = true;
		}
		return areSiblings;
	}
	
	public static void main(String[] argh) {
		sc = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		List<Boolean> res = new ArrayList<Boolean>();
		while (sc.hasNext()) {
			String input = sc.next();
			for(int i = 0; i < input.length();i++) {
				if(s.isEmpty()) {
					s.push(input.charAt(i));
				}else {
					if(isSibling(s.peek(), input.charAt(i))) {
						s.pop();
					}else {
						s.push(input.charAt(i));
					}
				}
			}
			if(s.size() != 0) {
				res.add(false);
			}else {
				res.add(true);
			}
			s.clear();
		}
		
		for(int i = 0; i < res.size();i++) {
			System.out.println(res.get(i));
		}
	}
}
