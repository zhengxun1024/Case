package Calculations;

import java.util.Scanner;

public class ReadOperation { // ��ȡ�ļ��Ľ������
	public void readOperation() {
		Scanner in = new Scanner(System.in);
		System.out.println("��ѡ���ȡϰ������ͣ�");
		System.out.println("1���ӷ�ϰ��");
		System.out.println("2������ϰ��");
		System.out.println("3���Ӽ������ϰ��");
		while (true) { // ��ֹʧ�����
			int key = in.nextInt(); // ����������
			if (key == 1) { // ���мӷ�ϰ���ļ��ĸ�ֵ
				System.out.print("��ѡ���ȡϰ�����ţ�");
				int number = in.nextInt();
				String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_add_50_" + number + ".csv";
				CSVRead cr = new CSVRead(); // ��ȡ��ĵ���
				cr.readCSVExercise(path);
				String pathPractic = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_ae_50_" + number + ".csv";
				Practice practice = new Practice(); // ��ϰ�����
				practice.practice(pathPractic);
				break;
			} else if (key == 2) { // ���м���ϰ���ļ��ĸ�ֵ
				System.out.print("��ѡ���ȡϰ�����ţ�");
				int number = in.nextInt();
				String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_sub_50_" + number + ".csv";
				CSVRead cr = new CSVRead(); // ��ȡ��ĵ���
				cr.readCSVExercise(path);
				String pathPractic = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_se_50_" + number + ".csv";
				Practice practice = new Practice(); // ��ϰ�����
				practice.practice(pathPractic);
				break;
			} else if (key == 3) { // ���мӼ������ϰ���ļ��ĸ�ֵ
				System.out.print("��ѡ���ȡϰ�����ţ�");
				int number = in.nextInt();
				String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_mix_50_" + number + ".csv";
				CSVRead cr = new CSVRead(); // ��ȡ��ĵ���
				cr.readCSVExercise(path);
				String pathPractic = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_me_50_" + number + ".csv";
				Practice practice = new Practice(); // ��ϰ�����
				practice.practice(pathPractic);
				break;
			} else { // ʧ���������������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}
}
