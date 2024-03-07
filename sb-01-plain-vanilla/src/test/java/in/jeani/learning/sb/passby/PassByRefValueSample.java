/**
 * 
 */
package in.jeani.learning.sb.passby;

/**
 * 
 */
public class PassByRefValueSample {
	
	public static void swap(Object o1, Object o2) {
		Object t1 = o1;
		o1 = o2;
		o2 = t1;
	}
	public static void changeValue(RefSample sample) {
		sample.setColor("Red");
		sample = new RefSample("Green");
		sample.setColor("Blue");
	}
	
	public static void main(String[] args) {
		RefSample red = new RefSample("red");
		RefSample blue = new RefSample("blue");
		swap(red, blue);
		System.out.println(red.getColor());
		System.out.println(blue.getColor());
		changeValue(blue);
		System.out.println(blue.getColor());
	}
	
}
class RefSample {
	private String color;
	
	public RefSample() {
	}
	
	public RefSample(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}