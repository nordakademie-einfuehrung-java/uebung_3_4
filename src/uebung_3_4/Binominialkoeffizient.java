package uebung_3_4;

public class Binominialkoeffizient {

	public static void main(String[] args) {
		int n = 3;
		int nfak = 1;
		int k = 2;
		int kfak = 1;
		int nkfak = 1;

		for (int zahl = 1; zahl<=n; zahl=zahl+1)
		{nfak=zahl*nfak;};
			
		for (int zahl = 1; zahl<=k; zahl= zahl+1)
		{kfak=zahl*kfak;};	
			
		for (int zahl = 1; zahl<=n-k; zahl= zahl+1)
		{nkfak=zahl*nkfak;};
		
		double ergebnis = nfak / (kfak*nkfak);
		
		System.out.println("Der Binomialkoeffizient für n = " + n + " und für k = " + k + " ist " + ergebnis + ".");
		
	}

}
