package Calculations;

public class WriteAddCSV extends CSVWrite { // �ӷ���ʽд���������
	public void writeAddCSV(String path) { // ����д���������
		createWrite(path); // �ӷ���ʽд��
	}

	public void addAnswer(String path) { // ����д���������
		answer(path); // ������ʽд��
	}

	@Override
	public void generateExercise() { // ��д�ӷ�������ʽ����
		exercise.generateAdditionExercise(setValue.getNumber());
	}
}
