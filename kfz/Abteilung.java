package kfz;

import java.util.ArrayList;

public class Abteilung {

	private String name;
	private ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
	private Manager leiter;
	
	public Abteilung(String name, Manager leiter) {
		setName(name);
		mitarbeiter.add(leiter);
		setLeiter(leiter);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLeiter(Manager leiter) {
		this.leiter = leiter;
	}
	
	public void add(Mitarbeiter neuer) {
		mitarbeiter.add(neuer);
	}
	
	public void remove(Mitarbeiter welcher) {
		mitarbeiter.remove(welcher);
	}
	
	public Manager changeLeiter(Manager neuer) {
		mitarbeiter.remove(leiter);
		mitarbeiter.add(neuer);
		setLeiter(neuer);
		return(neuer);
	}
	
	public String gehaltsliste() {
		String gehaltsliste="";
		gehaltsliste+=getName()+"\n"+"_____________________________________________________";
		for(Mitarbeiter m : mitarbeiter) {
			
			gehaltsliste+=m.getName()+": "+m.einkommen()+" €\n";
		}
		
		return gehaltsliste;
	}
	
	public String getName() {
		return this.name;
	}
}
