package Beispiel.Ma;

import Beispiel.Abt.*;

public abstract class Mitarbeiter
{
	// Attribute
	private static int anzahlMitarbeiter = 0;

	private Abteilung dieAbteilung; // Referenz auf die zugehörige Abteilung

	private String name;
	private int personalnummer;

	// Konstruktor
	public Mitarbeiter(String name, Abteilung abt)
	{
		this.name = name;
		anzahlMitarbeiter++;
		this.personalnummer = anzahlMitarbeiter;

		// Assoziation vom Mitarbeiter zur Abteilung aufbauen
		this.setAbteilung(abt);
		// Assoziation von der Abteilung zum Mitarbeiter aufbauen
		abt.addMitarbeiter(this);
	}

	public abstract double berechneGehalt();

	public void setName(String neuerName)
	{
		this.name = neuerName;
	}

	public void setAbteilung(Abteilung abt)
	{
		this.dieAbteilung = abt;
	}

	public String getName()
	{
		return this.name;
	}

   	public int getPersonalnummer()
   	{
   		return this.personalnummer;
   	}

	public Abteilung getAbteilung()
	{
		return this.dieAbteilung;
	}

	/*
	 *	Überprüfung, ob zwei Mitarbeiter kollegen sind
	 */
	public boolean isKollege(Mitarbeiter m)
	{
		Abteilung a1 = this.getAbteilung();
		Abteilung a2 = m.getAbteilung();

		return this!=m && a1==a2;

		/* Kurzversion
		return this!=m && this.getAbteilung()==m.getAbteilung();
		*/
	}

	/*
	 *	Bestimmung aller Kollegen eines Mitarbeiters
	 */
	public Mitarbeiter[] bestimmeKollegen()
	{
		Mitarbeiter[] ergebnis = null;
		Abteilung a;
		int n;

		// Abteilung des Mitarbeiters bestimmen
		a = this.getAbteilung();

		// Mitarbeiter der Abteilung ohne ursprünglichen Mitarbeiter in Feld ablegen
		n = a.getAnzahlMitarbeiter();

		if (n>1)
		{
			ergebnis = new Mitarbeiter[n-1];
			int pos;

			pos = 0;
			for (int i=0; i<n; i++)
			{
				Mitarbeiter m = a.getMitarbeiter(i);
				if (this != m)
				{
					ergebnis[pos] = m;
					pos++;
				}
			}
		}

		return ergebnis;
	}
}
