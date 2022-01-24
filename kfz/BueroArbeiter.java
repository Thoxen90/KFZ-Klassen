package kfz;

public class BueroArbeiter extends Mitarbeiter{

	private double festgehalt;
	
	public BueroArbeiter(int id, String name, double festgehalt) throws Exception {
		super(id,name);
		setFestgehalt(festgehalt);
		
	}
	
	public void setFestgehalt(double festgehalt) {
		this.festgehalt=festgehalt;
	}
	
	public double einkommen() {
		return festgehalt;
	}
	
	public String toString() {
		return this.getId()+" "+this.getName()+" "+this.festgehalt;
	}
	
	public double getFestgehalt() {
		return this.festgehalt;
	}
	
	protected void setId(int id) throws Exception {
		if(id>=5000&&id<=5999) 
			super.setId(id);
		else
			throw new Exception("BueroArbeiter IDs müssen positiv und vierstellig sein und mit einer 5 beginnen");
		
	}
	
	
	
}
