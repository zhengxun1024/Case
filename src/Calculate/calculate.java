package Calculate;

import java.util.*;

public class calculate { // 随机生成50道不大于100的加减法题目
	public static int questionNumber = 50; // 定义全局变量，初始化题目数量

	public static boolean cheakIsRepeat(int[] array) { // 检查数组内有无重复数
		HashSet<Integer> hashSet = new HashSet<Integer>(); // 使用HashSet()检查数据内有无重复数
		for (int i = 0; i < array.length; i++) {
			hashSet.add(array[i]);
		}
		if (hashSet.size() == array.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] scanfDate(int[][] array) { // 生成随机数进行判定赋值并计算结果。
		Random random = new Random();
		int i = 0;
		while (i < questionNumber) {// 生成随机数并对二维数组赋值，直到50题
			array[0][i] = random.nextInt(101);
			array[1][i] = random.nextInt(2); // 生成随机数0或1，0代表减号；1代表加号。
			array[2][i] = random.nextInt(101);
			if (array[1][i] == 1) { // 判断每一组数组所对应的加减号并进行计算。0代表减号；1代表加号。
				array[3][i] = array[0][i] + array[2][i];
			} else {
				array[3][i] = array[0][i] - array[2][i];
			}
			if ((array[3][i] > 100) || (array[3][i] <= 0)) { // 判断这一组的计算结果是否超出0~100的范围
				continue;
			}
			if (cheakIsRepeat(array[0]) && cheakIsRepeat(array[1]) && cheakIsRepeat(array[2])) { // 判断这一组随机数是否与之前重复。
				continue; // 这一组随机数重复则跳过本次循环,执行下次循环。
			}
			i++;
		}
		return array; // 返回带有计算结果二维数组
	}

	public static void printFormula(int[][] array) { // 输出算式
		int i;
		char c;
		System.out.println("-----程序输出" + questionNumber + "道100以内的加减法运算的口算题-----");
		for (i = 0; i < questionNumber; i++) { // 循环输出算式
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

	public static void printAnswer(int[] array) { // 输出题目答案。
		int i;
		System.out.println("-----下面是习题的答案-----");
		for (i = 0; i < questionNumber; i++) {// 循环输出结果
			System.out.print((i + 1) + ":" + array[i] + "\t\t");
			if ((i + 1) % 5 == 0) { // 每输出5个答案换行。
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) { // 主函数
		int[][] totalArray = new int[4][questionNumber]; // 定义二维数组,包含数1,加减号,数2,计算结果四个一维数组。
		totalArray = scanfDate(totalArray); // 调用scanfDate函数进行随机数赋值并计算答案，返回二维数组。
		printFormula(totalArray); // 调用printFormula函数生成算式
		printAnswer(totalArray[3]); // 调用printAnswer函数输出答案。
	}
}
