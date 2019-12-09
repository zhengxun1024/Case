package Calculations;

public class WriteSubCSV extends CreateCSVWrite { // 减法算式写入操作子类
	public void writeAddCSV(String path) { // 调用写入操作函数
		createWrite(path); // 减法算式写入
	}

	@Override
	public void generateExercise() { // 重写减法算式函数
		exercise.generateSubstractExercise(setValue.getSubNumber());
	}
}
