package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTest {

	@Test
	public void stackCreationIsEmpty() {
		Stack myStack = new Stack(5);

		assertTrue(myStack.isEmpty());

	}

	@Test
	public void stackPush() {
		Stack myStack = new Stack(5);

		myStack.push(2);

		assertTrue(!myStack.isEmpty());
		assertTrue(myStack.peek() == 2);

	}

	@Test
	public void stackPeek() {
		Stack myStack = new Stack(5);

		myStack.push(2);
		myStack.push(19);
		myStack.push(32);
		myStack.push(76);

		assertTrue(!myStack.isEmpty());
		assertTrue(myStack.peek() == 76);

	}

	@Test
	public void stackPop() {
		Stack myStack = new Stack(5);

		myStack.push(2);
		myStack.push(19);
		myStack.push(32);
		myStack.push(76);

		myStack.pop();

		assertTrue(!myStack.isEmpty());
		assertTrue(myStack.peek() == 32);

	}

	@Test
	public void stackIsFull() {
		Stack myStack = new Stack(5);

		for (int i = 1; !myStack.isFull(); i++) {
			myStack.push(i);
		}

		assertTrue(!myStack.isEmpty());
		assertTrue(myStack.peek() == 5);

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void stackFullTryingToAddMoreElements() {
		Stack myStack = new Stack(5);

		for (int i = 1; i < 10; i++) {
			myStack.push(i);
		}

	}

	@Test
	public void stackSizeConsideringOccupiedPositions() {
		Stack myStack = new Stack(5);

		myStack.push(2);
		myStack.push(19);
		myStack.push(32);

		assertTrue(!myStack.isEmpty());
		assertTrue(myStack.size() == 3);

	}

}
