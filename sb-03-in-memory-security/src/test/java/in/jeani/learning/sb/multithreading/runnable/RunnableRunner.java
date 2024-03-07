/**
 * 
 */
package in.jeani.learning.sb.multithreading.runnable;

/**
 * 
 */
public class RunnableRunner {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			RunnableMultiThreadDemo runnable = new RunnableMultiThreadDemo();
			runnable.setThreadId(i);
			new Thread(runnable).start();
		}
	}
	
}
