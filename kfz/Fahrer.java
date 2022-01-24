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
		String[] zulässigeFührerscheine = {"B","C","D"};
		for(String s : zulässigeFührerscheine) {
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
