package Calculations;

import java.util.Scanner;

public class WriteOperation { // д���ļ��Ľ������
	public void writeOPeration() { // ѡ�����
		Scanner in = new Scanner(System.in);
		System.out.println("��ѡ����Ҫ���������ͣ�");
		System.out.println("1���ӷ�ϰ��");
		System.out.println("2������ϰ��");
		System.out.println("3���Ӽ������ϰ��");
		while (true) { // ��ֹʧ�����
			int key = in.nextInt(); // ����������
			if (key == 1) { // ���мӷ���ʽ��д��
				CSVNumber cnAdd = new CSVNumber();
				System.out.print("����������������Ŀ��������");
				int addCount = in.nextInt(); // ���봴���ӷ��ļ�����
				cnAdd.createAddCSV(addCount);
				break;
			} else if (key == 2) { // ���м�����ʽ��д��
				CSVNumber cnSub = new CSVNumber();
				System.out.print("����������������Ŀ��������");
				int subCount = in.nextInt(); // ���봴�������ļ�����
				cnSub.createSubCSV(subCount);
				break;
			} else if (key == 3) { // ���мӼ��������ʽ��д��
				CSVNumber cnMix = new CSVNumber();
				System.out.print("����������������Ŀ��������");
				int mixCount = in.nextInt(); // ���봴���Ӽ�������ļ�����
				cnMix.createMixCSV(mixCount);
				break;
			} else { // ʧ���������������
				System.out.println("����ѡ���ڷ�Χ�ڣ�������ѡ��");
			}
		}
	}
}
