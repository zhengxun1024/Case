package Calculations;

public class WriteAddCSV extends CreateCSVWrite { // �ӷ���ʽд���������
	public void writeAddCSV(String path) { // ����д���������
		createWrite(path); // �ӷ���ʽд��
	}

	@Override
	public void generateExercise() { // ��д�ӷ�������ʽ����
		exercise.generateAdditionExercise(setValue.getAddNumber());
	}
}
