

public class Reservierungssystem
{
	public static void main(String[] args)
	{
		// Attraktionen erzeugen
		Attraktion EmpireStateBuilding = new Attraktion("Empire State Building", 29.0, 8, 23, 100);
		Attraktion TopOfTheRocks = new Attraktion("Top of the Rocks", 29.0, 8, 23, 25);
		Attraktion BrooklynBridge = new Attraktion("Brooklyn Bridge", 0.0, 0,23, 250);
		Attraktion StatueOfLiberty = new Attraktion("Statue of Liberty", 50.0, 9, 18, 100);
		Attraktion EllisIsland = new Attraktion("Ellis Island", 28.0, 9, 18, 100);
		Attraktion IntrepidMuseum = new Attraktion("Intrepid Sea, Air & Space Museum", 29.0, 10, 16, 50);
		Attraktion Starbucks = new Attraktion("Starbucks", 0.0, 5, 22, 10);

		// Reisegruppen erzeugen
		Reisegruppe Schulklasse = new Reisegruppe("Einstein-Gymnasium, Stufe 12", 67);
		Reisegruppe Paar = new Reisegruppe("Flitterwochen", 2);
		Reisegruppe Studienreise = new Reisegruppe("Studienreise", 80);
		Reisegruppe Segeltörn = new Reisegruppe("Segelregatta rund um die Welt", 6);

		// Buchungen
		System.out.println(Starbucks.buchen(Paar, 310, 8));
		System.out.println(EmpireStateBuilding.buchen(Paar, 310, 10));
		System.out.println(EmpireStateBuilding.buchen(Studienreise, 310, 14));
		System.out.println(EmpireStateBuilding.buchen(Schulklasse, 310, 15));
		System.out.println(IntrepidMuseum.buchen(Paar, 311, 9));
		System.out.println(IntrepidMuseum.buchen(Segeltörn, 311, 16));
		System.out.println();

		// Attraktionen ausgeben
		Starbucks.ausgebenTag(310);
		EmpireStateBuilding.ausgebenTag(310);
		IntrepidMuseum.ausgebenTag(311);
		System.out.println();

		// Reisegruppen ausgeben
		System.out.println(Schulklasse);
		System.out.println(Paar);
		System.out.println(Studienreise);
		System.out.println(Segeltörn);
	}
}