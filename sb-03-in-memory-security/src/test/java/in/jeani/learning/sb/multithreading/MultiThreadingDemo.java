/**
 * 
 */
package in.jeani.learning.sb.multithreading;

/**
 * 
 */
public class MultiThreadingDemo extends Thread {

	@Override
	public void run() {
		System.out.println("I am running with id: " + this.getId());
	}
	
}
