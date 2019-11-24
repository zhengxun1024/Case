package Calculations;

public class Exercise { // 习题类，用于调用算式类进行题目的生成。

	private static int QUESTION_NUMBER = 50; // 初始化生成题目数量和存储对象数组。
	private static BinaryOperation operationList[] = new BinaryOperation[QUESTION_NUMBER];

	public void generateBinaryExercise() { // 随机生成50道加减法习题的函数
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) { // 循环调用加减法算式生成函数并进行检查判断
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation; // 将生成的对象储存在数组
		}
	}

	public void generateAdditionExercise() { // 随机生成50道加法习题的函数
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) { // 循环调用加法算式生成函数并进行检查判断
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation; // 将生成的对象储存在数组
		}
	}

	public void generatesubstractExercise() { // 随机生成50道减法习题的函数
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < QUESTION_NUMBER; i++) { // 循环调用减法算式生成函数并进行检查判断
			anOperation = opCreator.generateBinaryOperation();
			while (cheakRepeat(anOperation, i)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation; // 将生成的对象储存在数组
		}
	}

	public static boolean cheakRepeat(BinaryOperation anOperation, int length) { // 检查数组内有无重复数
		for (int i = 0; i < length; i++) {
			if (anOperation.equals(operationList[i])) { // 调用BinaryOperation对象中的equals函数进行判断，返回True表示数组内存在重复数
				return true;
			}
		}
		return false;
	}

	void formateAndDisplay() { // 设定输出格式和输出题目算式。
		for (int i = 0; i < QUESTION_NUMBER; i++) { // 循环数组中的对象并调用asString函数输出字符串
			System.out.print((i + 1) + "、 " + operationList[i].asString() + "\t");
			if ((i + 1) % 5 == 0) { // 每输出5道算式则换行
				System.out.print("\n");
			}
		}
	}
}
