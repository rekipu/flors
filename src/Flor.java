
public class Flor {
	private String nom;
	private String color;
	private double preu;
	private static int id = 1;

	public Flor(String nom, String color, double preu) {
		this.nom=nom;
		this.color = color;
		this.preu = preu;
		this.id=id;
		id ++;
		
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setColor(String x) {
		color = x;
	}

	public String getColor() {
		return color;
	}

	public void setPreu(double x) {
		preu = x;
	}

	public double getPreu() {
		return preu;
	}
	
	public int getId() {
		return id;
	}
	public String toString() {
		return nom + ", ";
	}

}
