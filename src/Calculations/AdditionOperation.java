package Calculations;

public class AdditionOperation extends BinaryOperation {// 继承自BinaryOperation算式类的加法类
	AdditionOperation() { // 调用算式生成函数
		generateBinaryOperation('+'); // 传递加法符号
	}

	@Override
	boolean checkCalculation(int anInteger) { // 重写加法判断方法
		return anInteger <= UPPER;
	}

	@Override
	int calculate(int left, int right) { // 重写加法计算方法
		return left + right; // 返回加法结果
	}
}
