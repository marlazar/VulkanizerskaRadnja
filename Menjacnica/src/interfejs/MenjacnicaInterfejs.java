package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String valuta, String vrsta, double kurs, GregorianCalendar datum);

	public void obrisiKurs(String valuta, String vrsta, GregorianCalendar datum);

	public Kurs vratiKurs(String valuta, String vrsta, GregorianCalendar datum);

}