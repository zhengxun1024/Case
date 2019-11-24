package Calculations;

public class ExerciseTester {
	public static void main(String[] args) {
		Exercise exer = new Exercise();
		// 按格式输出50道加法题目
		System.out.println("--------50道加法运算题如下--------");
		exer.generateAdditionExercise();
		exer.formateAndDisplay();
		// 按格式输出50道减法题目
		System.out.println("--------50道减法运算题如下--------");
		exer.generatesubstractExercise();
		exer.formateAndDisplay();
		// 按格式输出50道加减法题目
		System.out.println("--------50道加减法运算题如下--------");
		exer.generateBinaryExercise();
		exer.formateAndDisplay();
	}
}
