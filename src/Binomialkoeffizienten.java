
public class Binomialkoeffizienten {

	public static void main(String[] args) {
	
		int n = 4;
		int k = 2;
		int nk = n - k;
		
				
		int fn = 1;
		int fk = 1;
		int fnk = 1;
				
		
		for (int i=1; i<=n; i++) {
			fn = fn * i;
		}
		
		for (int i=1; i<=k; i++) {
			fk = fk * i;
		}

		for (int i=1; i<=nk; i++) {
			fnk = fnk * i;
		}

		double ergebnis = fn / (fk * fnk);
				
		System.out.println("Binomialkoeffizient: " + n + " über " + k + " = " + ergebnis);

	}

}
