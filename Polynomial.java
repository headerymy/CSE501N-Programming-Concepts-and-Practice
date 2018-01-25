package lab8;

import java.util.LinkedList;
import java.util.ListIterator;


public class Polynomial {

	final private LinkedList<Double> list;
	ListIterator<Double> itr;
	private static boolean first = true;
	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		//
		// Set the instance variable (list) to be a new linked list of Double type
		//
		this.list = new LinkedList<Double>();
		itr = this.list.listIterator();// FIXME
	}	
	
	/**
	 * to string method
	 */
	public String toString() {
		String str = "";
		if (list.size() > 0 ){
            int i ;
            for (i = 0; i < this.list.size() - 1; i++) {
                str += this.list.get(i) + "x^" + i + " + ";
            }
            str += this.list.get(i) + "x^" + i;
        }
		return "A polynomial is " + str; // FIXME
	}
	
	/**
	 * add term
	 * @param coeff
	 * @return new coefficient list
	 */
	public Polynomial addTerm(double coeff) {
		//
		// FIXME
		this.list.add(coeff);
		//
		itr = list.listIterator();
		return this;  // required by lab spec
	}
	
	/**
	 * evaluate method
	 * @param x
	 * @return the calculated result
	 */
	public double evaluate(double x) {
		// FIXME
		if(first){
            itr = list.listIterator();
            first = false;
        }
		double eval;
        if (!itr.hasNext())
            return 0;
        else
            eval = itr.next() + x * evaluate(x);
        first = true;
        return eval;
	}
	
	/**
	 * derivative method
	 * @return derivatived polynomial
	 */
	public Polynomial derivative() {
		Polynomial p = new Polynomial();
		for (int i = 1; i < this.list.size(); i++) {
			p.addTerm(i * list.get(i));
		}
		return p;   // FIXME
	}
	
	/**
	 * sum method
	 * @param another
	 * @return summed list
	 */
	public Polynomial sum(Polynomial another) {
		double coeff = 0;
		Polynomial p = new Polynomial();
		int index = Math.abs(another.list.size() - this.list.size());
		int thisSize = this.list.size();
		int size = Math.min(another.list.size(), this.list.size());
		
		if (size == thisSize) {
			for (int i = 0; i < index; i++) {
				this.list.add(0.0);
			}
		}
		else {
			for (int i = 0; i < index; i++) {
				another.list.add(0.0);
			}
		}
			
		for (int i = 0; i < this.list.size(); i++) {
			coeff = (double) (this.list.get(i)) + (double) (another.list.get(i));
			p.addTerm(coeff);
		}
		return p;   // FIXME
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */
	
	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}
	
}
