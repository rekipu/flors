
public class Product {
	protected String nom;
	protected double preu;
	protected static int id = 1;

	public Product(String nom, double preu) {
		this.nom=nom;
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



