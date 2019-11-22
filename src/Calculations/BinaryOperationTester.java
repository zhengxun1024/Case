package Calculations;

public class BinaryOperationTester {
	public static void main(String[] args) {
		int i;
		BinaryOperation bo = new BinaryOperation();
		BinaryOperation add, sub, bin;
		System.out.println("50道加法题：");
		for (i = 0; i < 50; i++) {
			add = bo.generateAdditionOperation();
			System.out.println(add.asString());
		}
		System.out.println("50道减法题：");
		for (i = 0; i < 50; i++) {
			sub = bo.generateSubstractOperation();
			System.out.println(sub.asString());
		}
		System.out.println("50道加减法题：");
		for (i = 0; i < 50; i++) {
			bin = bo.generateBinaryOperation();
			System.out.println(bin.asString());
		}
	}
}
