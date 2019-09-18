/**
 * StrawberryIceCream.java - Class to hold the cost and description of Strawberry ice cream.  Extends IceCream.
 * @author Kevin Prince
 * @date September 18, 2019
 */
public class StrawberryIceCream extends IceCream{
	
	StrawberryIceCream()
	{
		this.description = "Strawberry Ice Cream";
	}
	
	@Override
	public double getCost() {
		return 0.75;
	}

}
