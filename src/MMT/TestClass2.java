package MMT;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TestClass2 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {
			String []inpArr = br.readLine().split(" ");
			int n = Integer.parseInt(inpArr[0]);
			int m = Integer.parseInt(inpArr[1]);
			int q = Integer.parseInt(inpArr[2]);
			
			int [][]board = new int[n][m];
			
			List<Point> lPoints = new ArrayList<Point>();
			
			for(int j = 0; j < q;j++) {
				String []positions = br.readLine().split(" ");
				int x = Integer.parseInt(positions[0]);
				int y = Integer.parseInt(positions[1]);
				
				board[x][y] = 1;
				
				Point p = new Point(x,y);
				lPoints.add(p);
			}
			
			Map<Point,Boolean> visited = new HashMap<Point,Boolean>();	
			visited.put(lPoints.get(0), true);
			
			List<Integer> sizeOfIndependantPaths = new ArrayList<Integer>(); 
			
			int [][]possibleMoves = {{1,2},{2,1},{-1,2},{-2,-1},{-2,-1},{-1,-2},{2,-1},{1,-2}};
			Stack<Point> s = new Stack<Point>();
			for(int k = 0; k < 8;k++) {
				if((lPoints.get(0).getX() + possibleMoves[k][0] > 0) && (lPoints.get(0).getX() + possibleMoves[k][0] < n) 
						&& (lPoints.get(0).getY() + possibleMoves[k][1] > 0) && (lPoints.get(0).getY() + possibleMoves[k][1] < m)) {
					if(board[(int)lPoints.get(0).getX() + possibleMoves[k][0]][(int)lPoints.get(0).getY() + possibleMoves[k][1]] == 1) {
						s.push(new Point((int)lPoints.get(0).getX() + possibleMoves[k][0],(int)lPoints.get(0).getY() + possibleMoves[k][1]));
					}
				}
			}

			while(!s.isEmpty()) {
				Point p = s.pop();
				for(int k = 0; k < 8;k++) {
					if(!visited.get(p)) {
						if((p.getX() + possibleMoves[k][0] > 0) && (p.getX() + possibleMoves[k][0] < n) 
								&& (p.getY() + possibleMoves[k][1] > 0) && (p.getY() + possibleMoves[k][1] < m)) {
							if(board[(int)p.getX() + possibleMoves[k][0]][(int)p.getY() + possibleMoves[k][1]] == 1) {
								s.push(new Point((int)p.getX() + possibleMoves[k][0],(int)p.getY() + possibleMoves[k][1]));
							}
						}
					}
				}
			}
		}
    }
}
