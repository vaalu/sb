/**
 * 
 */
package in.jeani.learning.sb.multithreading.runnable;

/**
 * 
 */
public class RunnableMultiThreadDemo implements Runnable {
	
	private int threadId = 0;
	@Override
	public void run() {
		System.out.println("From Runnable.. am running.." + this.threadId);
	}
	/**
	 * @return the threadId
	 */
	public int getThreadId() {
		return threadId;
	}
	/**
	 * @param threadId the threadId to set
	 */
	public void setThreadId(int threadId) {
		this.threadId = threadId;
	}
}
