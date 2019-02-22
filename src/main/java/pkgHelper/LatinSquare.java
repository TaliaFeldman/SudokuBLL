package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {

	}

	public LatinSquare(int[][] puzzle) {
		super();
		this.LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public static boolean hasDuplicates(int[] arr) {
		Arrays.sort(arr);
		return false;

	}

	public static boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;

		if (arr == null)
			return false;

		for (int i : arr) {
			if (i == iValue) {
				return true;
			}
		}
		return false;

	}

	/**
	 * Pass in two, one dimensional arrays if everything in arr2 exists in arr1,
	 * return true
	 * 
	 * @param arr1 - array to check
	 * @param arr2 - array used to check
	 * 
	 *             example:
	 * 
	 *             if arr1 = 1,2,3,4,5 and arr2 = 2,5, return true if arr1 =
	 *             1,2,3,4,5 and arr2 = 2,6, return false
	 * @return
	 */

	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean hasAllValues = true;

		for (int j = 0; j < arr2.length; j++) {

			boolean bFound = false;
			for (int i = 0; i < arr1.length; i++) {

				if (arr1[i] == arr2[j]) {
					bFound = true;
					break;
				}
			}
			if (bFound == false) {
				hasAllValues = false;
			}
		}
		return hasAllValues;

	}

	/**
	 * Return a one dimensional array of a column from Latin square
	 * 
	 * @param Col
	 * @return
	 */
	public int[] getColumn(int Col) {
		return null;
	}

	/**
	 * Return a one dimensional array of a row from Latin square
	 * 
	 * @param Row
	 * @return
	 */
	public int[] getRow(int Row) {

		return null;
	}

	/**
	 * Return 'true' if...
	 * 
	 * Each row in LatinSquare does not contain duplicates Each column in
	 * LatinSquare does not contain duplicates Each value in the first row is found
	 * in every other row of the LatinSquare Each value in the first row is found in
	 * every other column of the LatinSquare
	 * 
	 * @return - true or false, see above
	 */

	public boolean isLatinSquare() {

		return false;
	}

	/**
	 * containsZero - will return 'true' if any value in the LatinSquare is zero.
	 * 
	 * @return
	 */
	public boolean ContainsZero() {
		
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++) {
			
		for (int iCol = 0; iCol < this.LatinSquare.length; iCol++) {
			
			if(this.LatinSquare[iRow][iCol]==0) {
				return true;
			}
		}
		}
	return false;
	}
}
