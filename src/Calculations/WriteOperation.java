package Calculations;

import java.util.Scanner;

public class WriteOperation { // 写入文件的界面操作
	public void writeOPeration() { // 选择操作
		Scanner in = new Scanner(System.in);
		System.out.println("请选择您要创建的类型：");
		System.out.println("1、加法习题");
		System.out.println("2、减法习题");
		System.out.println("3、加减法混合习题");
		while (true) { // 防止失误操作
			int key = in.nextInt(); // 输入操作序号
			if (key == 1) { // 进行加法算式的写入
				CSVNumber cnAdd = new CSVNumber();
				System.out.print("请您输入所创建题目的套数：");
				int addCount = in.nextInt(); // 输入创建加法文件数量
				cnAdd.createAddCSV(addCount);
				break;
			} else if (key == 2) { // 进行减法算式的写入
				CSVNumber cnSub = new CSVNumber();
				System.out.print("请您输入所创建题目的套数：");
				int subCount = in.nextInt(); // 输入创建减法文件数量
				cnSub.createSubCSV(subCount);
				break;
			} else if (key == 3) { // 进行加减法混合算式的写入
				CSVNumber cnMix = new CSVNumber();
				System.out.print("请您输入所创建题目的套数：");
				int mixCount = in.nextInt(); // 输入创建加减法混合文件数量
				cnMix.createMixCSV(mixCount);
				break;
			} else { // 失误操作，重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}
}
