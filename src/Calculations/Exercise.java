package Calculations;

public class Exercise {

	private static int QUESTION_NUMBER = 50;
	private static BinaryOperation operationList[] = new BinaryOperation[QUESTION_NUMBER];

	public void generateBinaryExercise() {
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) {
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation;
		}
		System.out.println("--------50���Ӽ�������������--------");
		formateAndDisplay();
	}

	public void generateAdditionExercise() {
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) {
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation;
		}
		System.out.println("--------50���ӷ�����������--------");
		formateAndDisplay();
	}

	public void generatesubstractExercise() {
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) {
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation;
		}
		System.out.println("--------50����������������--------");
		formateAndDisplay();
	}

	public static boolean cheakRepeat(BinaryOperation anOperation, int length) { // ��������������ظ���
		for (int i = 0; i < length; i++) {
			if (anOperation.equals(operationList[i])) { // True��ʾ�����ڴ����ظ���
				return true;
			}
		}
		return false;
	}

	void formateAndDisplay() {
		for (int i = 0; i < QUESTION_NUMBER; i++) {
			System.out.print((i + 1) + "�� " + operationList[i].asString() + "\t");
			if ((i + 1) % 5 == 0) { // ÿ���5����ʽ����
				System.out.print("\n");
			}
		}
	}
}
