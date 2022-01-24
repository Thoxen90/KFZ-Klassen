package kfz;

public class SchichtArbeiter extends Mitarbeiter {

	private double stundenSatz;
	private int anzahlStunden;

	public SchichtArbeiter(int id, String name, double stundenSatz) throws Exception {

		super(id, name);

	}

	public double einkommen() {
		return stundenSatz * anzahlStunden;
	}

	protected void setID(int id) throws Exception {
		if (id >= 3000 && id <= 3999)
			super.setId(id);
		else
			throw new Exception("Schichtarbeiter IDs müssen positiv und vierstellig sein und mit einer 3 beginnen");
	}

	public int getId() {
		return super.getId();
	}

	protected void setAnzahlStunden(int std) {
		this.anzahlStunden = std;
	}

	public double getStundenSatz() {
		return this.stundenSatz;
	}
	
	public int getAnzahlStunden() {
		return this.anzahlStunden;
	}

}
