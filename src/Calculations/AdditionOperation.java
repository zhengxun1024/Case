package Calculations;

public class AdditionOperation extends BinaryOperation {//继承自BinaryOperation算式类的加法类
	AdditionOperation() {	//设置加法符号
		generateBinaryOperation('+');
	}

	@Override
	boolean checkCalculation(int anInteger) {	//重写加法判断方法
		return anInteger <= UPPER;
	}

	@Override
	int calculate(int left, int right) { // 重写加法计算方法
		return left + right;
	}
}
