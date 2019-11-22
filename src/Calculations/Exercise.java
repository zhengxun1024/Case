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
		System.out.println("--------50道加减法运算题如下--------");
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
		System.out.println("--------50道加法运算题如下--------");
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
		System.out.println("--------50道减法运算题如下--------");
		formateAndDisplay();
	}

	public static boolean cheakRepeat(BinaryOperation anOperation, int length) { // 检查数组内有无重复数
		for (int i = 0; i < length; i++) {
			if (anOperation.equals(operationList[i])) { // True表示数组内存在重复数
				return true;
			}
		}
		return false;
	}

	void formateAndDisplay() {
		for (int i = 0; i < QUESTION_NUMBER; i++) {
			System.out.print((i + 1) + "、 " + operationList[i].asString() + "\t");
			if ((i + 1) % 5 == 0) { // 每输出5道算式则换行
				System.out.print("\n");
			}
		}
	}
}
