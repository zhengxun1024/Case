package Calculations;

import java.util.Random;

public class BinaryOperation {
	static int UPPER = 100;
	static int LOWER = 0;
	private int left_operand = 0, right_operand = 0;
	private char operator = '+';
	private int value = 0;

	private void construct(int left, int right, char op) {
		left_operand = left;
		right_operand = right;
		operator = op;
		if (op == '+') {
			value = left + right;
		} else {
			value = left - right;
		}
	}

	public BinaryOperation generateAdditionOperation() {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1);
		do {
			right = random.nextInt(UPPER + 1);
			result = left + right;
		} while (result > UPPER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '+');
		return bop;
	}

	public BinaryOperation generateSubstractOperation() {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1);
		do {
			right = random.nextInt(UPPER + 1);
			result = left - right;
		} while (result < LOWER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '-');
		return bop;
	}

	public BinaryOperation generateBinaryOperation() {
		Random random = new Random();
		BinaryOperation bop, rebop = new BinaryOperation();
		int op;
		op = random.nextInt(2);
		if (op == 1) {
			bop = rebop.generateAdditionOperation();
		} else {
			bop = rebop.generateSubstractOperation();
		}
		return bop;
	}

	public int getLeftOperand() {
		return left_operand;
	}

	public int getRightOperand() {
		return right_operand;
	}

	public char getOperator() {
		return operator;
	}

	public int getResult() {
		return value;
	}

	public boolean equals(BinaryOperation anOperation) {
		return left_operand == anOperation.getLeftOperand() & right_operand == anOperation.getRightOperand()
				& operator == anOperation.getOperator();
	}

	public String asString() {
		String string = String.valueOf(left_operand) + "" + operator + "" + String.valueOf(right_operand) + " = ";
		return string;
	}
}