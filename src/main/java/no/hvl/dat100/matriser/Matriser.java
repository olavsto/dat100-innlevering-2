package no.hvl.dat100.matriser;

import java.util.InputMismatchException;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int i = 0; i< matrise.length; i++) {
            for(int j = 0; j< matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String s = "";
        for(int i = 0; i< matrise.length; i++) {
            for(int j = 0; j< matrise[i].length; j++) {
                s += matrise[i][j] + " ";
            }
            s += "\n";
        }
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skalert = new int[matrise.length][matrise[0].length];
	    for(int i = 0; i< matrise.length; i++) {
            for(int j = 0; j< matrise[i].length; j++) {
                skalert [i][j] = matrise[i][j]*tall;
            }
        }
        return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {


        if(a.length != b.length || a[0].length != b[0].length) {

            return false;
        }
		for(int i = 0; i< b.length; i++) {
            for(int j = 0; j< b[i].length; j++) {
                if(a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

        if(matrise.length != matrise[0].length) {
            throw new InputMismatchException("Matrisen er ikke kvadratisk og kan derfor ikke speiles!");
        }

		int[][] speilet = new int[matrise.length][matrise[0].length];

        for(int i = 0; i< matrise.length; i++) {
            for(int j = 0; j< matrise[i].length; j++) {
                speilet[i][j] = matrise[j][i];
            }
        }

	    return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] multiplisert = new int[a.length][b[0].length];
        if(a[0].length != b.length) {
            throw new InputMismatchException("De to matrisene kan ikke multipliseres!");
        }
        /*for(int i = 0; i< multiplisert.length; i++) {
            for(int j = 0; j< multiplisert[i].length; j++) {
                for(int k = 0; k < a[i].length; k++) {
                    int m = 0;
                    for(int l = 0; l < b.length; l++) {
                        m += a[i][k]*b[l][j];
                    }
                    multiplisert[i][j] = m;
                }
            }
        }*/

        for(int i = 0; i< multiplisert.length; i++) {
            for(int j = 0; j< multiplisert[i].length; j++) {
                int m = 0;

                for(int k = 0; k < a[i].length; k++) {
                    m += a[i][k]*b[k][j];
                }

                multiplisert[i][j] = m;
            }
        }

        return multiplisert;
	}
}
