package Calculate;

public class PrintFormula {
	public static void printFormula(int[][] array) { // 输出算式
		int i;
		char c;
		System.out.println("-----程序输出" + array[0].length + "道100以内的加减法运算的口算题-----");
		for (i = 0; i < array[0].length; i++) { // 循环输出算式
			if (array[1][i] == 1) { // 判断每一组数组所对应的加减号，0代表减号；1代表加号。
				c = '+';
			} else {
				c = '-';
			}
			System.out.print("第" + (i + 1) + "题：" + array[0][i] + c + array[2][i] + "=" + "\t\t"); // 输出题目
			if ((i + 1) % 5 == 0) { // 每输出5道算式则换行
				System.out.print("\n");
			}
		}

	}
}
