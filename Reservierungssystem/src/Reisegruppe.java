
public class Reisegruppe {
	
	private String name;
	private int anzPersonen;
	private double gesamtkosten;
	
	public Reisegruppe(String name, int anzPersonen)
	{
		this.name = name;
		this.anzPersonen = anzPersonen;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAnzPersonen()
	{
		return this.anzPersonen;
	}
	
	public void bezahlen(double preis)
	{
		
	}
	

}
