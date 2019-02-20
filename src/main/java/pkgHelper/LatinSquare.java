package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {

	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;

		if (arr == null)
			return false;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				hasDuplicates = true;
				break;
			}

		}
		return hasDuplicates;
	}

	public boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;

		if (arr == null)
			return false;

		for (int i : arr) {
			if (i == iValue) {
				doesElementExist = true;
				break;
			}
		}
		return doesElementExist;

	}
}
