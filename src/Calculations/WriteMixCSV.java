package Calculations;

public class WriteMixCSV extends CreateCSVWrite { // �Ӽ��������ʽд���������
	public void writeAddCSV(String path) { // ����д���������
		createWrite(path); // �Ӽ��������ʽд��
	}

	@Override
	public void generateExercise() { // ��д�Ӽ��������ʽ����
		exercise.generateBinaryExercise(setValue.getMixNumber());
	}
}
