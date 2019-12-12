package Calculations;

import java.util.Scanner;

public class WindowsOperation { // д���ļ��Ľ������
	Scanner in = new Scanner(System.in);

	public void writeOPeration() { // ѡ�����
		System.out.println("1���ӷ�ϰ��");
		System.out.println("2������ϰ��");
		System.out.println("3���Ӽ������ϰ��");
		while (true) { // ��ֹʧ�����
			System.out.print("��ѡ����Ҫ���������ͣ�");
			int key = in.nextInt(); // ����������
			System.out.println("----------------------------");
			System.out.print("����������������Ŀ��������");
			if (key == 1) { // ���мӷ���ʽ��д��
				int count = in.nextInt(); // ���봴���ӷ��ļ�����
				System.out.println("----------------------------");
				createAddCSV(count);
				break;
			} else if (key == 2) { // ���м�����ʽ��д��
				int count = in.nextInt(); // ���봴���ӷ��ļ�����
				System.out.println("----------------------------");
				createSubCSV(count);
				break;
			} else if (key == 3) { // ���мӼ��������ʽ��д��
				int count = in.nextInt(); // ���봴���ӷ��ļ�����
				System.out.println("----------------------------");
				createMixCSV(count);
				break;
			} else { // ʧ���������������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}

	public void createAddCSV(int number) { // �ӷ���ʽ��д��
		int i;// ��¼�����ļ�����
		for (i = 0; i < number; i++) { // ���ɼӷ�ϰ���ļ�������
			String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_add_50_" + i + ".csv";
			WriteAddCSV wa = new WriteAddCSV(); // ���üӷ�ϰ��д�������
			wa.createWrite(path);
			String pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_ae_50_" + i + ".csv";
			wa.addAnswer(pathAnswer);
		}
		System.out.println("--------------" + i + "�׼ӷ�ϰ������ɴ�������--------------");
	}

	public void createSubCSV(int number) {// ������ʽ��д��
		int i;// ��¼�����ļ�����
		for (i = 0; i < number; i++) { // ���ɼ���ϰ���ļ�������
			String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_sub_50_" + i + ".csv";
			WriteSubCSV wa = new WriteSubCSV(); // ���ü���ϰ��д�������
			wa.createWrite(path);
			String pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_se_50_" + i + ".csv";
			wa.subAnswer(pathAnswer);
		}
		System.out.println("--------------" + i + "�׼���ϰ������ɴ�������--------------");
	}

	public void createMixCSV(int number) {// �Ӽ��������ʽ��д��
		int i;// ��¼�����ļ�����
		for (i = 0; i < number; i++) { // ���ɼӼ������ϰ���ļ�������
			String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_mix_50_" + i + ".csv";
			WriteMixCSV wa = new WriteMixCSV(); // ���üӼ������ϰ��д�������
			wa.createWrite(path);
			String pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_me_50_" + i + ".csv";
			wa.mixAnswer(pathAnswer);
		}
		System.out.println("--------------" + i + "�׼Ӽ������ϰ������ɴ�������--------------");
	}

	public void readOperation() {
		System.out.println("1���ӷ�ϰ��");
		System.out.println("2������ϰ��");
		System.out.println("3���Ӽ������ϰ��");
		while (true) { // ��ֹʧ�����
			System.out.print("��ѡ���ȡϰ������ͣ�");
			int key = in.nextInt(); // ����������
			System.out.println("----------------------------");
			System.out.print("��ѡ���ȡϰ�����ţ�");
			CSVRead read = new CSVRead(); // ��ȡ��ĵ���
			Practice practice = new Practice(); // ��ϰ�����
			if (key == 1) { // ���мӷ�ϰ���ļ��ĸ�ֵ
				int number = in.nextInt();
				System.out.println("----------------------------");
				String pathRead = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_add_50_" + number + ".csv";
				String pathPractic = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_ae_50_" + number + ".csv";
				read.readCSVExercise(pathRead);
				practice.judge(pathPractic);
				break;
			} else if (key == 2) { // ���м���ϰ���ļ��ĸ�ֵ
				int number = in.nextInt();
				System.out.println("----------------------------");
				String pathRead = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_sub_50_" + number + ".csv";
				String pathPractic = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_se_50_" + number + ".csv";
				read.readCSVExercise(pathRead);
				practice.judge(pathPractic);
				break;
			} else if (key == 3) { // ���мӼ������ϰ���ļ��ĸ�ֵ
				int number = in.nextInt();
				System.out.println("----------------------------");
				String pathRead = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_mix_50_" + number + ".csv";
				String pathPractic = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_me_50_" + number + ".csv";
				read.readCSVExercise(pathRead);
				practice.judge(pathPractic);
				break;
			} else { // ʧ���������������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}

	public void judgementOperation() { // ѡ�����
		System.out.println("1���ӷ�ϰ��");
		System.out.println("2������ϰ��");
		System.out.println("3���Ӽ������ϰ��");
		while (true) { // ��ֹʧ�����
			System.out.print("��ѡ����Ҫ������ҵ�����ͣ�");
			int key = in.nextInt(); // ����������
			System.out.println("----------------------------");
			System.out.print("��������Ҫ������ҵ����ţ�");
			String pathJudgement = null;
			String pathAnswer = null;
			String pathPractice = null;
			Judgement judgement = new Judgement(); // ���������ļ�������
			if (key == 1) { // ���мӷ������ļ��ĸ�ֵ
				int number = in.nextInt();
				System.out.println("----------------------------");
				pathJudgement = "D:\\CSV�ļ�\\�����ļ�\\checking_ae_50_" + number + ".csv";
				pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_ae_50_" + number + ".csv";
				pathPractice = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_ae_50_" + number + ".csv";
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				judgement.judgeDisplay(pathJudgement);
				break;
			} else if (key == 2) { // ���м���ϰ������ĸ�ֵ
				int number = in.nextInt();
				System.out.println("----------------------------");
				pathJudgement = "D:\\CSV�ļ�\\�����ļ�\\checking_se_50_" + number + ".csv";
				pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_se_50_" + number + ".csv";
				pathPractice = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_se_50_" + number + ".csv";
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				judgement.judgeDisplay(pathJudgement);
				break;
			} else if (key == 3) { // ���мӼ�����ϸ����ļ��ĸ�ֵ
				int number = in.nextInt();
				System.out.println("----------------------------");
				pathJudgement = "D:\\CSV�ļ�\\�����ļ�\\checking_me_50_" + number + ".csv";
				pathAnswer = "D:\\CSV�ļ�\\���ļ�\\answer_me_50_" + number + ".csv";
				pathPractice = "D:\\CSV�ļ�\\��ϰ�ļ�\\praction_me_50_" + number + ".csv";
				judgement.judgement(pathAnswer, pathPractice, pathJudgement);
				judgement.judgeDisplay(pathJudgement);
				break;
			} else { // ʧ���������������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}
}
