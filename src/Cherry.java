/**
 * Cherry.java - Class for cherry, a topping for ice cream.  Extends ToppingsDecorator, which extends IceCream
 * Has a member for the ice cream it is a topping for.
 * @author Kevin Prince
 * @date September 18, 2019
 */
public class Cherry extends ToppingsDecorator{
	private IceCream iceCream;
	
	Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public String toString() {
		return iceCream + " + a cherry on top";
	}

	@Override
	public double getCost() {
		return iceCream.getCost() + 0.4;
	}
	
}
