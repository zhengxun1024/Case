package Calculations;

public class WriteMixCSV extends CSVWrite { // �Ӽ��������ʽд���������
	public void writeAddCSV(String path) { // ����д���������
		createWrite(path); // �Ӽ��������ʽд��
	}

	public void mixAnswer(String path) { // ����д���������
		answer(path); // ������ʽд��
	}

	@Override
	public void generateExercise() { // ��д�Ӽ��������ʽ����
		exercise.generateBinaryExercise(setValue.getNumber());
	}
}
