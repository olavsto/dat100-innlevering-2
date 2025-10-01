package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.println(" " + tabell[i]);
        }
        System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

        String streng = "[";
        for (int i = 0; i < tabell.length; i++) {
            streng += tabell[i];
            if (i < tabell.length - 1) {
                streng += ",";
            }
        }
        streng += "]";
        return streng;
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

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
	}

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        for(int i = 0; i< tabell.length; i++) {
            if (tabell[i]==tall) {
                return i;
            }
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {
        int[] reversert = new int[tabell.length];
        int index = 0;
        for(int i = tabell.length-1; i >= 0; i--) {
            reversert[index] = tabell[i];
            index++;
        }
        return reversert;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        boolean sortert = true;
        int forrige = Integer.MIN_VALUE;

        for(int i : tabell) {
            if(i<forrige){
                sortert = false;
            }
            forrige = i;
        }

        return sortert;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] sammensatt = new int[tabell1.length+tabell2.length];
        for(int i = 0; i< tabell1.length; i++) {
            sammensatt [i] = tabell1[i];
        }
        for(int i = 0; i< tabell2.length; i++) {
            sammensatt [i+tabell1.length] = tabell2[i];
        }
        return sammensatt;
    }
}
