/**
 * 
 */
package in.jeani.learning.sb.lambda;

/**
 * 
 */
public interface FunctionalInterfaceSimple {

	void abstractFunctional(int x);
	default void regularFunctional(int x) {
		System.out.println("From regular functional interface...");
	}
}
