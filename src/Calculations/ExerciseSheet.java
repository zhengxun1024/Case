package Calculations;


import java.util.Scanner;

public class ExerciseSheet { // ϰ�⼯ϵͳ�࣬���ڽ��д���������������ϰ�����
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // �����������
		System.out.println("��ѡ������Ҫ���еĲ�����"); // ���潻��
		System.out.println("1������ϰ��");
		System.out.println("2����ȡϰ��");
		System.out.println("3������ϰ��");
		while (true) { // ʹ��whileѭ����ֹʧ�����
			int key = in.nextInt(); // ����������
			if (key == 1) { // ����д������ഴ��ϰ���ļ�
				WriteOperation wo = new WriteOperation();
				wo.writeOPeration();
				break;
			} else if (key == 2) { // ���ö�ȡ�������ȡϰ���ļ�
				ReadOperation ro = new ReadOperation();
				ro.readOperation();
				break;
			} else if (key == 3) { // ����������ҵ��������ϰ�ļ��е�ϰ���
				JudgementOperation jo = new JudgementOperation();
				jo.judgementOperation();
				break;
			} else { // ʧ�������ʾ����������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}
}
