package decoratemodel;

public class Underback extends AccessoryDecorate {
	
	Pancake pancake = null;
	
	public Underback(Pancake pancake){
		this.pancake = pancake;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.pancake.getDescription()+",Underback ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.pancake.cost() + 1;
	}

}
