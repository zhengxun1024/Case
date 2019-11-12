package Calculate;

import java.util.*;

public class calculate { // �������50��������100�ļӼ�����Ŀ
	public static int questionNumber = 50; // ����ȫ�ֱ�������ʼ����Ŀ����

	public static boolean cheakIsRepeat(int[] array) { // ��������������ظ���
		HashSet<Integer> hashSet = new HashSet<Integer>(); // ʹ��HashSet()��������������ظ���
		for (int i = 0; i < array.length; i++) {
			hashSet.add(array[i]);
		}
		if (hashSet.size() == array.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] scanfDate(int[][] array) { // ��������������ж���ֵ����������
		Random random = new Random();
		int i = 0;
		while (i < questionNumber) {// ������������Զ�ά���鸳ֵ��ֱ��50��
			array[0][i] = random.nextInt(101);
			array[1][i] = random.nextInt(2); // ���������0��1��0������ţ�1����Ӻš�
			array[2][i] = random.nextInt(101);
			if (array[1][i] == 1) { // �ж�ÿһ����������Ӧ�ļӼ��Ų����м��㡣0������ţ�1����Ӻš�
				array[3][i] = array[0][i] + array[2][i];
			} else {
				array[3][i] = array[0][i] - array[2][i];
			}
			if ((array[3][i] > 100) || (array[3][i] <= 0)) { // �ж���һ��ļ������Ƿ񳬳�0~100�ķ�Χ
				continue;
			}
			if (cheakIsRepeat(array[0]) && cheakIsRepeat(array[1]) && cheakIsRepeat(array[2])) { // �ж���һ��������Ƿ���֮ǰ�ظ���
				continue; // ��һ��������ظ�����������ѭ��,ִ���´�ѭ����
			}
			i++;
		}
		return array; // ���ش��м�������ά����
	}

	public static void printFormula(int[][] array) { // �����ʽ
		int i;
		char c;
		System.out.println("-----�������" + questionNumber + "��100���ڵļӼ�������Ŀ�����-----");
		for (i = 0; i < questionNumber; i++) { // ѭ�������ʽ
			if (array[1][i] == 1) { // �ж�ÿһ����������Ӧ�ļӼ��ţ�0������ţ�1����Ӻš�
				c = '+';
			} else {
				c = '-';
			}
			System.out.print("��" + (i + 1) + "�⣺" + array[0][i] + c + array[2][i] + "=" + "\t\t"); // �����Ŀ
			if ((i + 1) % 5 == 0) { // ÿ���5����ʽ����
				System.out.print("\n");
			}
		}

	}

	public static void printAnswer(int[] array) { // �����Ŀ�𰸡�
		int i;
		System.out.println("-----������ϰ��Ĵ�-----");
		for (i = 0; i < questionNumber; i++) {// ѭ��������
			System.out.print((i + 1) + ":" + array[i] + "\t\t");
			if ((i + 1) % 5 == 0) { // ÿ���5���𰸻��С�
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) { // ������
		int[][] totalArray = new int[4][questionNumber]; // �����ά����,������1,�Ӽ���,��2,�������ĸ�һά���顣
		totalArray = scanfDate(totalArray); // ����scanfDate���������������ֵ������𰸣����ض�ά���顣
		printFormula(totalArray); // ����printFormula����������ʽ
		printAnswer(totalArray[3]); // ����printAnswer��������𰸡�
	}
}
