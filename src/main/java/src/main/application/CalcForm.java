package src.main.application;

public class CalcForm {
	private double tall;
	private double heavy;
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public double getHeavy() {
		return heavy;
	}
	public void setHeavy(double heavy) {
		this.heavy = heavy;
	}
	public double getBMI() {
		double BMI=heavy/(tall*tall);
		return BMI;
	}

}
