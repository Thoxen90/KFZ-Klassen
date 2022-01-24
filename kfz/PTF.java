package kfz;

public class PTF extends KFZ {

	private Mitarbeiter[] passagiere;
	private int sitze;

	public PTF(double tankGroesse, double maxSpeed, GPS aktuellePosition, int sitze) throws Exception {
		super(tankGroesse, maxSpeed, aktuellePosition);
	}

	public double auslastung() {
		int tempCounter = 0;
		for(Mitarbeiter m:passagiere) {
			if(m!=null)
			tempCounter+= 1;
		}		
		return tempCounter/sitze;
	}

	public void setSitze(int sitze) {
		this.sitze = sitze;
	}

	public boolean einsteigen(Mitarbeiter passagier) {
		if (passagiere.length < sitze) {
			for (int i = 0; i < sitze; i++) {
				if (passagiere[i] == null) {
					passagiere[i] = passagier;
					return true;
				}
			}
		}
		return false;

	}

	public boolean einsteigenFahrer(Fahrer fahrer) {

		if (fahrer.getFuehrerschein() == "B"||fahrer.getFuehrerschein()=="D") {
			if (passagiere.length < sitze) {
				for (int i = 0; i < sitze; i++) {
					if (passagiere[i] == null) {
						passagiere[i] = fahrer;
						return true;
					}
				}
			}

		}
		return false;
	}
	
	public Mitarbeiter aussteigen(int vonSitzplatz) {
		Mitarbeiter tempMitarbeiter = passagiere[vonSitzplatz];
		passagiere[vonSitzplatz] = null;
		return tempMitarbeiter;
	}
	
	

	public void parken() {
		for(int i = 0; i < passagiere.length;i++)
			passagiere[i]=null;
		super.setMotorAn(false);
	}
	
	

}
