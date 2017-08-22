/*
 * This class converts an int variable to String using an inbuilt function of String class
 */
package stringUsage;

public class StringToInt {

	public static void main(String[] args) {
		int intVariable = 100; // declaring in integer value
		/*
		 * String.valueOf(intVariable) : Returns the string representation of the int
		 * argument.
		 * 
		 * The representation is exactly the one returned by the Integer.toString method
		 * of one argument.
		 */
		System.out.println("Value os intVariable in string form:"+ String.valueOf(intVariable));

	}

}
