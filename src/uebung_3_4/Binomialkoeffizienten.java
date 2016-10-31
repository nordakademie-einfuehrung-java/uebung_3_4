package uebung_3_4;

public class Binomialkoeffizienten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n=7;
		double k=1;
		double nFakultaet=1;
		double kFakultaet=1;
		double nk= n-k;
		double nkFakultaet=1;
		
		for (double zaehler = 2; zaehler <= n; zaehler++) {
			nFakultaet = nFakultaet * zaehler;
		};
		for (double zaehler = 2; zaehler <= k; zaehler++) {
			kFakultaet = kFakultaet * zaehler;
		};
		for (double zaehler = 2; zaehler <= nk; zaehler++) {
			nkFakultaet = nkFakultaet * zaehler;
		};
	
		double Binomialkoeffizient= (nFakultaet)/(kFakultaet*nkFakultaet);
		
		System.out.println(
			     "Der Binomialkoeffizient von " + n+ " und "+k + " ist " + Binomialkoeffizient + "."
			);

	}}

