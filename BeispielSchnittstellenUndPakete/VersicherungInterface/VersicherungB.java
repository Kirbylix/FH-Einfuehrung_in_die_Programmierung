public class VersicherungB implements VersicherungI
{
	// Implementierung der abstrakten Methode mit if
	// und anderen Prämien als VersicherungA
    public double berechnePraemie(double vsumme)
    {
        double praemie = 0.0;
        // Lösung mit if
		if(vsumme > 10000.0)
		{
			praemie = vsumme * 9.0 / 1000.0;
		}
	 	else if(vsumme <= 5000.0)
	 	{
			praemie = vsumme * 18.7 / 1000.0;
	 	}
		else
		{
			praemie = vsumme * 13.5 / 1000.0;
		}

		return (double)Math.floor((double)(praemie * 100.0)) / 100.0;
	}
	// Es gibt keine Sonderprämien
}
