package uebung_3_4;

public class Binominalkoeffizienten {

	public static void main(String[] args) {
		int n = 4;
		int nfak = 1;
		int k = 2;
		int kfak = 1;
		int nminusk = n-k;
		int nminuskfak = 1;
		
		for (int x = 2; x <= n; x++) {
			nfak = nfak * x;
		}
		
		for (int y = 2; y <= k; y++) {
			kfak = kfak * y;
		}
		
		for (int z = 2; z <= nminusk; z++) {
			nminuskfak = nminuskfak * z;
		}
		
		int nueberk = nfak/(kfak*nminuskfak);

		System.out.println("Der Binominalkoeffizient von n = " + n + " und k = " + k + " ist gleich " + nueberk + ".");
	}

}
