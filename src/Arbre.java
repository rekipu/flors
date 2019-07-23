
public class Arbre extends Product {
	
	private double altura;

	
	public Arbre(String nom, double altura, double preu) {
		super(nom, preu);
		this.altura = altura;
	
		
	}
	
	public void setAltura(double x) {
		altura = x;
	}
	
	public double getAltura() {
		return altura;
	}
	
	
}
