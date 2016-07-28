package decoratemodel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pancake pie = new Piecake();
		pie=new Egg(pie);
		pie=new Sausage(pie);
		pie=new Underback(pie);
		
		System.out.println(pie.getDescription()+"<--->"+pie.cost());
	}

}
