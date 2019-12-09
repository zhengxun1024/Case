package Calculations;

import java.util.Scanner;

public class ReadOperation { // 读取文件的界面操作
	public void readOperation() {
		Scanner in = new Scanner(System.in);
		System.out.println("请选择读取习题的类型：");
		System.out.println("1、加法习题");
		System.out.println("2、减法习题");
		System.out.println("3、加减法混合习题");
		while (true) { // 防止失误操作
			int key = in.nextInt(); // 输入操作序号
			if (key == 1) { // 进行加法习题文件的赋值
				System.out.print("请选择读取习题的序号：");
				int number = in.nextInt();
				String path = "D:\\CSV文件\\习题文件\\exercise_add_50_" + number + ".csv";
				CSVRead cr = new CSVRead(); // 读取类的调用
				cr.readCSVExercise(path);
				String pathPractic = "D:\\CSV文件\\练习文件\\praction_ae_50_" + number + ".csv";
				Practice practice = new Practice(); // 练习类调用
				practice.practice(pathPractic);
				break;
			} else if (key == 2) { // 进行减法习题文件的赋值
				System.out.print("请选择读取习题的序号：");
				int number = in.nextInt();
				String path = "D:\\CSV文件\\习题文件\\exercise_sub_50_" + number + ".csv";
				CSVRead cr = new CSVRead(); // 读取类的调用
				cr.readCSVExercise(path);
				String pathPractic = "D:\\CSV文件\\练习文件\\praction_se_50_" + number + ".csv";
				Practice practice = new Practice(); // 练习类调用
				practice.practice(pathPractic);
				break;
			} else if (key == 3) { // 进行加减法混合习题文件的赋值
				System.out.print("请选择读取习题的序号：");
				int number = in.nextInt();
				String path = "D:\\CSV文件\\习题文件\\exercise_mix_50_" + number + ".csv";
				CSVRead cr = new CSVRead(); // 读取类的调用
				cr.readCSVExercise(path);
				String pathPractic = "D:\\CSV文件\\练习文件\\praction_me_50_" + number + ".csv";
				Practice practice = new Practice(); // 练习类调用
				practice.practice(pathPractic);
				break;
			} else { // 失误操作，重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}
}
