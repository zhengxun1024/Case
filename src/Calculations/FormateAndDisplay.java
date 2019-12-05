package Calculations;

public class FormateAndDisplay {
	public void formateAndDisplay(Exercise ex, int columns) {
		BinaryOperation value;
		int i = 0;
		int[] array = new int[50];
		while (ex.hasNext()) { // 循环获得列表中的对象并调用asString函数输出字符串。
			value = ex.next(); // 获得BinaryOperation对象
			System.out.print((i + 1) + "、 " + value.asString() + "\t");
			if ((i + 1) % columns == 0) { // 根据参数设定输出格式
				System.out.print("\n");
			}
			array[i] = value.getValue();
			i++;
		}
		System.out.println("----------------答案如下----------------");
		for (i = 0; i < 50; i++) { // 输出结果
			System.out.print((i + 1) + "、 " + array[i] + "\t" + "\t");
			if ((i + 1) % columns == 0) { // 根据参数设定输出格式
				System.out.print("\n");
			}
		}
	}
}