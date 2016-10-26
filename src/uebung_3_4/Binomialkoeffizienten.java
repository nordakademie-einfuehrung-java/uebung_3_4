package uebung_3_4;

public class Binomialkoeffizienten {

	public static void main(String[] args) {

		int n = 10, k = 10, nk = n - k;
		int nFakultaet = 1, kFakultaet = 1, nkFakultaet = 1;
		double loesung;

		// Berechnung der Fakultäten
		// Fakultät n
		for (int zaehler = 2; zaehler <= n; zaehler++) {
			nFakultaet = nFakultaet * zaehler;
		}

		// Fakultät k
		for (int zaehler = 2; zaehler <= k; zaehler++) {
			kFakultaet = kFakultaet * zaehler;
		}

		// Fakultät n-k
		for (int zaehler = 2; zaehler <= nk; zaehler++) {
			nkFakultaet = nkFakultaet * zaehler;
		}

		// Berechnung des Binomialkoeffizienten
		loesung = nFakultaet / (kFakultaet * nkFakultaet);

		// Ausgabe der Lösung
		System.out.println("Die Lösung ist: " + loesung);

	}

}
