package Calculations;

public class AdditionOperation extends BinaryOperation {// �̳���BinaryOperation��ʽ��ļӷ���
	AdditionOperation() { // ������ʽ���ɺ���
		generateBinaryOperation('+'); // ���ݼӷ�����
	}

	@Override
	boolean checkCalculation(int anInteger) { // ��д�ӷ��жϷ���
		return anInteger <= UPPER;
	}

	@Override
	int calculate(int left, int right) { // ��д�ӷ����㷽��
		return left + right; // ���ؼӷ����
	}
}
