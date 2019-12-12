package Calculations;

public class WriteMixCSV extends CSVWrite { // 加减法混合算式写入操作子类
	public void writeAddCSV(String path) { // 调用写入操作函数
		createWrite(path); // 加减法混合算式写入
	}

	public void mixAnswer(String path) { // 调用写入操作函数
		answer(path); // 减法算式写入
	}

	@Override
	public void generateExercise() { // 重写加减法混合算式函数
		exercise.generateBinaryExercise(setValue.getNumber());
	}
}
