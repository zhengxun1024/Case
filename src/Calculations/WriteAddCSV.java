package Calculations;

public class WriteAddCSV extends CreateCSVWrite { // 加法算式写入操作子类
	public void writeAddCSV(String path) { // 调用写入操作函数
		createWrite(path); // 加法算式写入
	}

	@Override
	public void generateExercise() { // 重写加法生成算式函数
		exercise.generateAdditionExercise(setValue.getAddNumber());
	}
}
