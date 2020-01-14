package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int INT_TOTAL = -1;
	public static final int ARRAY_SIZE = 12;
	private int[] NUMBERS = new int [ARRAY_SIZE];
	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == INT_TOTAL;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
