package Calculations;

import java.util.Random;

public class BinaryOperation { // 算式类，用于生成一条加法或减法的类
	static int UPPER = 100; // 初始化属性
	static int LOWER = 0;
	private int left_operand = 0, right_operand = 0;
	private char operator = '+';
	private int value = 0;

	private void construct(int left, int right, char op) { // 对生成的一组随机数进行加减法判定
		left_operand = left;
		right_operand = right;
		operator = op;
		if (op == '+') { // 加减法判定和计算结果。
			value = left + right;
		} else {
			value = left - right;
		}
	}

	public BinaryOperation generateAdditionOperation() { // 加法算式生成函数方法，返回BinaryOperation对象
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1); // 生成随机数并进行结果判断
		do {
			right = random.nextInt(UPPER + 1);
			result = left + right;
		} while (result > UPPER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '+'); // 调用construct进行赋值计算。
		return bop;
	}

	public BinaryOperation generateSubstractOperation() { // 减法算式生成函数方法，返回BinaryOperation对象
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1); // 生成随机数并进行结果判断
		do {
			right = random.nextInt(UPPER + 1);
			result = left - right;
		} while (result < LOWER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '-'); // 调用construct进行赋值计算。
		return bop;
	}

	public BinaryOperation generateBinaryOperation() { // 生成随机数0 or 1分别调用加法或减法函数，以达到随机加减法算式的生成。
		Random random = new Random();
		BinaryOperation bop, rebop = new BinaryOperation();
		int op;
		op = random.nextInt(2);
		if (op == 1) { // 如果随机数为1，则调用加法生成算式，反之如果为0，则调用减法生成算式。
			bop = rebop.generateAdditionOperation();
		} else {
			bop = rebop.generateSubstractOperation();
		}
		return bop; // 返回BinaryOperation对象。
	}

	public int getLeftOperand() { // 得到left_operand方法
		return left_operand;
	}

	public int getRightOperand() {// 得到right_operand方法
		return right_operand;
	}

	public char getOperator() {// 得到operator方法
		return operator;
	}

	public int getResult() {// 得到value方法
		return value;
	}

	public boolean equals(BinaryOperation anOperation) { // 让参数对象的各项数值与当前的各项数值比较，如相同则返回true，不相同返回false。
		return left_operand == anOperation.getLeftOperand() & right_operand == anOperation.getRightOperand()
				& operator == anOperation.getOperator();
	}

	public String asString() { //// 设置输出样式，返回字符串。
		String string = String.valueOf(left_operand) + "" + operator + "" + String.valueOf(right_operand) + " = ";
		return string;
	}
}
