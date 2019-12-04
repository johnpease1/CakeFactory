
public class CakeFactory {
	public CakeBase createCake(String type) {
		if(type.equals("chocolate")) {
			return new ChocolateCake();
		}else if(type.equals("lemon")) {
			return new LemonCake();
		}else {
			return new VanillaCake();
		}
		
	}
}
