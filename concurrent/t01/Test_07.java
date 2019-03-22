/**
 * synchronized关键字
 * 同步方法 - 继承
 * 子类同步方法覆盖父类同步方法。可以指定调用父类的同步方法。
 * 相当于锁的重入。
 */
package concurrent.t01;

import java.util.concurrent.TimeUnit;

public class Test_07 {
	
	synchronized void m(){
		System.out.println("Super Class m start");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Super Class m end");
	}
	
	public static void main(String[] args) {
		new Sub_Test_07().m();
	}
	
}

class Sub_Test_07 extends Test_07{
	synchronized void m(){
		System.out.println("Sub Class m start");
		super.m();
		System.out.println("Sub Class m end");
	}
}
