
public class Binkoeff {

	public static void main(String[] args) {

		int n = 2;
		int n1 = 1;

		for (int zaehlern = 2; zaehlern <= n; zaehlern++) {
			n1 = n1 * zaehlern;
		}

		int k = 5;
		int k1 = 1;
		double loesung;

		for (int zaehlerk = 2; zaehlerk <= k; zaehlerk++) {
			k1 = k1 * zaehlerk;
		}

		int m = n - k;
		int m1 = 1;

		for (int zaehlerm = 2; zaehlerm <= m; zaehlerm++) {
			m1 = m1 * zaehlerm;
		}
		loesung = n1 / (k1 * m1);

		if (n >= k) {

			System.out.println("Wenn n=" + n + " und k=" + k + " ist, dann ist die Loesung " + loesung + " "
					+ ".");

		} else {
			System.out.println("Es kann kein Binomialkoeffizient berechnet werden, da k größer als n ist.");
		}

	}
}
