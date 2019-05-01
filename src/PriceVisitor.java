
public class PriceVisitor implements Visitor {

	@Override
	public double visit(MobilePhone p) {
		double price = p.getPrice() * p.getQuantity();	// price is equal to price * quantity
		//price = price >= 400 ? price : price-30;
		if (p.getBrand().equalsIgnoreCase("Apple")) {
			price = price >= 400 ? price-30 : price;	// If it is an apple product with price >= 400, price = price - 30
		}
		else if (p.getBrand().equalsIgnoreCase("Samsung")) {
			price = p.getModel().equalsIgnoreCase("Galaxy S8") ? price*(0.8) : price; // If model is galaxy s8, price = price - 20%
		}
		System.out.println(p.getBrand() + " " + p.getModel() + " sold for "+ price + " Buying: " + p.getQuantity() );
		return price;
	}

	@Override
	public double visit(Laptop l) {
		double price = l.getPrice() * l.getQuantity();
		price = l.getBrand().equalsIgnoreCase("Microsoft") && l.getModel().equalsIgnoreCase("Surface") ? price*(.8): price;
		System.out.println(l.getBrand() + " " + l.getModel() + " sold for "+ price + " Buying: " + l.getQuantity() );
		return price;
	}

	@Override
	public double visit(VideoGame v) {
		double price = v.getPrice() * v.getQuantity();
		if (v.getBrand().equalsIgnoreCase("Sony")) {
			price = v.getModel().equalsIgnoreCase("Playstation") ?  price*(.8) : price;
		}
		else if (v.getBrand().equalsIgnoreCase("Microsoft")) {
			price = v.getModel().equalsIgnoreCase("Xbox One") && v.getQuantity() == 2 ? price*(.70) : price;
		}
		System.out.println(v.getBrand() + " " + v.getModel() + " sold for "+ price + " Buying: " + v.getQuantity() );
		return price;
	}
	
}
