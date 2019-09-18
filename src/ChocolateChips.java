/**
 * ChocolateChips.java - Class for chocolate chips, a topping for ice cream.  Extends ToppingsDecorator, which extends IceCream
 * Has a member for the ice cream it is a topping for.
 * @author Kevin Prince
 * @date September 18, 2019
 */
public class ChocolateChips extends ToppingsDecorator{
	private IceCream iceCream;
	
	ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public String toString() {
		return iceCream + " + chocolate chips";
	}

	@Override
	public double getCost() {
		return iceCream.getCost() + 0.3;
	}
	
}
