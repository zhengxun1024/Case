package Calculate;

public class PrintAnswers {
	public static void printAnswers(int[] array) { // �����Ŀ�𰸡�
		int i;
		System.out.println("-----������ϰ��Ĵ�-----");
		for (i = 0; i < array.length; i++) {// ѭ��������
			System.out.print((i + 1) + ":" + array[i] + "\t\t");
			if ((i + 1) % 5 == 0) { // ÿ���5���𰸻��С�
				System.out.print("\n");
			}
		}
	}
}
