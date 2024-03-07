/**
 * 
 */
package in.jeani.learning.sb.multithreading;

/**
 * 
 */
public class ThreadRunnerSample {

	public static void main(String[] args) {
		MultiThreadingDemo demo1 = new MultiThreadingDemo();
		MultiThreadingDemo demo2 = new MultiThreadingDemo();
		MultiThreadingDemo demo3 = new MultiThreadingDemo();
		
		for (int i = 0; i < 10; i++) {
			new MultiThreadingDemo().start();
		}
	}
	
}
