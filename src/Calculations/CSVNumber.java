package Calculations;

public class CSVNumber { // 根据传递的参数进行文件的写入
	static int count = 0; // 记录创建文件数量

	public void createAddCSV(int number) { // 加法算式的写入
		int i;
		for (i = 0; i < number; i++) { // 生成加法习题文件的数量
			String path = "D:\\CSV文件\\习题文件\\exercise_add_50_" + count + ".csv";
			WriteAddCSV wa = new WriteAddCSV(); // 调用加法习题写入操作类
			wa.createWrite(path);
			String pathJudge = "D:\\CSV文件\\答案文件\\answer_ae_50_" + count + ".csv";
			Answer answer = new Answer(); // 调用批改类进行答案文件的生成
			answer.answer(pathJudge);
			count++;
		}
		System.out.println("--------------" + i + "套加法习题已完成创建操作--------------");
	}

	public void createSubCSV(int number) {// 减法算式的写入
		int i;
		for (i = 0; i < number; i++) { // 生成减法习题文件的数量
			String path = "D:\\CSV文件\\习题文件\\exercise_sub_50_" + count + ".csv";
			WriteSubCSV wa = new WriteSubCSV(); // 调用减法习题写入操作类
			wa.createWrite(path);
			String pathJudge = "D:\\CSV文件\\答案文件\\answer_se_50_" + count + ".csv";
			Answer answer = new Answer(); // 调用批改类进行答案文件的生成
			answer.answer(pathJudge);
			count++;
		}
		System.out.println("--------------" + i + "套减法习题已完成创建操作--------------");
	}

	public void createMixCSV(int number) {// 加减法混合算式的写入
		int i;
		for (i = 0; i < number; i++) { // 生成加减法混合习题文件的数量
			String path = "D:\\CSV文件\\习题文件\\exercise_mix_50_" + count + ".csv";
			WriteMixCSV wa = new WriteMixCSV(); // 调用加减法混合习题写入操作类
			wa.createWrite(path);
			String pathJudge = "D:\\CSV文件\\答案文件\\answer_me_50_" + count + ".csv";
			Answer answer = new Answer(); // 调用批改类进行答案文件的生成
			answer.answer(pathJudge);
			count++;
		}
		System.out.println("--------------" + i + "套加减法混合习题已完成创建操作--------------");
	}
}
