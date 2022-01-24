package kfz;

public class GPS {

	private double laengengrad;
	private double breitengrad;

	public GPS(double laengengrad, double breitengrad) throws Exception {
		setLaengenGrad(laengengrad);
		setBreitenGrad(breitengrad);
	}

	public void setLaengenGrad(double laengengrad) throws Exception {
		if (laengengrad >= 0 && laengengrad <= 360)
			this.laengengrad = laengengrad;
		else
			throw new Exception("Es kann nur ein Laengengrad zwischen 0 und 360 Grad angegeben werden");
	}

	public void setBreitenGrad(double breitengrad) throws Exception {
		if (breitengrad >= -90 && breitengrad <= 90)
			this.breitengrad = breitengrad;
		else
			throw new Exception("Es kann nur ein Breitengrad zwischen -90 und 90 Grad angegeben werden");
	}

	public double getLaengenGrad() {
		return this.laengengrad;
	}

	public double getBreitenGrad() {
		return this.breitengrad;
	}

}
