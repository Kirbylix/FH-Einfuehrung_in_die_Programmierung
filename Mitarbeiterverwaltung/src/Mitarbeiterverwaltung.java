/*********** Aufgabe 4 ***********/
public class Mitarbeiterverwaltung
{
	public static void main(String[] args)
	{

		Angestellter ang1, ang2, ang3;
		Manager mg1, mg2;
		Mitarbeiter ma1;


		// Mitarbeiter erzeugen
		// F�r A4 geeignet anpassen
		ang1 = new Angestellter("Marc", 3000, 175, 50);
		ang2 = new Angestellter("Paul", 2500, 150, 50);
		ang3 = new Angestellter("Karin",2700, 160, 50);
		mg1 = new Manager("Sven", 4000, 100);
		mg1.setUmsatz(20);
		mg2 = new Manager("Susanne", 5000, 100);
		mg2.setUmsatz(55);

		ma1 = new Arbeiter("Donald Duck", 100.0, 240, 150.0);
		ma1.setName("Donaldinho");

		if(ma1 instanceof Arbeiter)
		{
			Arbeiter ea1 = (Arbeiter) ma1;
			ea1.setAnzahlUeberstunden(100);
		}
	}
}