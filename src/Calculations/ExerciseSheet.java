package Calculations;

import java.util.Scanner;

public class ExerciseSheet { // 习题集系统类，用于进行创建、读出、批改习题操作
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 声明输入控制
		System.out.println("1、创建习题");
		System.out.println("2、读取习题");
		System.out.println("3、批改习题");
		while (true) { // 使用while循环防止失误操作
			System.out.print("请选择您将要进行的操作："); // 界面交互
			int key = in.nextInt(); // 输入操作序号
			System.out.println("----------------------------");
			WindowsOperation wo = new WindowsOperation();
			if (key == 1) { // 调用写入操作函数创建习题文件
				wo.writeOPeration();
				break;
			} else if (key == 2) { // 调用读取操作函数读取习题文件
				wo.readOperation();
				break;
			} else if (key == 3) { // 调用批改作业函数批改练习文件中的习题答案
				wo.judgementOperation();
				break;
			} else { // 失误操作提示并重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}
}
