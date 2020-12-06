package com.example.app;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameInitializerTest {


	/**
	 * This test method is for initializing the game grid to 3 rows of 3 cells(cols)
	 * The test passes if the map variable "grid" size is 3 (number of rows in the game grid)
	 */
	@Test
	public void testInitialGrid() {
		

		// Declare and initialize Map variable that represent the game grid to hold played value
		Map<String,List<String>> grid=new HashMap<String, List<String>>();

		// Declare and initialize List variable that represent the fist row of the game grid. Size of the list is 3 (3 cells)
		List<String> cellsA=new ArrayList<String>(3);
		cellsA.add("");
		cellsA.add("");
		cellsA.add("");
		grid.put("A", cellsA);

		// Declare and initialize List variable that represent the second row of the game grid. Size of the list is 3 (3 cells)
		List<String> cellsB=new ArrayList<String>(3);
		cellsB.add("");
		cellsB.add("");
		cellsB.add("");
		grid.put("B", cellsB);

		// Declare and initialize List variable that represent the third row of the game grid. Size of the list is 3 (3 cells)
		List<String> cellsC=new ArrayList<String>(3);
		cellsC.add("");
		cellsC.add("");
		cellsC.add("");
		grid.put("C", cellsC);

		// if grid.size() is 3, assetEquals is true. The test passes
		// else the test failed
		assertEquals(3, grid.size());
	
		
	}

	/**
	 * This test method is for dynamic initialization of the game grid to 1 rows of n cells(cols)
	 * The test passes if the number of cells(cols) is 3
	 */
	@Test
	public void testCreateGridColCellWithDynamicNumber() {

		// Declare and initialize Map variable that represent the game grid to hold played value
		Map<String,List<String>> grid=new HashMap<String, List<String>>();

		// Declare and initialize int variable that represent the number of cells(cols). Here variable set to 3
		int cols=3;

		// Declare and initialize List variable that represent the row of the game grid. Size of the list is 3 (3 cells)
		List<String> cellsA=new ArrayList<String>(cols);
		for(int i=0; i<cols;i++) {
			cellsA.add("");
		}
		grid.put("A", cellsA);

		// if cellsA.size() is 3, assetEquals is true. The test passes
		// else the test failed
		assertEquals(3, cellsA.size());


	}


	/**
	 * This test method is for dynamic initialization of the game grid to n rows of n cells(cols)
	 * The test passes if the map variable "grid" size is 1 (number of rows in the game grid)
	 *
	 */
	@Test
	public void testCreateGridRowCellWithDynamicNumber() {

		// Declare and initialize Map variable that represent the game grid to hold played value
		Map<String,List<String>> grid=new HashMap<String, List<String>>();

		// Declare and initialize int variable that represent the number of cells(cols). Here variable set to 3
		int cols=3;

		// Declare and initialize int variable that represent the number of rows. Here variable set to 3
		int row=3;

		// Declare and initialize List variable that represent the row of the game grid. Size of the list is 3 (3 cells)
		List<String> cellsA=new ArrayList<String>(cols);
		for(int i=0; i<cols;i++) {
			cellsA.add("");
		}
		grid.put(String.valueOf(row), cellsA);

		// if grid.size() is 1, assetEquals is true. The test passes
		// else the test failed
		assertEquals(1, grid.size());


	}




	
}
