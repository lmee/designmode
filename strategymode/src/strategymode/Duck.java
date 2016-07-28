package strategymode;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	
	protected QuackBehavior quackBehavior;
	
	public Duck(){
		
	}

	public void swim(){
		System.out.println("I' m Swimming!!!!!");
	}
	
	public void setFlyBehavior(FlyBehavior  fb){
		flyBehavior = fb ;
	};
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb ;
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public abstract void display();
	
}
