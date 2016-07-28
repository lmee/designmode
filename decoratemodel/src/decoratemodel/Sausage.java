package decoratemodel;

public class Sausage extends AccessoryDecorate {
	
	Pancake pancake= null;
	
	public Sausage(Pancake pancake){
		this.pancake = pancake;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.pancake.getDescription() + ",Sausage";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.pancake.cost()+1.5d;
	}

}
