package Calculations;

public class CSVNumber { // ���ݴ��ݵĲ��������ļ���д��
	static int count = 0; // ��¼�����ļ�����

	public void createAddCSV(int number) { // �ӷ���ʽ��д��
		int i;
		for (i = 0; i < number; i++) { // ���ɼӷ�ϰ���ļ�������
			String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_add_50_" + count + ".csv";
			WriteAddCSV wa = new WriteAddCSV(); // ���üӷ�ϰ��д�������
			wa.createWrite(path);
			String pathJudge = "D:\\CSV�ļ�\\���ļ�\\answer_ae_50_" + count + ".csv";
			Answer answer = new Answer(); // ������������д��ļ�������
			answer.answer(pathJudge);
			count++;
		}
		System.out.println("--------------" + i + "�׼ӷ�ϰ������ɴ�������--------------");
	}

	public void createSubCSV(int number) {// ������ʽ��д��
		int i;
		for (i = 0; i < number; i++) { // ���ɼ���ϰ���ļ�������
			String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_sub_50_" + count + ".csv";
			WriteSubCSV wa = new WriteSubCSV(); // ���ü���ϰ��д�������
			wa.createWrite(path);
			String pathJudge = "D:\\CSV�ļ�\\���ļ�\\answer_se_50_" + count + ".csv";
			Answer answer = new Answer(); // ������������д��ļ�������
			answer.answer(pathJudge);
			count++;
		}
		System.out.println("--------------" + i + "�׼���ϰ������ɴ�������--------------");
	}

	public void createMixCSV(int number) {// �Ӽ��������ʽ��д��
		int i;
		for (i = 0; i < number; i++) { // ���ɼӼ������ϰ���ļ�������
			String path = "D:\\CSV�ļ�\\ϰ���ļ�\\exercise_mix_50_" + count + ".csv";
			WriteMixCSV wa = new WriteMixCSV(); // ���üӼ������ϰ��д�������
			wa.createWrite(path);
			String pathJudge = "D:\\CSV�ļ�\\���ļ�\\answer_me_50_" + count + ".csv";
			Answer answer = new Answer(); // ������������д��ļ�������
			answer.answer(pathJudge);
			count++;
		}
		System.out.println("--------------" + i + "�׼Ӽ������ϰ������ɴ�������--------------");
	}
}
