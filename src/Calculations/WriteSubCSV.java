package Calculations;

public class WriteSubCSV extends CreateCSVWrite { // ������ʽд���������
	public void writeAddCSV(String path) { // ����д���������
		createWrite(path); // ������ʽд��
	}

	@Override
	public void generateExercise() { // ��д������ʽ����
		exercise.generateSubstractExercise(setValue.getSubNumber());
	}
}
