package Calculations;


import java.util.Scanner;

public class ExerciseSheet { // 习题集系统类，用于进行创建、读出、批改习题操作
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 声明输入控制
		System.out.println("请选择您将要进行的操作："); // 界面交互
		System.out.println("1、创建习题");
		System.out.println("2、读取习题");
		System.out.println("3、批改习题");
		while (true) { // 使用while循环防止失误操作
			int key = in.nextInt(); // 输入操作序号
			if (key == 1) { // 调用写入操作类创建习题文件
				WriteOperation wo = new WriteOperation();
				wo.writeOPeration();
				break;
			} else if (key == 2) { // 调用读取操作类读取习题文件
				ReadOperation ro = new ReadOperation();
				ro.readOperation();
				break;
			} else if (key == 3) { // 调用批改作业类批改练习文件中的习题答案
				JudgementOperation jo = new JudgementOperation();
				jo.judgementOperation();
				break;
			} else { // 失误操作提示并重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}
}
