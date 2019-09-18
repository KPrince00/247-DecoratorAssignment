/**
 * IceCream.java - Abstract class IceCream to be inherited from by other flavors.
 * Contains a string for description, and toString and getCost (abstract) methods.
 * @author Kevin Prince
 * @date September 18, 2019
 */
public abstract class IceCream {
	protected String description;
	
	public String toString() {
		return description;
	}
	
	public abstract double getCost();
}
