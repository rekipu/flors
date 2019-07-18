
public class Decoracio {
	private String nom;
	private String material;
	private double preu;
	private static int id = 1;

	public Decoracio(String nom, String material, double preu) {
		this.nom=nom;
		this.material = material;
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

	public void setMaterial(String x) {
		material = x;
	}

	public String getMaterial() {
		return material;
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
