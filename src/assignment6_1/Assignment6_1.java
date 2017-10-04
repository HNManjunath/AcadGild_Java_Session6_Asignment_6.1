/**
 * 
 */
package assignment6_1;

/**
 * @author MANJUNATH, below class is to implement array size demo and find even
 *         numbers in that.
 *
 */
public class Assignment6_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // initializing the array size.
		System.out.println("Array size = "+a.length);
		System.out.print("\nEven numbers :");
		for (int i = 1; i < a.length; i++) { // looping the values from 1 to 10
			if (a[i] % 2 == 0) {
				System.out.print(" " + a[i]); // printing Even numbers from the array.
			}
		}
	}
}
