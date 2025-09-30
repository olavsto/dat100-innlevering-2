package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

<<<<<<< HEAD
        for (int i = 0; i < tabell.length; i++) {
            System.out.println(" " + tabell[i]);
        }
        System.out.println();
=======
		//int[] tabell = {1, 2, 3, 4, 5};

		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");

>>>>>>> 57d269381a573d44df99f95c2abb1445bf313f53
	}

	// b)
	public static String tilStreng(int[] tabell) {

       // String tabell = tabell;
       // int[] tabell = {42, 67, 89};

        System.out.println();

		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

        int sum = 0;
        for(int i = 0; i <= tabell.length-1; i++) {
            sum = sum + tabell[i];
        }
        return sum;
    }

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
