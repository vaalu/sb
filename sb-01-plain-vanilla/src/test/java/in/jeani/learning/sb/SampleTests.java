/**
 * 
 */
package in.jeani.learning.sb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class SampleTests {

	public SampleTests() {
		testCollection();
	}
	private void testHashing() {
		
	}
	private void testCollection() {
		List<String> lsItems = new ArrayList<String>();
		lsItems.add("a");
		lsItems.add("b");
		lsItems.add("c");
		lsItems.add("d");
		lsItems.add("e");
		
		String str = lsItems.stream().map(item -> item).collect(Collectors.joining());
		System.out.println("Concatenated: " + str);
		
		lsItems.forEach(System.out::println);
		
		
	}
	public static void main(String[] args) {
		new SampleTests();
	}
}
