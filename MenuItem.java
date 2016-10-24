//author Yolanda Gandy "Creating constructors, setters and getters"

package Week6Assessment;

/**Write a class called MenuItem that includes private fields name and price.*/

public class MenuItem {
	
	private String name;
	private double price;	
	
	/**Add a constructor that sets name and price*/
	public MenuItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/**Add a second no-argument constructor that leaves both name and 
	price unset*/
	public MenuItem(){
	super();	
	}
	
	/**Add a getter and a setter for both name and price.*/
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}//ends class MenuItem
