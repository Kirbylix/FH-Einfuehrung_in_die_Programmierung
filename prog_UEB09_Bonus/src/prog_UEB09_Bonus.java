/**
 * Ueb09 Bonusaufgabe
 * @author Kappis Kai
 * Matrikelnummer: 7092108
 * Studiengang: Informatik
 * Gruppenbuchstabe: H1
 */

public class prog_UEB09_Bonus {

	/**
	 * Hauptprogramm
	 * @param args Kommandozeilenparameter
	 **/
    public static void main(String[] args) {

		// Deklaration & Initialization
	    String name = "Kappis";								// Nachname
		int size = 16;										// groesse des 2D quatratische Array
	    char[][] field = new char[size][size];				// 2D-Array

		// initial bef�llung des 2D-Array
    	for(int i=0; i<field.length; i++)
    		for(int j=0; j<field[i].length; j++)
    			field[i][j] = 61;

		// Methoden aufrufen
		field = change(field, name);						// 2D-Array mit dem Kleinbuchstaben des Nachnamens f�llen
		ausgeben(field);									// 2D-Array ausgeben

    }

	/*
	 * Ausgabe des 2D-Array
	 * @param sField 2D-Array
	 */
    public static void ausgeben(char[][] sField) {

    	for(int z=0; z<sField.length; z++)				// f�r jede Zeile (z)
    	{	for(int s=0; s<sField[z].length; s++)		// f�r jede Spalte (s)
    		{
    			System.out.print(sField[z][s] + " ");	// Ausgabe des Array von der Zeile/ Spalte
    		}
    		System.out.println();						// Absatz
    	}
    	System.out.println();							// Absatz
    }

	/*
	 * bef�llt das 2-dimensionale Array mit dem Kleinbuchstabe des Nachnamens
	 * @param sField 2-dimensionale quadratische Array
	 * @param sName Nachname
	 * @return 2-dimensionale Array
	 */
	public static char[][] change(char[][] sField, String sName) {

		// Hilfs-/Variablen deklaration
		int input = (int) sName.charAt(0) + 32;					// Acii-Wert f�r den Kleinbuchstaben des Nachnamens
		int half = sField.length/2;								// die h�lfte von der L�nge des 2D-Array
		int start = half/2 - 1;									// Start-Spalte in der der Buchstabe beginnt

		for(int z=0; z<sField.length; z++)						// f�r jede Zeile (z) des 2D-Array
		{
			sField[z][start]= (char) input;						// setzt den Kleinbuchstabe in jede Zeile/ Startspalte
		}

		int count1 = sField.length-1;							// Counter f�r die L�nge des 2D-Array
		int count2 = 0;											// Counter zum Hochz�hlen
		do{
			sField[count2][count1-start]= (char) input;			// setzt den Kleinbuchstabe diagonal abw�rtz, rechts/oben -> mitte
			sField[count1][count1-start]= (char) input;			// setzt den Kleinbuchstabe diagonal aufw�rtz, rechts/unten -> mitte
			count1--;											// Counter1 um 1 verringern
			count2++;											// Counter2 um 1 erh�hen
		}while( count1>=half);


		if(sField.length%2 == 0)								// falls das 2D-Array eine gerade L�nge hat
		{
			for(int z=half-1; z<half+1; z++)					// f�r die 2 mittleren Zeilen
			{
				for( int s=start+1; s<half-start; s++)			// f�r die Spalten, zwischen der Startspalte und erreichen der Diagonalen
				{
					sField[z][s]= (char) input;					// setzt den Kleinbuchstaben an die entsprechende Zeile/ Spalte
				}
			}
		}else{													// falls das 2D-Array eine ungerade L�nge hat
			for( int s=start+1; s<half-start; s++)				// f�r die mittlere
			{
				sField[half][s]= (char) input;					// setzt den Kleinbuchstaben in der mittleren Zeile zwischen der Startspalte und erreichen der Diagonalen
			}
		}
		return sField;											// r�ckgabe des 2D-Array
	}
}
