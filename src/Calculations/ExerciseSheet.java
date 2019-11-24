package Calculations;

public class ExerciseSheet { // 习题集系统类，用于设置数值和生成相应的题目
	public static void main(String[] args) {
		Exercise ex = new Exercise(); // 习题类实例化
		// 按格式输出50道加法题目，题数可设置。
		System.out.println("----------------50道加法运算题如下----------------");
		ex.generateAdditionExercise(50);
		ex.formateAndDisplay(5);
		// 按格式输出50道减法题目，题数可设置。
		System.out.println("----------------50道减法运算题如下----------------");
		ex.generateSubstractExercise(50);
		ex.formateAndDisplay(5);
		// 按格式输出50道加减法题目，题数可设置。
		System.out.println("----------------50道加减法运算题如下----------------");
		ex.generateBinaryExercise(50);
		ex.formateAndDisplay(5);
	}
}
