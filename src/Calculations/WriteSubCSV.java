package Calculations;

public class WriteSubCSV extends CSVWrite { // ������ʽд���������
	public void writeAddCSV(String path) { // ����д���������
		createWrite(path); // ������ʽд��
	}
	
	public void subAnswer(String path) { // ����д���������
		answer(path); // ������ʽд��
	}
	
	@Override
	public void generateExercise() { // ��д������ʽ����
		exercise.generateSubstractExercise(setValue.getNumber());
	}
}
