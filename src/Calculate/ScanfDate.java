package Calculate;

import java.util.Random;

public class ScanfDate {
	public static int[][] scanfDate(int[][] array) { // ��������������ж���ֵ����������
		Random random = new Random();
		int i = 0;
		CheakRepeat cr=new CheakRepeat();
		while (i < array[0].length) {// ������������Զ�ά���鸳ֵ��ֱ��50��
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
			if (cr.cheakRepeat(array[0]) && cr.cheakRepeat(array[1]) && cr.cheakRepeat(array[2])) { // �ж���һ��������Ƿ���֮ǰ�ظ���
				continue; // ��һ��������ظ�����������ѭ��,ִ���´�ѭ����
			}
			i++;
		}
		return array; // ���ش��м�������ά����
	}

}
