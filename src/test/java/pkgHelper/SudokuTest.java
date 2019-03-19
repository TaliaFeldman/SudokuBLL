package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {

	@Test
	public void testRegionNbr1() throws Exception {
		int[][] puzzle = { { 0, 1, 2, 3 }, { 3, 2, 1, 0 }, { 1, 3, 0, 2 }, { 2, 0, 3, 1 } };

		Sudoku SD = new Sudoku(puzzle);

		int[] ExpectedResultr0 = { 0, 1, 3, 2 };

		assertArrayEquals(ExpectedResultr0, SD.getRegion(0));

	}

	@Test
	public void testRegionNbr2() throws Exception {

		int[][] puzzle = { { 0, 1, 2, 3 }, { 3, 2, 1, 0 }, { 1, 3, 0, 2 }, { 2, 0, 3, 1 } };

		Sudoku SD = new Sudoku(puzzle);

		int[] ExpectedResultr0 = { 0, 1, 3, 2 };

		assertArrayEquals(ExpectedResultr0, SD.getRegion(0, 0));

	}

	@Test
	public void isSudokuTest1() throws Exception {

		int[][] arr1 = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };

		Sudoku puzzle = new Sudoku(arr1);

		assertTrue(puzzle.isSudoku());

	}

	@Test
	public void isSudokuTest2() throws Exception {

		int[][] arr1 = { { 1, 0, 3, 4 }, { 3, 4, 1, 0 }, { 0, 1, 4, 3 }, { 4, 3, 0, 1 } };

		Sudoku puzzle = new Sudoku(arr1);

		assertFalse(puzzle.isSudoku());
	}

	@Test
	public void isSudokuTest3() throws Exception {

		int[][] arr1 = { { 3, 2, 3, 4 }, { 3, 4, 3, 2 }, { 2, 3, 4, 3 }, { 4, 3, 2, 3 } };

		Sudoku puzzle = new Sudoku(arr1);

		assertFalse(puzzle.isSudoku());
	}

	@Test
	public void getPuzzleTest() throws Exception {
		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 2, 1 }, { 4, 2, 3, 1 }, { 2, 3, 4, 1 } };
		Sudoku SD = new Sudoku(puzzle);
		assertTrue(Arrays.equals(SD.getPuzzle(), puzzle));
	}

	@Test
	public void isValueValid_Test1() throws Exception {
		int[][] arr = { { 1, 0, 3, 0 }, { 0, 0, 0, 2 }, { 2, 0, 4, 3 }, { 0, 3, 2, 0 } };
		Sudoku puzzle = new Sudoku(arr);
		assertTrue(puzzle.isValueValid(1, 1, 2));
	}

	@Test
	public void isValueValid_Test2() throws Exception {
		int[][] arr = { { 1, 0, 3, 0 }, { 0, 0, 0, 2 }, { 2, 0, 4, 3 }, { 0, 3, 2, 0 } };
		Sudoku puzzle = new Sudoku(arr);
		assertFalse(puzzle.isValueValid(1, 1, 1));
	}

	@Test

	public void isPartialSudokuTest1() throws Exception {

		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Sudoku puzzle = new Sudoku(arr1);

		assertTrue(puzzle.isPartialSudoku());

	}

	@Test

	public void isPartialSudokuTest2() throws Exception {

		int[][] arr1 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		Sudoku puzzle = new Sudoku(arr1);

		assertFalse(puzzle.isPartialSudoku());

	}
	@Test

	public void hasDuplicates_test3() {


		int[][] puzzle = { {0, 1, 2, 2, 1, 0, 1, 2, 0}};

		LatinSquare LS = new LatinSquare(puzzle);

		assertTrue(LS.hasDuplicates());

	}

	@Test

	public void hasDuplicates_test4() {

	

		int[][] puzzle = { { 0, 1, 2 }, { 1, 2, 0 }, { 2, 0, 1 } };

		LatinSquare LS = new LatinSquare(puzzle);

		assertEquals(LS.hasDuplicates(), false);

	}

}