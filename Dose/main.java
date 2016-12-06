import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

       ArrayList<Dose> _dose = new ArrayList<Dose>();

       _dose.add(new Dose(10.0, 1.0));
       _dose.add(new Dose(1.0, 10.0));

       for(Dose dose: _dose)
       {
       		System.out.println("Dose:");
       		System.out.println("Radius:" + dose.getRadius());
       		System.out.println("Höhe:" + dose.getHoehe());
			System.out.println("Umfang: " + dose.berechneUmfang());
			System.out.println("Deckelfläche: " + dose.berechneDeckelflaeche());
			System.out.println("Mantelfläche: " + dose.berechneMantelflaeche());
			System.out.println("Oberflaeche: " + dose.berechneOberflaeche());
			System.out.println("Volumen: " + dose.berechneVolumen());
			System.out.println("- - - - - - - - - - - - - - - - - - - - ");
       }
    }
}
