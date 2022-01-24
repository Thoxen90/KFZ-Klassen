package kfz;

public class Bus extends PTF{
	
	private Mitarbeiter[] passagiere;
	private int sitze;
	
	public Bus(double tankGroesse, double maxSpeed, GPS aktuellePosition, int sitze) throws Exception {
		super(tankGroesse, maxSpeed, aktuellePosition, sitze);
	}
	
	public boolean einsteigenFahrer(Fahrer fahrer) {
		if(fahrer.getFuehrerschein()=="D") {
			super.setFahrer(fahrer);
			return true;
		}
		return false;
	}
	
	public void setPassagiere(Mitarbeiter[] passagiere) {
		this.passagiere = passagiere;
	}
	
	public void setSitze(int sitze) {
		this.sitze = sitze;
	}
	
	public Mitarbeiter[] getPassagiere() {
		return passagiere;
	}
	
	public int getSitze() {
		return this.sitze;
	}
}
