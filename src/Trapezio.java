/**
 * <U>classe trapezio</U>
 * @author <b>Marta</b>
 *
 */
public class Trapezio {

	private float B, b, h;
	
	/**
	 * 
	 * @param B <U>base maggiore</U>
	 * @param b <U>base minore</U>
	 * @param h <U>altezza</U>
	 *
	 */
	public Trapezio(float B, float b, float h) {
		this.B = B;
		this.b = b;
		this.h = h;
	}
	
	/**
	 * 
	 * @return <U>area del trapezio</U>
	 */
	public float calcoloArea() {
		return ((B + b) * h) / 2;
	}

	public String toString() {
		String s = "base maggiore: " + B + "\nbase minore: " + b + "\naltezza: " + h + "\n\narea: " + calcoloArea();
		return s;
	}

	public static void main(String[] args) {
		Trapezio t = new Trapezio(10, 2, 3);
		System.out.println(t);
	}
}
