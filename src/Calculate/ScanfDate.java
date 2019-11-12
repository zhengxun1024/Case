package Calculate;

import java.util.Random;

public class ScanfDate {
	public static int[][] scanfDate(int[][] array) { // 生成随机数进行判定赋值并计算结果。
		Random random = new Random();
		int i = 0;
		CheakRepeat cr=new CheakRepeat();
		while (i < array[0].length) {// 生成随机数并对二维数组赋值，直到50题
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
			if (cr.cheakRepeat(array[0]) && cr.cheakRepeat(array[1]) && cr.cheakRepeat(array[2])) { // 判断这一组随机数是否与之前重复。
				continue; // 这一组随机数重复则跳过本次循环,执行下次循环。
			}
			i++;
		}
		return array; // 返回带有计算结果二维数组
	}

}
