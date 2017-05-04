package br.edu.bribeiro;

public class Stack {

	private int stackSize;
	private int[] stackArray;
	private int top;

	public Stack(int stackSize) {
		this.stackSize = stackSize;
		stackArray = new int[stackSize];
		top = -1;
	}

	// adding elements to the stack
	public void push(int i) {
		top++;
		stackArray[top] = i;
	}

	// removing elements from the stack
	public int pop() {
		int i = stackArray[top];
		top--;
		return i;
	}

	// checking the stack top element
	public int peek() {
		return stackArray[top];
	}

	// checking if the stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	// checking if the stack is full
	public boolean isFull() {
		return (top == stackSize - 1);
	}

	// checking the stack size considering Occupied positions
	public int size() {
		int stackCapacity = stackArray.length;
		int stackSize = 0;

		for (int i = 0; i < stackCapacity; i++) {
			if (stackArray[i] != 0) {
				stackSize++;
			}
		}

		return stackSize;
	}

}
