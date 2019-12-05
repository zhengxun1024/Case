package Calculations;

import java.util.ArrayList;
import java.util.Random;

public class Exercise { // 习题类，用于调用算式类进行题目的生成。
	private ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>(); // 利用ArrayList储存生成题目的对象。
	// 根据设置的题目数生成相应的加法题

	public void generateAdditionExercise(int operationCount) {
		operationList.clear(); // 使用前先清空列表
		BinaryOperation anOperation;
		while (operationCount > 0) { // 循环调用AdditionOperation类生成加法算式储存在operationList列表
			do {
				anOperation = new AdditionOperation();
			} while (operationList.contains(anOperation)); // 利用列表的contains函数进行集合的查重，存在重复值返回true，不存在返回false。
			operationList.add(anOperation); // 使用列表的add函数将anOperation加入到列表
			operationCount--;
		}
	}

	public void generateSubstractExercise(int operationCount) {// 根据设置的题目数生成相应的减法题
		operationList.clear(); // 使用前先清空列表
		BinaryOperation anOperation;
		while (operationCount > 0) { // 循环调用SubstractOperation类生成减法算式储存在operationList列表
			do {
				anOperation = new SubstractOperation();
			} while (operationList.contains(anOperation)); // 利用列表的contains函数进行集合的查重，存在重复值返回true，不存在返回false。
			operationList.add(anOperation); // 使用列表的add函数将anOperation加入到列表
			operationCount--;
		}
	}

	public void generateBinaryExercise(int operationCount) {// 根据设置的题目数生成相应的加减法题
		operationList.clear(); // 使用前先清空列表
		BinaryOperation anOperation;
		while (operationCount > 0) { // 循环调用generateOperation函数生成减法算式储存在operationList列表
			do {
				anOperation = generateOperation();
			} while (operationList.contains(anOperation));// 利用列表的contains函数进行集合的查重，存在重复值返回true，不存在返回false。
			operationList.add(anOperation);// 使用列表的add函数将anOperation加入到列表
			operationCount--;
		}
	}

	private BinaryOperation generateOperation() {// 根据随机数0 or 1分别调用加法和减法题目函数进行加减法题目的生成
		Random random = new Random();
		int opValue = random.nextInt(2); // 生成随机数1 or 0.
		if (opValue == 1) { // 如果随机数是1 则调用加法生成函数；反之如果是0 则调用减法生成函数。
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}

	void formateAndDisplay(int columns) { // 设定输出格式和输出题目算式。
		BinaryOperation value;
		int size = operationList.size(); // 利用size函数得到列表长度。
		for (int i = 0; i < size; i++) { // 循环获得列表中的对象并调用asString函数输出字符串。
			value = operationList.get(i); // 使用列表函数get 获得BinaryOperation对象
			System.out.print((i + 1) + "、 " + value.asString() + "\t");
			if ((i + 1) % columns == 0) { // 根据参数设定输出格式
				System.out.print("\n");
			}
		}
	}

	void conclutions(Exercise ex, int columns) {
		BinaryOperation value;
		int size = operationList.size(); // 利用size函数得到列表长度。
		for (int i = 0; i < size; i++) { // 循环获得列表中的对象并调用asString函数输出字符串。
			value = operationList.get(i); // 使用列表函数get 获得BinaryOperation对象
			System.out.print((i + 1) + "、 " + value.getValue() + "\t" + "\t");
			if ((i + 1) % columns == 0) { // 根据参数设定输出格式
				System.out.print("\n");
			}
		}
	}
}