import java.util.ArrayList;

public class Floristeria {
	private String nom;
	ArrayList<Flor> llistaFlors = new ArrayList<>();  
	ArrayList<Arbre> llistaArbres = new ArrayList<>();  
	ArrayList<Decoracio> llistaDeco = new ArrayList<>();
	
	
	public Floristeria(String nom) {
		this.nom = nom;
	}
	
	public void crearFlor(String nom, String color, double preu) {
		Flor flor = new Flor(nom, color, preu);
		llistaFlors.add(flor);
		
	}
	
	public void crearArbre(String nom, double altura, double preu) {
		Arbre arbre = new Arbre(nom, altura, preu);
		llistaArbres.add(arbre);
		
	}
	
	public void crearDeco(String nom, String mat, double preu) {
		Decoracio deco = new Decoracio(nom, mat, preu);
		llistaDeco.add(deco);
		
	}
	
	public void showStocks() {
		System.out.println("ARBRES: ");
		System.out.println(llistaArbres);
		System.out.println("FLORS: ");
		System.out.println(llistaFlors);
		System.out.println("DECORACIO: ");
		System.out.println(llistaDeco);
	}
	

}
