package Calculations;

import java.util.Scanner;

public class ExerciseSheet { // ϰ�⼯ϵͳ�࣬���ڽ��д���������������ϰ�����
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // �����������
		System.out.println("1������ϰ��");
		System.out.println("2����ȡϰ��");
		System.out.println("3������ϰ��");
		while (true) { // ʹ��whileѭ����ֹʧ�����
			System.out.print("��ѡ������Ҫ���еĲ�����"); // ���潻��
			int key = in.nextInt(); // ����������
			System.out.println("----------------------------");
			WindowsOperation wo = new WindowsOperation();
			if (key == 1) { // ����д�������������ϰ���ļ�
				wo.writeOPeration();
				break;
			} else if (key == 2) { // ���ö�ȡ����������ȡϰ���ļ�
				wo.readOperation();
				break;
			} else if (key == 3) { // ����������ҵ����������ϰ�ļ��е�ϰ���
				wo.judgementOperation();
				break;
			} else { // ʧ�������ʾ����������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}
}
