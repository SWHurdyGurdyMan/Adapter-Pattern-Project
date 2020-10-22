package main.java;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTouchscreenAdapterTest {

	@Test
	void testSelectionA() {
		Main o = new Main();
        assertEquals("Selection A", o.coffeeSelection());
	}

}
