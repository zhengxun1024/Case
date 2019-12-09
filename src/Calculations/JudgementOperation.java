package Calculations;

import java.util.Scanner;

public class JudgementOperation { // 批改界面操作
	public void judgementOperation() { // 选择操作
		Scanner in = new Scanner(System.in);
		System.out.println("请选择您要批改作业的类型：");
		System.out.println("1、加法习题");
		System.out.println("2、减法习题");
		System.out.println("3、加减法混合习题");
		while (true) { // 防止失误操作
			int key = in.nextInt(); // 输入操作序号
			if (key == 1) { // 进行加法各个文件的赋值
				System.out.print("请输入您要批改作业的序号：");
				int number = in.nextInt();
				String pathJudgement = "D:\\CSV文件\\批改文件\\checking_ae_50_" + number + ".csv";
				String pathAnswer = "D:\\CSV文件\\答案文件\\answer_ae_50_" + number + ".csv";
				String pathPractice = "D:\\CSV文件\\练习文件\\praction_ae_50_" + number + ".csv";
				Judgement judgement = new Judgement(); // 调用批改文件生成类
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				JudgementDisplay judgeDisplay = new JudgementDisplay(); // 调用批改结果显示类
				judgeDisplay.judgeDisplay(pathJudgement);
				break;
			} else if (key == 2) { // 进行减法习题各个的赋值
				System.out.print("请输入您要批改作业的序号：");
				int number = in.nextInt();
				String pathJudgement = "D:\\CSV文件\\批改文件\\checking_se_50_" + number + ".csv";
				String pathAnswer = "D:\\CSV文件\\答案文件\\answer_se_50_" + number + ".csv";
				String pathPractice = "D:\\CSV文件\\练习文件\\praction_se_50_" + number + ".csv";
				Judgement judgement = new Judgement(); // 调用批改文件生成类
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				JudgementDisplay judgeDisplay = new JudgementDisplay(); // 调用批改结果显示类
				judgeDisplay.judgeDisplay(pathJudgement);
				break;
			} else if (key == 3) { // 进行加减法混合各个文件的赋值
				System.out.print("请输入您要批改作业的序号：");
				int number = in.nextInt();
				String pathJudgement = "D:\\CSV文件\\批改文件\\checking_me_50_" + number + ".csv";
				String pathAnswer = "D:\\CSV文件\\答案文件\\answer_me_50_" + number + ".csv";
				String pathPractice = "D:\\CSV文件\\练习文件\\praction_me_50_" + number + ".csv";
				Judgement judgement = new Judgement(); // 调用批改文件生成类
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				JudgementDisplay judgeDisplay = new JudgementDisplay(); // 调用批改结果显示类
				judgeDisplay.judgeDisplay(pathJudgement);
				break;
			} else { // 失误操作，重新输入
				System.out.println("您的选择不在范围内，请重新选择！");
			}
		}
	}
}
