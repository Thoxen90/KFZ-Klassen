package kfz;

public class Fahrer extends SchichtArbeiter {

	private String fuehrerscheinKlasse;
	
	public Fahrer(int id,String name,double stundenSatz, String fuehrerscheinKlasse) throws Exception {
		super(id,name,stundenSatz);
	}
	
	public void fahrenZu(KFZ fahrzeug,GPS Ziel) {
		fahrzeug.setAktuellePosition(Ziel);
	}

	
	public void setFuehrerscheinKlasse(String fuehrerscheinKlasse) {
		String[] zul�ssigeF�hrerscheine = {"B","C","D"};
		for(String s : zul�ssigeF�hrerscheine) {
			if(fuehrerscheinKlasse==s)
				this.fuehrerscheinKlasse = fuehrerscheinKlasse;
		}		
	}
	
	public String getFuehrerschein() {
		return this.fuehrerscheinKlasse;
	}
	
	public int getId() {
		return super.getId();
	}
	
}
