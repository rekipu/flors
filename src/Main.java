
public class Main {
	public final String nom = "Happy Flower";

	public static void main(String[] args) {
		Floristeria laNova = new Floristeria("La Nova De La Rambla");
		laNova.crearArbre("xiprer", 1.65, 29.70);
		laNova.crearDeco("estrella", "fusta", 11.00);
		laNova.crearFlor("ponsetilla", "blava", 3);
		laNova.showStocks();

	}

}
