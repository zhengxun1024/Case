package Calculate;

import java.util.Random;

public class calculate {
	public static int[][] scanf(int[][] n) {	//��������������ж���ֵ��
		Random random = new Random();		//�������������ʵ������
		int i = 0, j;
		while (i < 50) {		//0~50ѭ��
			int q = 0;			//��Ǳ���
			n[0][i] = random.nextInt(101);	//����һ����������Զ�ά���鸳ֵ��
			n[1][i] = random.nextInt(2);	//���������0��1��0������ţ�1����Ӻš�
			n[2][i] = random.nextInt(101);
			for (j = 0; j < i; j++) {		//�������鲢��֮ǰ����������бȽ�
				if ((n[0][i] == n[0][j] && n[2][i] == n[2][j] && n[1][i] == n[1][j])	
						|| (n[0][i] == n[2][j] && n[2][i] == n[0][j] && n[1][i] == n[1][j])) {	//�ж���һ��������Ƿ���֮ǰ�ظ�,�ظ�������forѭ����
					q = 1;
					break;
				}
			}	
			if (q == 1) {		//��һ��������ظ�����������ѭ��,ִ���´�ѭ����
				continue;
			}
			if (n[1][i] == 1) {		//�ж�ÿһ����������Ӧ�ļӼ��Ų����м��㡣
				n[3][i] = n[0][i] + n[2][i];
			} else {
				n[3][i] = n[0][i] - n[2][i];
			}
			if (( n[3][i]> 100) || (n[3][i] <= 0)) {	//�����ظ��ж���һ��������Ƿ񳬳���Χ
				continue;
			}
			i++;		
		}
		return n;		//���ش��м�������ά����
	}

	public static int[][] print(int[][] n) {	//�����Ŀ��������
		int i;
		char c;
		System.out.println("-----�������50��100���ڵļӼ�������Ŀ�����-----");
		for (i = 0; i < 50; i++) {		//ѭ�������Ŀ
			if (n[1][i] == 1) {		//�ж�ÿһ����������Ӧ�ļӼ��š�
				c = '+';
			} else {
				c = '-';
			}
			System.out.print("��" + (i + 1) + "�⣺"+"\t" + n[0][i] + c + n[2][i] + "=" + "\t\t");	//�����Ŀ
			if ((i + 1) % 5 == 0) {		//ÿ���5����Ŀ����
				System.out.print("\n");
			}
		}
		return n;		//���صĶ�ά���顣

	}

	public static void calculations(int[] n) {	//�����Ŀ�𰸡�
		System.out.println("-----������ϰ��Ĵ�-----");
		for (int i = 0; i < 50; i++) {
			System.out.print((i + 1) + ":" + n[i] + "\t\t");
			if ((i + 1) % 5 == 0) {//ÿ���5���𰸻��С�
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) {	//������ 
		int[][] m = new int[4][50];		//�����ά����,������1,�Ӽ���,��2,�������ĸ�һά���顣
		m = scanf(m);		//����scanf���������������ֵ�����ض�ά���顣
		m = print(m);		//����print����������Ŀ�����ش��м������Ķ�λ���顣
		calculations(m[3]);	//����calculations��������𰸡�
	}
}
