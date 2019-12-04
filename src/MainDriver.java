
public class MainDriver {

	public static void main(String[] args) {
		//create factory
		CakeFactory factory = new CakeFactory();
		
		//create store
		CakeStore redlandsStore = new CakeStore(factory);
		
		CakeBase cake1 = redlandsStore.onlineOrder("lemon");
		CakeBase cake2 = redlandsStore.onlineOrder("chocolate");
		CakeBase cake3 = redlandsStore.onlineOrder("vanilla");
		

	}

}
