import java.io.*;
import java.util.*;
import java.lang.reflect.*;

class Prime extends PrimeChecker{

	public void checkPrime(int... a) {
        int []res = new int[a.length];
        int count = 0;
        for(int i = 0; i < a.length;i++) {
            for(int j = 2; j < a[i]/2;j++) {
                if(a[i] % j == 0) {
                    res[count++] = a[i];
                    break;
                } 
            }
        }
        
        for(int i = 0; i < res.length && res[i] != 0;i++) {
            System.out.println(res[i]);
        }
    }
}

public class PrimeChecker {
	public static void main(String[] args) {
		try{
			InputStream in = System.in;
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
