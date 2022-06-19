import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(obj.readLine());
		int TE = 1500, PE = 1000, CPE = 3000;
		int n1=n, n2=n, n3=n;
		int a1 = 0, a2 = 0, a3 = 0, b1 = 0, b2 = 0, b3 = 0, sum1 = 0, sum2 = 0, sum3 = 0, P = 0, T = 0, C = 0;
		
		if(n < 4) {
		    return;
		}
		if(n > 4 && n <= 6) {
		    System.out.println("T:0 P:"+ (n-4)*PE+" C:0");
		}
		while(n1 > 4) {
		    a1 = n1 - 4;
		    b1 = a1 * PE;
		    sum1 += b1;
		    n1 = n1-4;
		    P++;
		}
		while(n2 > 5) {
		    a2 = n2 - 5;
		    b2 = a2 * TE;
		    sum2 += b2;
		    n2 = n2-5;
		    T++;
		}
		while(n3 > 10) {
		    a3 = n3 - 10;
		    b3 = a3 * CPE;
		    sum3 += b3;
		    n3 = n3-10;
		    C++;
		}
		if((sum1 > sum2) && (sum1 > sum3))
		System.out.println("T:"+ 0 +" P:"+ P +" C:"+0);
		else if((sum1 < sum2) && (sum2 > sum3))
		System.out.println("T:"+ T +" P:"+ 0 +" C:"+0);
		else
		System.out.println("T:"+ 0 +" P:"+ 0 +" C:"+C);
	}
}
