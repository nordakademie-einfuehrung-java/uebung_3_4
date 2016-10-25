package uebung_3_4;

public class Binomialkoeffizienten {

	public static void main(String[] args) {

		int loesung = 1 ;
		
		int n = 7;
		int loesungVonN = 1;

		for (int zaehler = 2; zaehler <= n; zaehler++) {
			loesungVonN = loesungVonN * zaehler;

		}

		int k = 5;
		int loesungVonK = 1;

		for (int zaehler = 2; zaehler <= k; zaehler++) {
			loesungVonK = loesungVonK * zaehler;

		}

		
		int nminusk = n-k;
		int loesungVonNminusK = 1;

		for (int zaehler = 2; zaehler <= nminusk; zaehler++) {
			loesungVonNminusK = loesungVonNminusK * zaehler;

		}
	
	loesung = loesungVonN / loesungVonK * loesungVonNminusK;
	
	System.out.println(loesung);
	
	}

}
