public class Dose
{
	// Variablen deklaration
	private double _radius;
	private double _hoehe;

	// Konstruktor
	public Dose(double sRadius, double sHoehe)
	{
		this._radius = sRadius;
		this._hoehe = sHoehe;
	}

	// Getter / Setter
	public double getRadius()
	{
		return _radius;
	}
	public double getHoehe()
	{
		return _hoehe;
	}

	// Methoden
	public double berechneUmfang()
	{
		return 2 * Math.PI * _radius;
	}

	public double berechneDeckelflaeche()
	{
		return Math.PI * _radius * _radius;
	}

	public double berechneMantelflaeche()
	{
		return berechneUmfang() * _hoehe;
	}

	public double berechneOberflaeche()
	{
		return 2 * berechneDeckelflaeche() + berechneMantelflaeche();
	}

	public double berechneVolumen()
	{
		return berechneDeckelflaeche() * _hoehe;
	}
}