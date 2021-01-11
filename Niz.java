import java.util.Scanner;

public class Niz {

	public static void main(String[] args) {
		/*
		 * Napisti program koji sa standardnog ulaza ucitava duzinu niza I zatim sve
		 * element niza. Niz proslediti funkciji koja vraca zbir svih parnih clanova
		 * niza. Na standardni izlaz ispisati taj zbir.
		 * 
		 * 
		 * 
		 */
		int zbir;
		int duzina=1;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Unesi duzinu niza");
		duzina = sc.nextInt();
		
		}
		while (duzina<=0);
		int niz[] = new int[duzina];

		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesi " + (i + 1) + ". clan niza");

			niz[i] = sc.nextInt();
		}
		zbir = zbirParnihClanova( niz);
		System.out.println("Zbir parnih brojeva niza je :" + zbir);
	}

	// Ispisati na standardni izlaz pozicije u nizu svih parnih brojeva.
	public static int zbirParnihClanova( int n[]) {
		int z = 0;
		System.out.print("Parni broj se nalazi na: ");
		for (int i = 0; i < n.length; i++) {

			if (n[i] % 2 == 0) {
				z = z + n[i];
				System.out.print((i + 1) + "");
			}

		}
		return z;
	}
}
