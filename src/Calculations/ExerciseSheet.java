package Calculations;

public class ExerciseSheet { // ϰ�⼯ϵͳ�࣬����������ֵ��������Ӧ����Ŀ
	public static void main(String[] args) {
		Exercise ex = new Exercise(); // ϰ����ʵ����
		// ����ʽ���50���ӷ���Ŀ�����������á�
		System.out.println("----------------50���ӷ�����������----------------");
		ex.generateAdditionExercise(50);
		ex.formateAndDisplay(5);
		// ����ʽ���50��������Ŀ�����������á�
		System.out.println("----------------50����������������----------------");
		ex.generateSubstractExercise(50);
		ex.formateAndDisplay(5);
		// ����ʽ���50���Ӽ�����Ŀ�����������á�
		System.out.println("----------------50���Ӽ�������������----------------");
		ex.generateBinaryExercise(50);
		ex.formateAndDisplay(5);
	}
}
