
public class Media {
	double Av1;
	double Av2;
	
	public Media(double a, double b) {
		this.Av1 = a;
		this.Av2 = b;
	}
	public double calcularMedia() {
		return ((Av1 + Av2) / 2);
	}
}
