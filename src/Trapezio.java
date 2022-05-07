/**
 * <U> Trapezio </U>
 * 
 * <UL>
 *   <li> Calcolo Area </li>
 *   <li> Main </li>
 * </UL>
 * 
 * @author <h1>BoccoJacopo</h1>
 * @version 2.0
 *
 */
public class Trapezio 
{
	
	private float B,h,b;
	
	/**
	 * 
	 * @param B base maggiore 
	 * @param b base minore
	 * @param h altezza
	 */
	public Trapezio(float b, float h, float B) 
	{	
		this.B = B;
		this.h = h;
		this.b = b;
	}

	/**
	 * 
	 * 
	 * @return area ritorna area del trapezio
	 */
	public float calcolaArea()
	{
		float area;
		area = B+b*h/2;
		return area;
	}
	
	public static void main(String[] args) 
	{
		Trapezio trap = new Trapezio(4, 5, 2);
		Trapezio trap1 = new Trapezio(5, 6, 7);
		Trapezio trap2 = new Trapezio(7, 8, 9);
		
	    System.out.println(trap.calcolaArea());
	    System.out.println(trap1.calcolaArea());
	    System.out.println(trap2.calcolaArea());
		
		
	}
	

}
