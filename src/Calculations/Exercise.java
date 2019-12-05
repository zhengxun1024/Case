package Calculations;

import java.util.ArrayList;
import java.util.Random;

public class Exercise { // ϰ���࣬���ڵ�����ʽ�������Ŀ�����ɡ�
	private ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>(); // ����ArrayList����������Ŀ�Ķ���
	private int current = 0;
	// �������õ���Ŀ��������Ӧ�ļӷ���

	public void generateAdditionExercise(int operationCount) {
		operationList.clear(); // ʹ��ǰ������б�
		BinaryOperation anOperation;
		while (operationCount > 0) { // ѭ������AdditionOperation�����ɼӷ���ʽ������operationList�б�
			do {
				anOperation = new AdditionOperation();
			} while (operationList.contains(anOperation)); // �����б��contains�������м��ϵĲ��أ������ظ�ֵ����true�������ڷ���false��
			operationList.add(anOperation); // ʹ���б��add������anOperation���뵽�б�
			operationCount--;
		}
	}

	public void generateSubstractExercise(int operationCount) {// �������õ���Ŀ��������Ӧ�ļ�����
		operationList.clear(); // ʹ��ǰ������б�
		BinaryOperation anOperation;
		while (operationCount > 0) { // ѭ������SubstractOperation�����ɼ�����ʽ������operationList�б�
			do {
				anOperation = new SubstractOperation();
			} while (operationList.contains(anOperation)); // �����б��contains�������м��ϵĲ��أ������ظ�ֵ����true�������ڷ���false��
			operationList.add(anOperation); // ʹ���б��add������anOperation���뵽�б�
			operationCount--;
		}
	}

	public void generateBinaryExercise(int operationCount) {// �������õ���Ŀ��������Ӧ�ļӼ�����
		operationList.clear(); // ʹ��ǰ������б�
		BinaryOperation anOperation;
		while (operationCount > 0) { // ѭ������generateOperation�������ɼ�����ʽ������operationList�б�
			do {
				anOperation = generateOperation();
			} while (operationList.contains(anOperation));// �����б��contains�������м��ϵĲ��أ������ظ�ֵ����true�������ڷ���false��
			operationList.add(anOperation);// ʹ���б��add������anOperation���뵽�б�
			operationCount--;
		}
	}

	private BinaryOperation generateOperation() {// ���������0 or 1�ֱ���üӷ��ͼ�����Ŀ�������мӼ�����Ŀ������
		Random random = new Random();
		int opValue = random.nextInt(2); // ���������1 or 0.
		if (opValue == 1) { // ����������1 ����üӷ����ɺ�������֮�����0 ����ü������ɺ�����
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}

	public boolean hasNext() {
		return current <= (operationList.size() - 1);
	}

	public BinaryOperation next() {
		return operationList.get(current++);
	}

}