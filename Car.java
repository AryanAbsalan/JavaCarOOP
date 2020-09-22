import java.text.DecimalFormat;

    

public class Car {

	// class for formatting the double numbers : Price
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	// private
	private String color;
	private String model;
	private double price;

	// getter and setter for color
	public String getColor() {
		// send the private color back
		return this.color;
	}

	public void setColor(String newColor) {
		// set the private color
		this.color = newColor;
	}

	// getter and setter for model
	public String getModel() {
		// send the private model back
		return this.model;
	}

	public void setModel(String newModel) {
		// set the private model
		this.model = newModel;
	}

	// getter and setter for price
	public double getPrice() {
		// send the private price back
		return this.price;
	}

	public void setPrice(double newPrice) {
		// set the private price
		this.price = newPrice;
	}

	// Method VAT16()
	public void VAT16() {
		double priceAndVAT16 = this.price + (this.price * 16) / 100;
		// formatting the priceAndVAT16 
		System.out.println("The price of the car pluss 16% VAT :" +  df2.format(priceAndVAT16));
	}

	// Method VAT19()
	public void VAT19() {
		double priceAndVAT19 = this.price + (this.price * 19) / 100;
		// formatting the priceAndVAT16 
		System.out.println("The price of the car pluss 19% VAT :"+  df2.format(priceAndVAT19));
	}

	// Method Info()
	public void Info() {

		System.out.println("Color of the car:" + this.color);
		System.out.println("Model of the car:" + this.model);
		System.out.println("Price of the car:" + this.price);
	}
	
	
	public static void main(String[] args) {
			 Car BMW = new Car();
	    	 BMW.setColor("Black");
	    	 BMW.setModel("Full-size luxury SUV");
	    	 BMW.setPrice(109000.99);
	    	 BMW.Info();
	    	 BMW.VAT16();
	    	 BMW.VAT19();
	    	
	System.out.println("################################################################" );
	
	 Car Ford = new Car();
			  Ford.setColor("Red");
			  Ford.setModel("Ford Mustang");
			  Ford.setPrice(112000.99);
			  Ford.Info();
			  Ford.VAT16();
			  Ford.VAT19();

	}


}

