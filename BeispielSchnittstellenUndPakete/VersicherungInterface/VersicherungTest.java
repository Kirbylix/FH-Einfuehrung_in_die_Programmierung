public class VersicherungTest
{
	public static void main(String[] args)
	{
       	VersicherungI eineVersicherung;

        // Zuweisung eines VersicherungA-Objekts
       	eineVersicherung = new VersicherungA();

       	//Aufruf der Schnittstellen-Methode
       	//Da eineVersicherung auf VersicherungA-Objekt zeigt,
  		//wird Praemie mit Code von VersicherungA berechnet
       	double praemie = eineVersicherung.berechnePraemie(1500);
       	System.out.println("Praemie bei erster Versicherung: " + praemie);

//			Aufruf nicht möglich, da nicht in Schnittstelle
//       	praemie = eineVersicherung.berechneSonderpraemie(1500);

  		// jetzt Zuweisung eines VersicherungB-Objekts
  		eineVersicherung = new VersicherungB();

  		//eineVersicherung zeigt auf VersicherungB-Objekt
  		//Praemie wird mit Code von VersicherungB berechnet
  		praemie = eineVersicherung.berechnePraemie(1500);
       	System.out.println("Praemie bei zweiter Versicherung: " + praemie);

	}
}