package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String valuta, String vrsta, double kurs, GregorianCalendar datum) {
		
		Valuta val = new Valuta();
		val.setNaziv(valuta);
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setVrsta(vrsta);
		k.setVrednost(kurs);

		if (valute.contains(val))
			throw new RuntimeException("Valuta vec postoji u bazi!");
		int obj = valute.indexOf(val);

		valute.get(obj).getKursevi().add(k);
	}

	@Override
	public void obrisiKurs(String valuta, String vrsta, GregorianCalendar datum) {
		
		Valuta val = new Valuta();
		val.setNaziv(valuta);
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setVrsta(vrsta);

		if (!valute.contains(val))
			throw new RuntimeException("Valuta se ne nalazi u bazi!");
		int obj = valute.indexOf(val);

		if (valute.get(obj).getKursevi().contains(k))
			valute.get(obj).getKursevi().remove(k);
		else
			throw new RuntimeException("Ne postoji kurs za taj dan!");

	}

	@Override
	public Kurs vratiKurs(String valuta, String vrsta, GregorianCalendar datum) {
		
		Valuta val = new Valuta();
		val.setNaziv(valuta);
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setVrsta(vrsta);

		int obj = 0;

		if (!valute.contains(val))
			obj = valute.indexOf(val);
		else
			throw new RuntimeException("Valuta se ne nalazi u bazi!");

		if (!valute.contains(val))
			throw new RuntimeException("Valuta se ne nalazi u bazi!");
		obj = valute.indexOf(val);

		if (valute.get(obj).getKursevi().contains(k))
			return k;
		else
			throw new RuntimeException("Ne postoji kurs za taj dan!");
	}

}