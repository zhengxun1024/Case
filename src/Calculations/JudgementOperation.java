package Calculations;

import java.util.Scanner;

public class JudgementOperation { // ���Ľ������
	public void judgementOperation() { // ѡ�����
		Scanner in = new Scanner(System.in);
		System.out.println("��ѡ����Ҫ������ҵ�����ͣ�");
		System.out.println("1���ӷ�ϰ��");
		System.out.println("2������ϰ��");
		System.out.println("3���Ӽ������ϰ��");
		while (true) { // ��ֹʧ�����
			int key = in.nextInt(); // ����������
			if (key == 1) { // ���мӷ������ļ��ĸ�ֵ
				System.out.print("��������Ҫ������ҵ����ţ�");
				int number = in.nextInt();
				String pathJudgement = "D:\\CSV�ļ�\\�����ļ�\\checking_ae_50_" + number + ".csv";
				String pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_ae_50_" + number + ".csv";
				String pathPractice = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_ae_50_" + number + ".csv";
				Judgement judgement = new Judgement(); // ���������ļ�������
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				JudgementDisplay judgeDisplay = new JudgementDisplay(); // �������Ľ����ʾ��
				judgeDisplay.judgeDisplay(pathJudgement);
				break;
			} else if (key == 2) { // ���м���ϰ������ĸ�ֵ
				System.out.print("��������Ҫ������ҵ����ţ�");
				int number = in.nextInt();
				String pathJudgement = "D:\\CSV�ļ�\\�����ļ�\\checking_se_50_" + number + ".csv";
				String pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_se_50_" + number + ".csv";
				String pathPractice = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_se_50_" + number + ".csv";
				Judgement judgement = new Judgement(); // ���������ļ�������
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				JudgementDisplay judgeDisplay = new JudgementDisplay(); // �������Ľ����ʾ��
				judgeDisplay.judgeDisplay(pathJudgement);
				break;
			} else if (key == 3) { // ���мӼ�����ϸ����ļ��ĸ�ֵ
				System.out.print("��������Ҫ������ҵ����ţ�");
				int number = in.nextInt();
				String pathJudgement = "D:\\CSV�ļ�\\�����ļ�\\checking_me_50_" + number + ".csv";
				String pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_me_50_" + number + ".csv";
				String pathPractice = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_me_50_" + number + ".csv";
				Judgement judgement = new Judgement(); // ���������ļ�������
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				JudgementDisplay judgeDisplay = new JudgementDisplay(); // �������Ľ����ʾ��
				judgeDisplay.judgeDisplay(pathJudgement);
				break;
			} else { // ʧ���������������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}
}
