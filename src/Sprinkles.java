/**
 * Sprinkles.java - Class for Sprinkles, a topping for ice cream.  Extends ToppingsDecorator, which extends IceCream
 * Has a member for the ice cream it is a topping for.
 * @author Kevin Prince
 * @date September 18, 2019
 */
public class Sprinkles extends ToppingsDecorator{
	private IceCream iceCream;
	
	Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public String toString() {
		return iceCream + " + sprinkles";
	}

	@Override
	public double getCost() {
		return iceCream.getCost() + 0.2;
	}
	
}
