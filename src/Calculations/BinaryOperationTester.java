package Calculations;

public class BinaryOperationTester { // 算式测试类
	public static void main(String[] args) {
		int i;
		BinaryOperation bo = new BinaryOperation();
		BinaryOperation add, sub, bin; // 初始化对象
		System.out.println("50道加法题："); // 循环调用加法生成算式并输出算式
		for (i = 0; i < 50; i++) {
			add = bo.generateAdditionOperation();
			System.out.println(add.asString());
		}
		System.out.println("50道减法题：");// 循环调用减法生成算式并输出算式
		for (i = 0; i < 50; i++) {
			sub = bo.generateSubstractOperation();
			System.out.println(sub.asString());
		}
		System.out.println("50道加减法题：");// 循环调用加减法生成算式并输出算式
		for (i = 0; i < 50; i++) {
			bin = bo.generateBinaryOperation();
			System.out.println(bin.asString());
		}
	}
}
