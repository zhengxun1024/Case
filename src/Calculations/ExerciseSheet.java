package Calculations;

public class ExerciseSheet { // ϰ�⼯ϵͳ�࣬����������ֵ��������Ӧ����Ŀ
	public static void main(String[] args) {
		Exercise exadd = new Exercise(); // ϰ����ʵ����
		Exercise exsub = new Exercise();
		Exercise exb = new Exercise();
		FormateAndDisplay es = new FormateAndDisplay();
		// ����ʽ���50���ӷ���Ŀ�����������á�
		System.out.println("----------------50���ӷ�����������----------------");
		exadd.generateAdditionExercise(50);
		es.formateAndDisplay(exadd, 5);
		// ����ʽ���50��������Ŀ�����������á�
		System.out.println("----------------50����������������----------------");
		exsub.generateSubstractExercise(50);
		es.formateAndDisplay(exsub, 5);
		// ����ʽ���50���Ӽ�����Ŀ�����������á�
		System.out.println("----------------50���Ӽ�������������----------------");
		exb.generateBinaryExercise(50);
		es.formateAndDisplay(exb, 5);
	}
}
