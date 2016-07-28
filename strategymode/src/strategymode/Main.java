package strategymode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mduck = new ModelDuck();
		mduck.setFlyBehavior(new FlyNoWay());
		mduck.setQuackBehavior(new Quack());
		mduck.performFly();
		mduck.performQuack();
		mduck.display();
	}

}
