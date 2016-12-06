public class Arbeiter extends Mitarbeiter
{
   	private double stundenlohn;
   	private double anzahlStunden;
   	private double ueberstundenzuschlag;
   	private double anzahlUeberstunden;

	public Arbeiter(String name, double stundenlohn, double anzahlStunden,
	              	double ueberstundenzuschlag)
	{
		super(name);
		this.stundenlohn = stundenlohn;
		this.anzahlStunden = anzahlStunden;
		this.ueberstundenzuschlag = ueberstundenzuschlag;
	}

	public void setAnzahlUeberstunden(double anzUeberstunden)
	{
		this.anzahlUeberstunden = anzUeberstunden;
	}

   	public double berechneGehalt()
   	{
      	return this.stundenlohn * this.anzahlStunden + this.ueberstundenzuschlag * this.anzahlUeberstunden;
   	}
}

