package com.example.app;

import com.example.app.model.Cells;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateGridWithValue {


	/**
	 * This test method is for testing generateGrid method in GameInitializer class.
	 */
	@Test
	public void testCreateGridWithPlayedValue() {

		// Declare and initialize GameInitializer variable
		GameInitializer gameInitializer=new GameInitializer();

		// Declare and initialize int variable that represent the number of cells(cols). Here variable set to 0
		int square=3;

		// Declare and initialize Map variable that represent the game grid to hold played value
		// Call generateGrid method from GameInitializer class to get the game grid
		Map<String, List<Cells>> grid = gameInitializer.generateGridWithValue(square);
		assertEquals(square, grid.size());	
	}
	

}
