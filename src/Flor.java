
public class Flor extends Product{

	private String color;

	public Flor(String nom, String color, double preu) {
		super(nom, preu);
		this.color = color;
		
	}

	public void setColor(String x) {
		color = x;
	}

	public String getColor() {
		return color;
	}


}
