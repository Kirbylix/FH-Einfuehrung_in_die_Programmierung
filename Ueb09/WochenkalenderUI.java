import java.util.*;

public class WochenkalenderUI
{
	// Objektattribute
	private Scanner sc;
	private Wochenkalender derKalender;

	// Konstruktor
	public WochenkalenderUI()
	{
		sc = new Scanner(System.in);
		derKalender = new Wochenkalender();
	}

	// Hilfsmethoden zum Einlesen von Tastatur mit �berpr�fung
	private int einlesenInt(String text, int min, int max)
	{
		int ergebnis;
		do
		{
			// Text f�r Benutzer ausgeben
			System.out.println(text);
			ergebnis = sc.nextInt();
		} while (ergebnis < min || ergebnis > max);

		return ergebnis;
	}

	private String einlesenString(String text)
	{
		String ergebnis;

		System.out.println(text);
		ergebnis = sc.next();

		return ergebnis;
	}

	// Methode zur formatierten Ausgabe des Wochenkalenders
	private void ausgeben()
	{
		System.out.println("      Mo          Di          Mi          Do          Fr          Sa          So");
		for (int stunde = 0; stunde < 24; stunde++)
		{
			if (stunde < 10)
				System.out.print(" ");
			System.out.print(stunde + "    ");
			for (int tag = 1; tag <= 7; tag++)
			{
				// Darstellung des Termins auf 12 Zeichen zurechtschneiden
				String eintrag = derKalender.abfragenTermin(tag, stunde) + "            ";
				System.out.print(eintrag.substring(0,11)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	// Methode zum Starten der Benutzerinteraktion
	public void start()
	{
		int aktion;
		int tag, vonStunde, bisStunde;
		String eintrag;

		do
		{
			System.out.println("Welche Aktion wollen Sie durchf�hren?");
			System.out.println("1) Termin eintragen");
			System.out.println("2) Langtermin eintragen");
			System.out.println("3) SerienTermin eintragen");
			System.out.println("4) Termin entfernen");
			System.out.println("5) Termin anzeigen");
			System.out.println("6) Kalender darstellen");
			System.out.println("sonst: Beenden");

			aktion = sc.nextInt();

			switch(aktion)
			{
				case 1:
					tag = einlesenInt("Bitte Tag eingeben (1-7)", 1, 7);
					vonStunde = einlesenInt("Bitte Stunde eingeben (0-23)", 0, 23);
					eintrag = einlesenString("Bitte Eintrag eingeben");
					derKalender.eintragenTermin(tag, vonStunde, eintrag);
					break;
				case 2:
					tag = einlesenInt("Bitte Tag eingeben (1-7)", 1, 7);
					System.out.println("von Stunde");
					vonStunde = einlesenInt("Bitte Stunde eingeben (0-23)", 0, 23);
					System.out.println("bis Stunde");
					bisStunde = einlesenInt("Bitte Stunde eingeben (0-23)", 0, 23);
					eintrag = einlesenString("Bitte Eintrag eingeben");
					derKalender.eintragenLangtermin(tag, vonStunde, bisStunde, eintrag);
					break;
				case 3:
					vonStunde = einlesenInt("Bitte Stunde eingeben (0-23)", 0, 23);
					eintrag = einlesenString("Bitte Eintrag eingeben");
					derKalender.eintragenSerientermin(vonStunde, eintrag);
					break;
				case 4:
					tag = einlesenInt("Bitte Tag eingeben (1-7)", 1, 7);
					System.out.println("von Stunde");
					vonStunde = einlesenInt("Bitte Stunde eingeben (0-23)", 0, 23);
					derKalender.entferneTermin(tag, vonStunde);
					break;
				case 5:
					tag = einlesenInt("Bitte Tag eingeben (1-7)", 1, 7);
					System.out.println("von Stunde");
					vonStunde = einlesenInt("Bitte Stunde eingeben (0-23)", 0, 23);
					System.out.println("Termin: " + derKalender.abfragenTermin(tag, vonStunde));
					break;
				case 6:
					ausgeben();
					break;
				default:
					System.exit(0);
					break;
			}
		} while (1 <= aktion && aktion <= 5);
	}
}