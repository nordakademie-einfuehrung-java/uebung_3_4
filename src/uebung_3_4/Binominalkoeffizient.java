package uebung_3_4;

public class Binominalkoeffizient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fakultaetn = 7;
		int fakultaetk = 5;
		int nminusk = fakultaetn - fakultaetk;
		double fakultaetN = 1;
		double fakultaetK = 1;
		double NminusK = 1;
		/*fakultaetN = fakultaetn;
		fakultaetK = fakultaetk; */
		for ( int x = 1 ; x <= fakultaetn; x = x + 1){
			
			fakultaetN = fakultaetN * x;
			
		};
		
		for (int x = 1; x <= fakultaetk; x = x + 1){
			fakultaetK = fakultaetK * x;
			
		};
		
		for (int x = 1; x <= nminusk; x = x + 1){
			NminusK = NminusK * x;
			
		};
		
		System.out.println("(" + fakultaetn + ")" + "    " + fakultaetN);
		System.out.println("(  ) = --------- =" + (fakultaetN/ (fakultaetK * NminusK)));	
		System.out.println("(" + fakultaetk + ")     " + fakultaetK + "*" + NminusK);
		
		
			
		
		
		
	}

}
