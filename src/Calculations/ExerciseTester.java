package Calculations;

public class ExerciseTester {
	public static void main(String[] args) {
		Exercise exer = new Exercise();
		// ����ʽ���50���ӷ���Ŀ
		System.out.println("--------50���ӷ�����������--------");
		exer.generateAdditionExercise();
		exer.formateAndDisplay();
		// ����ʽ���50��������Ŀ
		System.out.println("--------50����������������--------");
		exer.generatesubstractExercise();
		exer.formateAndDisplay();
		// ����ʽ���50���Ӽ�����Ŀ
		System.out.println("--------50���Ӽ�������������--------");
		exer.generateBinaryExercise();
		exer.formateAndDisplay();
	}
}
