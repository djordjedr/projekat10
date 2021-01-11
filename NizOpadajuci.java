import java.util.Scanner;

public class NizOpadajuci {

	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Unesite duzinu niza");
		 int duzina=sc.nextInt();
		 int [] niz= new int [duzina];
		 for (int i=0; i<duzina; i++) {
			 System.out.println("Unesite " + (i+1) + " clan niza");
			 niz[i] =sc.nextInt();
		 }

		}
		public static void sortirajNizRastuce(int [] niz) {
			for (int i=0; i< niz.length; i++) {
				for(int j=i+1; j<niz.length; i++) {
					if (niz [i] < niz [j]) {
						int pom=niz [i]; //pom vrednost
						niz [i]=niz[j];
						niz[j]=pom;
					}
				}

	}

}
}