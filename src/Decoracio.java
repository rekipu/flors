
public class Decoracio extends Product{
	private String material;

	public Decoracio(String nom, String material, double preu) {
		super(nom, preu);
		this.material = material;		
	}

	public void setMaterial(String x) {
		material = x;
	}

	public String getMaterial() {
		return material;
	}


}
