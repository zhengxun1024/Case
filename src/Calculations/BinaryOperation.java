package Calculations;

import java.util.Random;

public abstract class BinaryOperation { // ��ʽ�࣬��������һ���ӷ����������
	static int UPPER = 100; // ��ʼ����������
	static int LOWER = 0;
	private int left_operand = 0, right_operand = 0;
	private char operator = '+';
	private int value = 0;

	protected void generateBinaryOperation(char anOperator) {// ����һ���������ʹ�ó����������ж���
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1); // �����������
		do {
			right = random.nextInt(UPPER + 1); // �����������
			result = calculate(left, right); // ���ü��㷽�����м���
		} while (!(checkCalculation(result))); // �����жϷ��������ж�
		left_operand = left;
		right_operand = right;
		operator = anOperator;
		value = result;
	}

	public int getValue() { // ��ȡϰ���
		return value;
	}

	public int getLeft() { // ��ȡ�������
		return left_operand;
	}

	public int getRight() { // ��ȡ�Ҳ�����
		return right_operand;
	}

	public char getOperator() { // ��ȡ�����
		return operator;
	}

	abstract boolean checkCalculation(int anInteger); // �жϳ��󷽷�

	abstract int calculate(int left, int right); // ���ɼ�����󷽷�

	public String asString() { // ���������ʽ�������ַ�����
		String string = String.valueOf(left_operand) + "" + operator + "" + String.valueOf(right_operand) + " = ";
		return string;
	}
}
