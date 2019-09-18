/**
 * ChocolateIceCream.java - Class to hold the cost and description of Chocolate ice cream.  Extends IceCream.
 * @author Kevin Prince
 * @date September 18, 2019
 */
public class ChocolateIceCream extends IceCream{
	
	ChocolateIceCream()
	{
		this.description = "Chocolate Ice Cream";
	}
	
	@Override
	public double getCost() {
		return 0.9;
	}

}
