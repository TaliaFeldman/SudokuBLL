package pkgGame;

import java.util.Arrays;

import pkgEnum.ePuzzleViolation;

import pkgHelper.LatinSquare;
import pkgHelper.PuzzleViolation;

public class Sudoku extends LatinSquare {
	private int size;
	private int sqrtSize;

	public Sudoku(int iSize) throws Exception {
		super();
		double dSqrtSize;
		size = iSize;
		dSqrtSize = Math.sqrt(iSize);
		if (Math.floor(sqrtSize) == sqrtSize) {
			sqrtSize = (int) dSqrtSize;
		} else {
			throw new Exception("sqrtSize is not valid.");
		}
	}

	public int[][] getPuzzle() {
		return super.getLatinSquare();
	}

	public Sudoku(int[][] latinsquare) throws Exception {
		super(latinsquare);
		double dSqrtSize;
		size = getLatinSquare().length;
		dSqrtSize = Math.sqrt(size);
		if (Math.floor(sqrtSize) == sqrtSize) {
			sqrtSize = (int) dSqrtSize;
		} else {
			throw new Exception("sqrtSize is not valid.");
		}
	}
	
	/**
	 * 
	 * @param iCol
	 * @param iRow
	 * @return true, if it's a complete Sudoku
	 */
	
	public int[] getRegion(int r) {
		int[] myRegion = new int[this.getLatinSquare().length];
		int idx = 0;
		int iSize = this.getLatinSquare().length;
		int iSizeSqrt = (int) Math.sqrt(iSize);

		for (int iRow = (r / iSizeSqrt * iSizeSqrt); iRow < ((r / iSizeSqrt) * iSizeSqrt) + iSizeSqrt; iRow++) {
			for (int iCol = (r % iSizeSqrt) * iSizeSqrt; iCol < ((r % iSizeSqrt) * iSizeSqrt) + iSizeSqrt; iCol++)
				myRegion[idx++] = super.getLatinSquare()[iRow][iCol];

		}
		return myRegion;

	}

	public int[] getRegion(int iCol, int iRow) {
		{
			int iSize = getLatinSquare().length;
			int iSizeSqrt = (int) Math.sqrt(iSize);

			int i = (iCol / iSizeSqrt) + ((iRow / iSizeSqrt) * iSizeSqrt);

			return getRegion(i);
		}
	}

	/**
	 * if the puzzle is a LatinSquare...and each value of each region exists in the
	 * first row of the puzzle
	 * 
	 * @return true, if it;s a complete Sudoku
	 */

	public boolean isSudoku() {
		super.setbIgnoreZero​(false);
		super.ClearPuzzleViolation();

		if (hasDuplicates()) {
			return false;
		}
		if (super.ContainsZero()) {
			return false;
		}
		if (!super.isLatinSquare()) {
			return false;
		}
		for (int i = 1; i < super.getLatinSquare().length; i++) {
			if (!hasAllValues(getRow(0), getRegion(i))) {
				return false;
			}
		}

		return true;
	}

	/**
	 * if the puzzle is a Sudoku... and any of the values is zero
	 * 
	 * @return
	 */

	public boolean isPartialSudoku() {
		super.setbIgnoreZero​(true);
		super.ClearPuzzleViolation();

		if (hasDuplicates()) {
			return false;
		}
		if (!ContainsZero()) {
			super.AddPuzzleViolation(new PuzzleViolation(ePuzzleViolation.ContainsZero, 0));
			return false;
		}
		return true;
	}
	
	/**
	 * @param iValue 
	 * @param Col 
	 * @param Row  
	 * 
	 *
	 * if the Value is valid in regards to the iValue, Col, Row
	 * 
	 * @return true
	 */
	public boolean isValueValid(int iValue, int Col, int Row) {
		// does element exist, has duplicates- row/col, region
		if (doesElementExist(getColumn(Col), iValue)) {
			return false;
		}
		if (doesElementExist(getRow(Row), iValue)) {
			return false;
		}
		if (doesElementExist(getRegion(Col, Row), iValue)) {
			return false;
		}
		return true;
	}

	@Override
	protected boolean hasDuplicates() {
		for (int i = 0; i <= getPuzzle().length; i++) {
			super.hasDuplicates();
		}
		return true;
	}

}
