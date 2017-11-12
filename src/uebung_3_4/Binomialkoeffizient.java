package uebung_3_4;

public class Binomialkoeffizient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int k = 9;
		double zaehler =1;
		double kfakultaet = 1;
		double nminuskfakultaet = 1;
		int y = n - k;

		for (int x = 1; x <= n; x = x + 1) {
			zaehler = zaehler * x;
		}
		for (int x = 1; x <= k; x = x + 1) {
			kfakultaet = kfakultaet * x;
		}
		for (int x = 1; x <= y; x = x + 1) {
			nminuskfakultaet = nminuskfakultaet * x;
		}
		double nenner = nminuskfakultaet * kfakultaet;
		double ergebnis = zaehler / nenner;
		System.out.println("Das Ergebnis von " + n + " über " + k + " ist " + ergebnis);
}

}
