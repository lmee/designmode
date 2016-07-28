package singletone;

/**
 * ����ģʽ�����ʵ����ͨ��˫�ؼ������ķ�ʽ������˶��߳��й�����������⡣
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
