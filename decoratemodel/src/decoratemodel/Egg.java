package decoratemodel;

public class Egg extends AccessoryDecorate {
	
	Pancake pancake =null;
	
	public Egg(Pancake pancake){
		this.pancake = pancake;
	}

	@Override
	public String getDescription() {
		return this.pancake.getDescription() + ",egg";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.pancake.cost() + 1;
	}

}
