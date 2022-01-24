package kfz;

public class Manager extends BueroArbeiter{

	private double bonusSatz;
	
	public Manager(int id, String name, double festgehalt, double bonusSatz) throws Exception{
		super(id, name, festgehalt);
	}
	
	public double einkommen() {
		return Math.round(((super.getFestgehalt()+berechneBonus())*100)/100);
	}
	
	public double berechneBonus() {
		return super.getFestgehalt()/100*bonusSatz;
	}
	
	public String toString() {
		return super.getId()+" "+super.getName()+" "+einkommen();
	}
	
	protected void setID(int id) throws Exception{
		if (id>=5000&&id <=5099)
			super.setId(id);
		else
			throw new Exception("Manager IDs müssen positiv und vierstellig sein und mit einer 50 beginnen");
	}
}
