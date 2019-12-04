
public class CakeStore {
	//data member
	private CakeFactory factory;
	String type;

	//constructor
	public CakeStore(CakeFactory cakeFactory) {
		this.factory=cakeFactory;
	}
	
	//member method
	public CakeBase onlineOrder(String type) {
		//ordering cake
		CakeBase cake = factory.createCake(type);
		
		//prepare, bake, and box the cake
		cake.prepare();
		cake.bake();
		cake.box();
		return cake;
	}
}
