package Calculations;

public class SubstractOperation extends BinaryOperation {// �̳���BinaryOperation��ʽ��ļ�����
	SubstractOperation() { // ���ü�������
		generateBinaryOperation('-');
	}

	@Override
	boolean checkCalculation(int anInteger) {// ��д�����жϷ���
		return anInteger >= LOWER;
	}

	@Override
	int calculate(int left, int right) {// ��д�������㷽��
		return left - right;
	}
}