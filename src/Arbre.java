
public class Arbre {
	private String nom;
	private double altura;
	private double preu;
	private static int id = 1;
	
	public Arbre(String nom, double altura, double preu) {
		this.nom=nom;
		this.altura = altura;
		this.preu = preu;
		this.id=id;
		id++;
		
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setAltura(double x) {
		altura = x;
	}
	
	public double getAltura() {
		return altura;
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
