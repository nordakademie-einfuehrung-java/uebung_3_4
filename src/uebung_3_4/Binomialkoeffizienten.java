package uebung_3_4;

public class Binomialkoeffizienten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int k=2;
		int binomialkoeffizient;
		
		int nfakultaet=1;
		int kfakultaet=1;
		int nminusk = n - k;
		int nminuskfakultaet=1;
		
		for (int zaehler = 2; zaehler <= n; zaehler++)
		{
			nfakultaet = nfakultaet * zaehler;
		}
		for (int zaehler = 2; zaehler <= k; zaehler++)
		{
			kfakultaet = kfakultaet * zaehler;
		}
		for (int zaehler = 2; zaehler <= nminusk; zaehler++)
		{
			nminuskfakultaet = nminuskfakultaet * zaehler;
		}
		
		binomialkoeffizient = nfakultaet / (kfakultaet * nminuskfakultaet);
		
		
		System.out.println(binomialkoeffizient);
		
	}

}
