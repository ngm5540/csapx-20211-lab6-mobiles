package mobiles;

/**
 * A node in the mobile tree.
 *
 * @author RIT CS
 * @author Nate Mount
 */
public interface Node {

	public String getName();
    
	public int getWeight();

	public int getImbalance();

	public boolean isBalanced();

}
