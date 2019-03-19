package pkgHelper;

import pkgEnum.ePuzzleViolation;

public class PuzzleViolation {

	private ePuzzleViolation ePuzzleViolation;

	private int iValue;

	/**
	 * 
	 * This class is used to capture a violation to the LatinSquare
	 * 
	 * and/or Sudoku puzzle.
	 * 
	 * 
	 * 
	 * @param ePuzzleViolation - enum resolved to the type of violation
	 * 
	 * @param iValue           - integer value(row number, col number, etc) of
	 * 
	 *                         violation
	 * 
	 */

	public PuzzleViolation(pkgEnum.ePuzzleViolation ePuzzleViolation, int iValue) {

		super();

		this.ePuzzleViolation = ePuzzleViolation;

		this.iValue = iValue;

	}

	public ePuzzleViolation getPuzzleViolation() {

		return ePuzzleViolation;

	}

	public int getiValue() {

		return iValue;

	}

}