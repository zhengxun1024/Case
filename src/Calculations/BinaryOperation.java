package Calculations;

import java.util.Random;

public abstract class BinaryOperation { // 算式类，用于生成一条加法或减法的类
	static int UPPER = 100; // 初始化各项属性
	static int LOWER = 0;
	private int left_operand = 0, right_operand = 0;
	private char operator = '+';

	// 生成一组随机数并使用抽象函数进行判定。
	protected int generateBinaryOperation(char anOperator) {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1);
		do {
			right = random.nextInt(UPPER + 1);
			result = calculate(left, right); // 调用计算方法进行计算
		} while (!(checkCalculation(result))); // 调用判断方法进行判断
		left_operand = left;
		right_operand = right;
		operator = anOperator;
		return result;
	}

	abstract boolean checkCalculation(int anInteger); // 判断抽象方法

	abstract int calculate(int left, int right); // 生成计算抽象方法

	public String asString() { // 设置输出样式，返回字符串。
		String string = String.valueOf(left_operand) + "" + operator + "" + String.valueOf(right_operand) + " = ";
		return string;
	}
}
