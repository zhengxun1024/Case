package Calculations;

import java.util.Random;

public class BinaryOperation { // ��ʽ�࣬��������һ���ӷ����������
	static int UPPER = 100; // ��ʼ������
	static int LOWER = 0;
	private int left_operand = 0, right_operand = 0;
	private char operator = '+';
	private int value = 0;

	private void construct(int left, int right, char op) { // �����ɵ�һ����������мӼ����ж�
		left_operand = left;
		right_operand = right;
		operator = op;
		if (op == '+') { // �Ӽ����ж��ͼ�������
			value = left + right;
		} else {
			value = left - right;
		}
	}

	public BinaryOperation generateAdditionOperation() { // �ӷ���ʽ���ɺ�������������BinaryOperation����
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1); // ��������������н���ж�
		do {
			right = random.nextInt(UPPER + 1);
			result = left + right;
		} while (result > UPPER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '+'); // ����construct���и�ֵ���㡣
		return bop;
	}

	public BinaryOperation generateSubstractOperation() { // ������ʽ���ɺ�������������BinaryOperation����
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1); // ��������������н���ж�
		do {
			right = random.nextInt(UPPER + 1);
			result = left - right;
		} while (result < LOWER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '-'); // ����construct���и�ֵ���㡣
		return bop;
	}

	public BinaryOperation generateBinaryOperation() { // ���������0 or 1�ֱ���üӷ�������������Դﵽ����Ӽ�����ʽ�����ɡ�
		Random random = new Random();
		BinaryOperation bop, rebop = new BinaryOperation();
		int op;
		op = random.nextInt(2);
		if (op == 1) { // ��������Ϊ1������üӷ�������ʽ����֮���Ϊ0������ü���������ʽ��
			bop = rebop.generateAdditionOperation();
		} else {
			bop = rebop.generateSubstractOperation();
		}
		return bop; // ����BinaryOperation����
	}

	public int getLeftOperand() { // �õ�left_operand����
		return left_operand;
	}

	public int getRightOperand() {// �õ�right_operand����
		return right_operand;
	}

	public char getOperator() {// �õ�operator����
		return operator;
	}

	public int getResult() {// �õ�value����
		return value;
	}

	public boolean equals(BinaryOperation anOperation) { // �ò�������ĸ�����ֵ�뵱ǰ�ĸ�����ֵ�Ƚϣ�����ͬ�򷵻�true������ͬ����false��
		return left_operand == anOperation.getLeftOperand() & right_operand == anOperation.getRightOperand()
				& operator == anOperation.getOperator();
	}

	public String asString() { //// ���������ʽ�������ַ�����
		String string = String.valueOf(left_operand) + "" + operator + "" + String.valueOf(right_operand) + " = ";
		return string;
	}
}
