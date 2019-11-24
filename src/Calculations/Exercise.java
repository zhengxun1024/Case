package Calculations;

public class Exercise { // ϰ���࣬���ڵ�����ʽ�������Ŀ�����ɡ�

	private static int QUESTION_NUMBER = 50; // ��ʼ��������Ŀ�����ʹ洢�������顣
	private static BinaryOperation operationList[] = new BinaryOperation[QUESTION_NUMBER];

	public void generateBinaryExercise() { // �������50���Ӽ���ϰ��ĺ���
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) { // ѭ�����üӼ�����ʽ���ɺ��������м���ж�
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation; // �����ɵĶ��󴢴�������
		}
	}

	public void generateAdditionExercise() { // �������50���ӷ�ϰ��ĺ���
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) { // ѭ�����üӷ���ʽ���ɺ��������м���ж�
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation; // �����ɵĶ��󴢴�������
		}
	}

	public void generatesubstractExercise() { // �������50������ϰ��ĺ���
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) { // ѭ�����ü�����ʽ���ɺ��������м���ж�
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation; // �����ɵĶ��󴢴�������
		}
	}

	public static boolean cheakRepeat(BinaryOperation anOperation, int length) { // ��������������ظ���
		for (int i = 0; i < length; i++) {
			if (anOperation.equals(operationList[i])) { // ����BinaryOperation�����е�equals���������жϣ�����True��ʾ�����ڴ����ظ���
				return true;
			}
		}
		return false;
	}

	void formateAndDisplay() { // �趨�����ʽ�������Ŀ��ʽ��
		for (int i = 0; i < QUESTION_NUMBER; i++) { // ѭ�������еĶ��󲢵���asString��������ַ���
			System.out.print((i + 1) + "�� " + operationList[i].asString() + "\t");
			if ((i + 1) % 5 == 0) { // ÿ���5����ʽ����
				System.out.print("\n");
			}
		}
	}
}
