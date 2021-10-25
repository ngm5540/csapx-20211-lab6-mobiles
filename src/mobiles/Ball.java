package mobiles;

/**
 * Represents a ball in the mobile tree.
 *
 * @author RIT CS
 * @author Nate Mount
 */
public class Ball implements Node{

	private String name;
	private int cordLen;
	private int radius;
	private int weight;

	public Ball(String name, int cordLength, int radius, int weight){

		this.name = name;
		this.cordLen = cordLength;
		this.radius = radius;
		this.weight = weight;

	}
	
	@Override
	public String toString() {return "Ball(name="+this.name+", cord="+this.cordLen+", radius="+this.radius+", weight="+this.weight+")";}

	@Override
	public int getWeight(){ return weight; }
	
	@Override
	public boolean isBalanced(){ return true; }

	@Override 
	public String getName(){ return this.name; }

	@Override
	public int getImbalance(){ return 0; }
	
}
