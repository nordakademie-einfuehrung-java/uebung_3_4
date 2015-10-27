
public class Binomialkoeffizienten {

		public static void main(String[] args) {
	
				int k = 1;
				int n = 5;
				int loesungn = 1;
				int loesungk = 1;
				int loesungnk = 1;
				  
		     for (int zaehler = 2; zaehler <= n; zaehler++) {
		    	 loesungn = loesungn * zaehler ;
		    	}
		     for (int zaehler = 2; zaehler <= k; zaehler++) {
		 		loesungk = loesungk * zaehler;   
		     	}
		     for (int zaehler = 2; zaehler <= (n-k); zaehler++) {
			 		loesungnk = loesungnk * zaehler;   
			     	}
		     	
		       int Binominalkoeffizient = loesungn / (loesungk * loesungnk);
		     	
		    		   System.out.println("n = " + n);
		    		   System.out.println("k = " + k);
		    		   System.out.println(n + " über " + k + " = " + Binominalkoeffizient);
		    		  
		}				
			
			
	}

