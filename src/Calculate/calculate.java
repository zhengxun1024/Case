package Calculate;

import java.util.Random;

public class calculate {
	public static int[][] scanf(int[][] n) {	//生成随机数进行判定赋值。
		Random random = new Random();		//生成随机数对象实例化。
		int i = 0, j;
		while (i < 50) {		//0~50循环
			int q = 0;			//标记变量
			n[0][i] = random.nextInt(101);	//生成一组随机数并对二维数组赋值。
			n[1][i] = random.nextInt(2);	//生成随机数0或1，0代表减号；1代表加号。
			n[2][i] = random.nextInt(101);
			for (j = 0; j < i; j++) {		//遍历数组并与之前的随机数进行比较
				if ((n[0][i] == n[0][j] && n[2][i] == n[2][j] && n[1][i] == n[1][j])	
						|| (n[0][i] == n[2][j] && n[2][i] == n[0][j] && n[1][i] == n[1][j])) {	//判断这一组随机数是否与之前重复,重复则跳出for循环。
					q = 1;
					break;
				}
			}	
			if (q == 1) {		//这一组随机数重复则跳过本次循环,执行下次循环。
				continue;
			}
			if (n[1][i] == 1) {		//判断每一组数组所对应的加减号并进行计算。
				n[3][i] = n[0][i] + n[2][i];
			} else {
				n[3][i] = n[0][i] - n[2][i];
			}
			if (( n[3][i]> 100) || (n[3][i] <= 0)) {	//若不重复判断这一组随机数是否超出范围
				continue;
			}
			i++;		
		}
		return n;		//返回带有计算结果二维数组
	}

	public static int[][] print(int[][] n) {	//输出题目并计算结果
		int i;
		char c;
		System.out.println("-----程序输出50道100以内的加减法运算的口算题-----");
		for (i = 0; i < 50; i++) {		//循环输出题目
			if (n[1][i] == 1) {		//判断每一组数组所对应的加减号。
				c = '+';
			} else {
				c = '-';
			}
			System.out.print("第" + (i + 1) + "题："+"\t" + n[0][i] + c + n[2][i] + "=" + "\t\t");	//输出题目
			if ((i + 1) % 5 == 0) {		//每输出5道题目则换行
				System.out.print("\n");
			}
		}
		return n;		//返回的二维数组。

	}

	public static void calculations(int[] n) {	//输出题目答案。
		System.out.println("-----下面是习题的答案-----");
		for (int i = 0; i < 50; i++) {
			System.out.print((i + 1) + ":" + n[i] + "\t\t");
			if ((i + 1) % 5 == 0) {//每输出5个答案换行。
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) {	//主函数 
		int[][] m = new int[4][50];		//定义二维数组,包含数1,加减号,数2,计算结果四个一维数组。
		m = scanf(m);		//调用scanf函数进行随机数赋值，返回二维数组。
		m = print(m);		//调用print函数生成题目，返回带有计算结果的二位数组。
		calculations(m[3]);	//调用calculations函数输出答案。
	}
}
