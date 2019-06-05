package com.revature.runner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringRunnerTest {
	
	private static StringRunner stringRunner;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		stringRunner = new StringRunner();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBasicPositivePalandrome() {
		assertEquals(true, stringRunner.isPalandrome("racecar"), "racecar should be a palandrome");
	}
	
	@Test
	void testBasicNegativePalandrome() {
		assertEquals(false, stringRunner.isPalandrome("truck"), "truck should not be a palandrome");
	}
	
	@Test
	void testNullArgument() {
		assertEquals(false, stringRunner.isPalandrome(null), "null should not be a palandrome");
	}
	
	@Test
	void testSpecialCharactersPalandrome() {
		assertEquals(true, stringRunner.isPalandrome("!- -atoyota- -!"), "palandrome with special character [!- ] should return true");
	}

	@Test
	void testSingleCharacter() {
		assertEquals(true, stringRunner.isPalandrome("a"), "single character 'a' should be a palandrome");
	}
	
}
