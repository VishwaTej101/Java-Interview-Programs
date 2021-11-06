import java.util.*;

public class SwapTwoNumberWithThird {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	int n1=s.nextInt();
	
	int n2=s.nextInt();
	
    
   System.out.println(swap(n1,n2));
    
  
    	}

	private static String swap(int n1, int n2) {
	
		 int cont=n1+n2;
	     n1=cont-n1;
	     n2=cont-n2;
	     
	     return(n1+" "+n2);
	     
	     
	     
	     
	    
		
	}

}
