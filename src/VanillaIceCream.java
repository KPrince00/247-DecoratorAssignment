/**
 * VanillaIceCream.java - Class to hold the cost and description of vanilla ice cream.  Extends IceCream.
 * @author Kevin Prince
 * @date September 18, 2019
 */
public class VanillaIceCream extends IceCream{
	
	VanillaIceCream()
	{
		this.description = "Vanilla Ice Cream";
	}
	
	@Override
	public double getCost() {
		return 0.75;
	}

}
