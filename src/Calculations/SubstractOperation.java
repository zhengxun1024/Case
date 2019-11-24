package Calculations;

public class SubstractOperation extends BinaryOperation {// 继承自BinaryOperation算式类的减法类
	SubstractOperation() { // 设置减法符号
		generateBinaryOperation('-');
	}

	@Override
	boolean checkCalculation(int anInteger) {// 重写减法判断方法
		return anInteger >= LOWER;
	}

	@Override
	int calculate(int left, int right) {// 重写减法计算方法
		return left - right;
	}
}