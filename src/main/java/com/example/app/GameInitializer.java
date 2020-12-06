package com.example.app;



import com.example.app.model.Cells;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GameInitializer {

	/**
	 * This method is to generate the game grid based on the parameter square If
	 * square is 3, the grid will be 3 rows and 3 columns If square is 4, the grid
	 * will be 4 rows and 4 columns If square is 7, the grid will be 7 rows and 7
	 * columns By default, the cell value is set to empty string
	 * 
	 * @param square
	 * @return
	 */
	public Map<String, List<String>> generateGrid(int square) {
		Map<String, List<String>> grid = new HashMap<String, List<String>>();

		int cols = square;
		int rows = square;

		for (int u = 0; u < rows; u++) {
			List<String> cellsA = new ArrayList<String>(cols);
			for (int i = 0; i < cols; i++) {
				cellsA.add("");
			}
			grid.put(String.valueOf(u), cellsA);
		}
		return grid;
	}

	/**
	 * This method is to generate the game grid based on the parameter square If
	 * square is 3, the grid will be 3 rows and 3 columns If square is 4, the grid
	 * will be 4 rows and 4 columns If square is 7, the grid will be 7 rows and 7
	 * columns By default, the cell value is set to empty string
	 * 
	 * @param square
	 * @return
	 */
	public Map<String, List<Cells>> generateGridWithValue(int square) {
		Map<String, List<Cells>> grid = new HashMap<String, List<Cells>>();

		int cols = square;
		int rows = square;

		for (int u = 0; u < rows; u++) {
			List<Cells> cellsA = new ArrayList<Cells>(cols);
			for (int i = 0; i < cols; i++) {

				cellsA.add(new Cells(u, i, ""));
			}
			grid.put(String.valueOf(u), cellsA);
		}
		return grid;
	}
}
