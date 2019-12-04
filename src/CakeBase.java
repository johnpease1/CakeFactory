import java.util.ArrayList;

public abstract class CakeBase {
	//data members
	protected String cakeName;
	protected String baseFlavor;
	protected ArrayList<String> ingredients;

	
	//member methods
	public void prepare() {
		System.out.println("Preparing "+ this.toString());
		
	}
	
	public void bake() {
		System.out.println("Baking "+ this.toString());
	}
	
	public void box() {
		System.out.println("Boxing "+ this.toString() + "\n");
	}
	public String toString() {
		return cakeName + " with a base flavor of " + baseFlavor;
	}
	
}
