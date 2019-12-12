package Calculations;

import java.util.Scanner;

public class WindowsOperation { // 写入文件的界面操作
	Scanner in = new Scanner(System.in);

	public void writeOPeration() { // 选择操作
		System.out.println("1、加法习题");
		System.out.println("2、减法习题");
		System.out.println("3、加减法混合习题");
		while (true) { // 防止失误操作
			System.out.print("请选择您要创建的类型：");
			int key = in.nextInt(); // 输入操作序号
			System.out.println("----------------------------");
			System.out.print("请您输入所创建题目的套数：");
			if (key == 1) { // 进行加法算式的写入
				int count = in.nextInt(); // 输入创建加法文件数量
				System.out.println("----------------------------");
				createAddCSV(count);
				break;
			} else if (key == 2) { // 进行减法算式的写入
				int count = in.nextInt(); // 输入创建加法文件数量
				System.out.println("----------------------------");
				createSubCSV(count);
				break;
			} else if (key == 3) { // 进行加减法混合算式的写入
				int count = in.nextInt(); // 输入创建加法文件数量
				System.out.println("----------------------------");
				createMixCSV(count);
				break;
			} else { // 失误操作，重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}

	public void createAddCSV(int number) { // 加法算式的写入
		int i;// 记录创建文件数量
		for (i = 0; i < number; i++) { // 生成加法习题文件的数量
			String path = "D:\\CSV文件\\习题文件\\exercise_add_50_" + i + ".csv";
			WriteAddCSV wa = new WriteAddCSV(); // 调用加法习题写入操作类
			wa.createWrite(path);
			String pathAnswer = "D:\\CSV文件\\答案文件\\answer_ae_50_" + i + ".csv";
			wa.addAnswer(pathAnswer);
		}
		System.out.println("--------------" + i + "套加法习题已完成创建操作--------------");
	}

	public void createSubCSV(int number) {// 减法算式的写入
		int i;// 记录创建文件数量
		for (i = 0; i < number; i++) { // 生成减法习题文件的数量
			String path = "D:\\CSV文件\\习题文件\\exercise_sub_50_" + i + ".csv";
			WriteSubCSV wa = new WriteSubCSV(); // 调用减法习题写入操作类
			wa.createWrite(path);
			String pathAnswer = "D:\\CSV文件\\答案文件\\answer_se_50_" + i + ".csv";
			wa.subAnswer(pathAnswer);
		}
		System.out.println("--------------" + i + "套减法习题已完成创建操作--------------");
	}

	public void createMixCSV(int number) {// 加减法混合算式的写入
		int i;// 记录创建文件数量
		for (i = 0; i < number; i++) { // 生成加减法混合习题文件的数量
			String path = "D:\\CSV文件\\习题文件\\exercise_mix_50_" + i + ".csv";
			WriteMixCSV wa = new WriteMixCSV(); // 调用加减法混合习题写入操作类
			wa.createWrite(path);
			String pathAnswer = "D:\\CSV文件\\答案文件\\answer_me_50_" + i + ".csv";
			wa.mixAnswer(pathAnswer);
		}
		System.out.println("--------------" + i + "套加减法混合习题已完成创建操作--------------");
	}

	public void readOperation() {
		System.out.println("1、加法习题");
		System.out.println("2、减法习题");
		System.out.println("3、加减法混合习题");
		while (true) { // 防止失误操作
			System.out.print("请选择读取习题的类型：");
			int key = in.nextInt(); // 输入操作序号
			System.out.println("----------------------------");
			System.out.print("请选择读取习题的序号：");
			CSVRead read = new CSVRead(); // 读取类的调用
			Practice practice = new Practice(); // 练习类调用
			if (key == 1) { // 进行加法习题文件的赋值
				int number = in.nextInt();
				System.out.println("----------------------------");
				String pathRead = "D:\\CSV文件\\习题文件\\exercise_add_50_" + number + ".csv";
				String pathPractic = "D:\\CSV文件\\练习文件\\praction_ae_50_" + number + ".csv";
				read.readCSVExercise(pathRead);
				practice.judge(pathPractic);
				break;
			} else if (key == 2) { // 进行减法习题文件的赋值
				int number = in.nextInt();
				System.out.println("----------------------------");
				String pathRead = "D:\\CSV文件\\习题文件\\exercise_sub_50_" + number + ".csv";
				String pathPractic = "D:\\CSV文件\\练习文件\\praction_se_50_" + number + ".csv";
				read.readCSVExercise(pathRead);
				practice.judge(pathPractic);
				break;
			} else if (key == 3) { // 进行加减法混合习题文件的赋值
				int number = in.nextInt();
				System.out.println("----------------------------");
				String pathRead = "D:\\CSV文件\\习题文件\\exercise_mix_50_" + number + ".csv";
				String pathPractic = "D:\\CSV文件\\练习文件\\praction_me_50_" + number + ".csv";
				read.readCSVExercise(pathRead);
				practice.judge(pathPractic);
				break;
			} else { // 失误操作，重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}

	public void judgementOperation() { // 选择操作
		System.out.println("1、加法习题");
		System.out.println("2、减法习题");
		System.out.println("3、加减法混合习题");
		while (true) { // 防止失误操作
			System.out.print("请选择您要批改作业的类型：");
			int key = in.nextInt(); // 输入操作序号
			System.out.println("----------------------------");
			System.out.print("请输入您要批改作业的序号：");
			String pathJudgement = null;
			String pathAnswer = null;
			String pathPractice = null;
			Judgement judgement = new Judgement(); // 调用批改文件生成类
			if (key == 1) { // 进行加法各个文件的赋值
				int number = in.nextInt();
				System.out.println("----------------------------");
				pathJudgement = "D:\\CSV文件\\批改文件\\checking_ae_50_" + number + ".csv";
				pathAnswer = "D:\\CSV文件\\答案文件\\answer_ae_50_" + number + ".csv";
				pathPractice = "D:\\CSV文件\\练习文件\\praction_ae_50_" + number + ".csv";
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				judgement.judgeDisplay(pathJudgement);
				break;
			} else if (key == 2) { // 进行减法习题各个的赋值
				int number = in.nextInt();
				System.out.println("----------------------------");
				pathJudgement = "D:\\CSV文件\\批改文件\\checking_se_50_" + number + ".csv";
				pathAnswer = "D:\\CSV文件\\答案文件\\answer_se_50_" + number + ".csv";
				pathPractice = "D:\\CSV文件\\练习文件\\praction_se_50_" + number + ".csv";
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				judgement.judgeDisplay(pathJudgement);
				break;
			} else if (key == 3) { // 进行加减法混合各个文件的赋值
				int number = in.nextInt();
				System.out.println("----------------------------");
				pathJudgement = "D:\\CSV文件\\批改文件\\checking_me_50_" + number + ".csv";
				pathAnswer = "D:\\CSV文件\\答案文件\\answer_me_50_" + number + ".csv";
				pathPractice = "D:\\CSV文件\\练习文件\\praction_me_50_" + number + ".csv";
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				judgement.judgeDisplay(pathJudgement);
				break;
			} else { // 失误操作，重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}
}
