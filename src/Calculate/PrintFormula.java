package Calculate;

public class PrintFormula {
	public static void printFormula(int[][] array) { // �����ʽ
		int i;
		char c;
		System.out.println("-----�������" + array[0].length + "��100���ڵļӼ�������Ŀ�����-----");
		for (i = 0; i < array[0].length; i++) { // ѭ�������ʽ
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
}
