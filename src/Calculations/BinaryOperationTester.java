package Calculations;

public class BinaryOperationTester { // ��ʽ������
	public static void main(String[] args) {
		int i;
		BinaryOperation bo = new BinaryOperation();
		BinaryOperation add, sub, bin; // ��ʼ������
		System.out.println("50���ӷ��⣺"); // ѭ�����üӷ�������ʽ�������ʽ
		for (i = 0; i < 50; i++) {
			add = bo.generateAdditionOperation();
			System.out.println(add.asString());
		}
		System.out.println("50�������⣺");// ѭ�����ü���������ʽ�������ʽ
		for (i = 0; i < 50; i++) {
			sub = bo.generateSubstractOperation();
			System.out.println(sub.asString());
		}
		System.out.println("50���Ӽ����⣺");// ѭ�����üӼ���������ʽ�������ʽ
		for (i = 0; i < 50; i++) {
			bin = bo.generateBinaryOperation();
			System.out.println(bin.asString());
		}
	}
}
