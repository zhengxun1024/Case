package Calculate;

import java.util.*;

public class calculate {
	public static int Number = 50; // 定义全局变量，初始化题目数量

	public static boolean cheakIsRepeat(int[] array) { // 检查数组内有无重复数
		HashSet<Integer> hashSet = new HashSet<Integer>(); // 使用HashSet()进行判断
		for (int i = 0; i < array.length; i++) {
			hashSet.add(array[i]);
		}
		if (hashSet.size() == array.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] scanf(int[][] array) { // 生成随机数进行判定赋值并计算。
		Random random = new Random();
		int i = 0;
		while (i < Number) {
			array[0][i] = random.nextInt(101); // 生成一组随机数并对二维数组赋值。
			array[1][i] = random.nextInt(2); // 生成随机数0或1，0代表减号；1代表加号。
			array[2][i] = random.nextInt(101);
			if (array[1][i] == 1) { // 判断每一组数组所对应的加减号并进行计算。
				array[3][i] = array[0][i] + array[2][i];
			} else {
				array[3][i] = array[0][i] - array[2][i];
			}
			if ((array[3][i] > 100) || (array[3][i] <= 0)) { // 若不重复判断这一组随机数是否超出范围
				continue;
			}
			if (cheakIsRepeat(array[0]) && cheakIsRepeat(array[1]) && cheakIsRepeat(array[2])) { // 判断这一组随机数是否与之前重复,重复则跳出for循环。
				continue; // 这一组随机数重复则跳过本次循环,执行下次循环。
			}
			i++;
		}
		return array; // 返回带有计算结果二维数组
	}

	public static void print(int[][] array) { // 输出题目并计算结果
		int i;
		char c;
		System.out.println("-----程序输出" + Number + "道100以内的加减法运算的口算题-----");
		for (i = 0; i < Number; i++) { // 循环输出题目
			if (array[1][i] == 1) { // 判断每一组数组所对应的加减号。
				c = '+';
			} else {
				c = '-';
			}
			System.out.print("第" + (i + 1) + "题：" + array[0][i] + c + array[2][i] + "=" + "\t\t"); // 输出题目
			if ((i + 1) % 5 == 0) { // 每输出5道题目则换行
				System.out.print("\n");
			}
		}

	}

	public static void calculations(int[] array) { // 输出题目答案。
		System.out.println("-----下面是习题的答案-----");
		for (int i = 0; i < Number; i++) {
			System.out.print((i + 1) + ":" + array[i] + "\t\t");
			if ((i + 1) % 5 == 0) {// 每输出5个答案换行。
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) { // 主函数
		int[][] total_array = new int[4][Number]; // 定义二维数组,包含数1,加减号,数2,计算结果四个一维数组。
		total_array = scanf(total_array); // 调用scanf函数进行随机数赋值，返回二维数组。
		print(total_array); // 调用print函数生成题目
		calculations(total_array[3]); // 调用calculations函数输出答案。
	}
}
