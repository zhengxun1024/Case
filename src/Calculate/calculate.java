package Calculate;

import java.util.*;

public class calculate {
	public static int Number = 50; // ����ȫ�ֱ�������ʼ����Ŀ����

	public static boolean cheakIsRepeat(int[] array) { // ��������������ظ���
		HashSet<Integer> hashSet = new HashSet<Integer>(); // ʹ��HashSet()�����ж�
		for (int i = 0; i < array.length; i++) {
			hashSet.add(array[i]);
		}
		if (hashSet.size() == array.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] scanf(int[][] array) { // ��������������ж���ֵ�����㡣
		Random random = new Random();
		int i = 0;
		while (i < Number) {
			array[0][i] = random.nextInt(101); // ����һ����������Զ�ά���鸳ֵ��
			array[1][i] = random.nextInt(2); // ���������0��1��0������ţ�1����Ӻš�
			array[2][i] = random.nextInt(101);
			if (array[1][i] == 1) { // �ж�ÿһ����������Ӧ�ļӼ��Ų����м��㡣
				array[3][i] = array[0][i] + array[2][i];
			} else {
				array[3][i] = array[0][i] - array[2][i];
			}
			if ((array[3][i] > 100) || (array[3][i] <= 0)) { // �����ظ��ж���һ��������Ƿ񳬳���Χ
				continue;
			}
			if (cheakIsRepeat(array[0]) && cheakIsRepeat(array[1]) && cheakIsRepeat(array[2])) { // �ж���һ��������Ƿ���֮ǰ�ظ�,�ظ�������forѭ����
				continue; // ��һ��������ظ�����������ѭ��,ִ���´�ѭ����
			}
			i++;
		}
		return array; // ���ش��м�������ά����
	}

	public static void print(int[][] array) { // �����Ŀ��������
		int i;
		char c;
		System.out.println("-----�������" + Number + "��100���ڵļӼ�������Ŀ�����-----");
		for (i = 0; i < Number; i++) { // ѭ�������Ŀ
			if (array[1][i] == 1) { // �ж�ÿһ����������Ӧ�ļӼ��š�
				c = '+';
			} else {
				c = '-';
			}
			System.out.print("��" + (i + 1) + "�⣺" + array[0][i] + c + array[2][i] + "=" + "\t\t"); // �����Ŀ
			if ((i + 1) % 5 == 0) { // ÿ���5����Ŀ����
				System.out.print("\n");
			}
		}

	}

	public static void calculations(int[] array) { // �����Ŀ�𰸡�
		System.out.println("-----������ϰ��Ĵ�-----");
		for (int i = 0; i < Number; i++) {
			System.out.print((i + 1) + ":" + array[i] + "\t\t");
			if ((i + 1) % 5 == 0) {// ÿ���5���𰸻��С�
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) { // ������
		int[][] total_array = new int[4][Number]; // �����ά����,������1,�Ӽ���,��2,�������ĸ�һά���顣
		total_array = scanf(total_array); // ����scanf���������������ֵ�����ض�ά���顣
		print(total_array); // ����print����������Ŀ
		calculations(total_array[3]); // ����calculations��������𰸡�
	}
}
