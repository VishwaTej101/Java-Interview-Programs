import java.util.*;

public class Fibnaccoi_Series{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		// 0 1 1 2 3 5 fibnaccoi series 
		
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<n;i++) {
			int n3=n1+n2;
			
		System.out.print(" "+n3);
        
		n1=n2;
		n2=n3;
		}
	}
}