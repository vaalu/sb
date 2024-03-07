/**
 * 
 */
package in.jeani.learning.sb.lambda;

/**
 * 
 */
public class SimpleLambda {

	public SimpleLambda() {
		testNormalInterface();
		testFunctionalCustomImpl();
	}
	
	private void testNormalInterface() {
		FunctionalInterfaceSimple simple = new FunctionalInterfaceSimple() {
			@Override
			public void abstractFunctional(int x) {
				System.out.println("After anonymous interface...");
			}
		};
		simple.regularFunctional(20);
		simple.abstractFunctional(0);
	}
	
	private void testFunctionalCustomImpl() {
		FunctionalInterfaceSimple custom = (int x) -> System.out.println("This is custom implementation..."+x);
		custom.abstractFunctional(15);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Lambda sample");
		new SimpleLambda();
	}
}
