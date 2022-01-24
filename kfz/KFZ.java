package kfz;

public abstract class KFZ {

	private double tankGroesse;
	private double tankInhalt;
	private Fahrer fahrer;
	private boolean motorAn;
	private GPS aktuellePosition;
	private double maxSpeed;

	public KFZ(double tankGroesse, double maxSpeed, GPS aktuellePosition) throws Exception {
		setTankGroesse(tankGroesse);
		setMaxSpeed(maxSpeed);
		setAktuellePosition(aktuellePosition);
	}

	public void fahrenZu(GPS ziel) throws Exception {
		if (this.getMotorAn() == true)
			setAktuellePosition(ziel);
		else
			throw new Exception("Motor ist ausgeschaltet");
	}

	public void parken() {
		aussteigen();
	}

	public double tanken(double liter) throws Exception {
		double Überfluss;

		Überfluss = tankInhalt - tankGroesse + liter;
		if (Überfluss >= 0) {
			setTankInhalt(tankGroesse);
			return Überfluss;
		} else {
			setTankInhalt(tankInhalt + liter);
			return 0;
		}
	}

	public boolean einsteigenFahrer(Fahrer fahrer) {

		if (fahrer.getFuehrerschein() == "") {
			setFahrer(fahrer);
			return true;
		} else {
			return false;
		}
	}

	public void setAktuellePosition(GPS position) {
		this.aktuellePosition = position;
	}

	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer;
	}

	public void setTankInhalt(double liter) throws Exception {
		if (liter <= tankGroesse)
			this.tankInhalt = liter;
		else
			throw new Exception("TankInhalt überschreitet Tankgroesse");
	}

	public void setMaxSpeed(double kmh) throws Exception {
		if (kmh < 1000)
			this.maxSpeed = kmh;
		else
			throw new Exception("sehr unwahrscheinlich");
	}

	public void setTankGroesse(double liter) {
		this.tankGroesse = liter;
	}

	public Mitarbeiter aussteigen() {
		Mitarbeiter temp = fahrer;
		setFahrer(null);
		return temp;
	}

	public boolean getMotorAn() {
		return this.motorAn;
	}

	public GPS getAktuellePosition() {
		return this.aktuellePosition;
	}

	public double getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMotorAn(boolean MotorAn) {
		this.motorAn = MotorAn;
	}

	public abstract double auslastung();
}
