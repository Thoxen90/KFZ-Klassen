package kfz;

import java.util.ArrayList;

public class Verwaltung {

	private ArrayList<KFZ> fuhrpark = new ArrayList<KFZ>();
	private ArrayList<Mitarbeiter> personal = new ArrayList<Mitarbeiter>();
	private ArrayList<SchichtArbeiter> malocher = new ArrayList<SchichtArbeiter>();
	private ArrayList<Abteilung> abteilungen = new ArrayList<Abteilung>();
	
	public void add(KFZ neues) {
		fuhrpark.add(neues);
	}
	
	public void remove(KFZ altes) {
		fuhrpark.remove(altes);
	}
	
	public void add(Mitarbeiter neuen) {
		personal.add(neuen);
	}
	
	public void remove(Mitarbeiter welcher) {
		personal.remove(welcher);
	}
	
	public void add(SchichtArbeiter neuen) {
		malocher.add(neuen);
	}
	
	public void remove(SchichtArbeiter welcher) {
		malocher.remove(welcher);
	}
	
	public void add(Abteilung neue) {
		abteilungen.add(neue);
	}
	
	public void remove(Abteilung welche) {
		abteilungen.remove(welche);
	}
	
	public void arbeitsTag() {
		for(SchichtArbeiter s : malocher)
			s.setAnzahlStunden(s.getAnzahlStunden()+8);
	}
	
}
