package uebung_3_4;

public class uebung_3_4 {

	public static void main(String[] args) {

		int n = 4;
		int k = 2;
		
		int fakultaetn = 1;
		for (int zaehler = 2; zaehler <= n; zaehler++){
			fakultaetn = fakultaetn *zaehler;}
		
		int fakultaetk = 1;
		for (int zaehler = 2; zaehler <= k; zaehler++){
			fakultaetk = fakultaetk *zaehler;}
		
		int fakultaetnk = 1;
		for (int zaehler = 2; zaehler <= (n-k); zaehler++){
			fakultaetnk = fakultaetnk * zaehler;}
				
		double Binomialkoeffizient = fakultaetn /(fakultaetk * fakultaetnk);
		
		System.out.println(
		"Der Binomialkoeffizient von " + n + " über " + k + " ist " + Binomialkoeffizient +".");
		
	}

}
