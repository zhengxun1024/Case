package Calculations;

public class ExerciseSheet { // 习题集系统类，用于设置数值和生成相应的题目
	public static void main(String[] args) {
		Exercise exadd = new Exercise(); // 习题类实例化
		Exercise exsub = new Exercise();
		Exercise exb = new Exercise();
		FormateAndDisplay es = new FormateAndDisplay();
		// 按格式输出50道加法题目，题数可设置。
		System.out.println("----------------50道加法运算题如下----------------");
		exadd.generateAdditionExercise(50);
		es.formateAndDisplay(exadd, 5);
		// 按格式输出50道减法题目，题数可设置。
		System.out.println("----------------50道减法运算题如下----------------");
		exsub.generateSubstractExercise(50);
		es.formateAndDisplay(exsub, 5);
		// 按格式输出50道加减法题目，题数可设置。
		System.out.println("----------------50道加减法运算题如下----------------");
		exb.generateBinaryExercise(50);
		es.formateAndDisplay(exb, 5);
	}
}
