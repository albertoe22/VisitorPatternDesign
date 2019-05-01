public class VideoGame implements Product{
	private String brand;
	private String model;
	private double price;
	private int quantity;
	
	public VideoGame(String brand,String model, double price,int quantity) {
		this.setBrand(brand);
		this.setModel(model);
		this.setPrice(price);
		this.setQuantity(quantity);
	}
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
