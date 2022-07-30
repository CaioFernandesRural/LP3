
public class Retangulo {

	private double comprimento;
	private double largura;
	
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getPerimetro() {
		double perimetro = (2 * largura) + (2 * comprimento);
		return perimetro;
	}
	public double getArea() {
		double area = largura * comprimento;
		return area;
	}
}