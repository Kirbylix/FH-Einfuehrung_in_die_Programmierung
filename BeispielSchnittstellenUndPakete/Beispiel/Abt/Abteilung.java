package Beispiel.Abt;

import Beispiel.Ma.*;

public class Abteilung
{
	// Attribute
	private static final int MAX_MITARBEITER = 15;
	private int anzMitarbeiter;
	private Mitarbeiter[] dieMitarbeiter; // Feld von Referenzen auf Mitarbeiter
	private String bezeichnung;

	// Konstruktor
	public Abteilung(String bezeichnung)
	{
		dieMitarbeiter = new Mitarbeiter[MAX_MITARBEITER];
		anzMitarbeiter = 0;
		this.bezeichnung = bezeichnung;
	}

	// Methoden
	public String getBezeichnung()
	{
		return bezeichnung;
	}
	/*
	 * 	Liefert die Anzahl der zugeordneten Mitarbeiter als Ergebnis
	 */
	public int getAnzahlMitarbeiter()
	{
		return anzMitarbeiter;
	}

	/*
	 *	Fügt eine Verbindung von einer Abteilung zu einem Mitarbeiter hinzu
	 */
	public void addMitarbeiter(Mitarbeiter mit)
	{
		if (anzMitarbeiter < MAX_MITARBEITER)
		{
			dieMitarbeiter[anzMitarbeiter] = mit;
			anzMitarbeiter++;
		}
	}

	/*
	 *	Liefert eine Referenz auf den i-ten Mitarbeiter
	 */
	public Mitarbeiter getMitarbeiter(int i)
	{
		Mitarbeiter ergebnis = null;

		if (0 <= i && i < anzMitarbeiter)
			ergebnis = dieMitarbeiter[i];

		return ergebnis;
	}

	/*
	 *	Berechnet die Summe der Gehälter
	 */
	public double berechneGehaltskosten()
	{
		double summe = 0;

		for (int i = 0; i < anzMitarbeiter; i++)
			summe += dieMitarbeiter[i].berechneGehalt();

		return summe;
	}

}