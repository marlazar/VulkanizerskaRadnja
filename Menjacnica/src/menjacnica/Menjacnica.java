package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String valuta, String vrsta, double kurs, GregorianCalendar datum) {
		
		Valuta valu = new Valuta();
		valu.setNaziv(valuta);
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setVrsta(vrsta);
		k.setVrednost(kurs);

		if (valute.contains(valu))
			throw new RuntimeException("Valuta vec postoji u bazi!");
		int obj = valute.indexOf(valu);

		valute.get(obj).getKursevi().add(k);
	}

	@Override
	public void obrisiKurs(String valuta, String vrsta, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vratiKurs(String valuta, String vrsta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}