package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	public void sayHello() {
		System.out.println("say Hello");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	
}
