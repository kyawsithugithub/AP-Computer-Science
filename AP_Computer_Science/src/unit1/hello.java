package unit1;

public class hello {

	public static void main(String[] args) {
		System.out.print("Hello");	// Display "Hello", Cursor wait end of string.
		System.out.println("Hello");	// Display "Hello", Cursor move another line and wait.

		int mMath = 83;	// Declare variable named "mMath", data type integer, value assign "83".
		int mScience = 87;	// Declare variable named "mScience", data type integer, value assign "87".
		int mTotal = mMath + mScience;	// add 2 value
		System.out.println(mMath);	// Display value from mMath variable
		System.out.println("Science mark: " + mScience);	// String concatenation (String + value)
		System.out.println("Total mark: " + mTotal );
		System.out.println("Total mark: " + mMath + mScience);	// Output "Total Mark: 8387"
		System.out.println("Total mark: " + (mMath + mScience));	// Output "Total Mark: 170"

	}

}
