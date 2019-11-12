package Calculate;

public class PrintAnswers {
	public static void printAnswers(int[] array) { // 输出题目答案。
		int i;
		System.out.println("-----下面是习题的答案-----");
		for (i = 0; i < array.length; i++) {// 循环输出结果
			System.out.print((i + 1) + ":" + array[i] + "\t\t");
			if ((i + 1) % 5 == 0) { // 每输出5个答案换行。
				System.out.print("\n");
			}
		}
	}
}
