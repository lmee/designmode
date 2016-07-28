package singletone;

/**
 * 单例模式的最佳实践。通过双重检查加锁的方式，解决了多线程中共享带来的问题。
 * @author Administrator
 *
 */

public class Singletone {
	
	private volatile static Singletone singletone = null;
	
	private Singletone(){}
	
	public static Singletone getSingleInstance(){
		
		if(singletone == null){
			synchronized (Singletone.class) {
				if(singletone == null){
					singletone = new Singletone();
				}
			}
		}
		return singletone;
	}
}
