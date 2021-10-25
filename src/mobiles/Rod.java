package mobiles;

/**
 * Represent a rod in the mobile tree.
 *
 * @author RIT CS
 * @author Nate Mount
 */
public class Rod implements Node {
    
	private String name;
	private int cordLength;
	private int leftArmLen, rightArmLen;
	private Node leftChild, rightChild;

	public Rod(String name, int cordLength, int leftArmLength, Node leftChild, int rightArmLength, Node rightChild){

		this.name = name;
		this.cordLength = cordLength;
		this.leftArmLen = leftArmLength;
		this.rightArmLen = rightArmLength;
		this.leftChild = leftChild;
		this.rightChild = rightChild;

	}
		
	@Override
	public String toString() { return "ROD(name="+this.name+", cord="+this.cordLength+", leftArm="+this.leftArmLen+", leftChild="+this.leftChild+", rightArm="+this.rightArmLen+", rightChild="+this.rightChild; }
	
	@Override
	public int getWeight(){ return this.leftChild.getWeight() + this.rightChild.getWeight(); }

	@Override
	public boolean isBalanced(){
		return ( this.leftArmLen * leftChild.getWeight() == this.rightArmLen * this.rightChild.getWeight() );
	}
	
	@Override
	public String getName(){ return this.name;  }

	@Override
	public int getImbalance(){ return 0; } //To be changed

}
