package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Judgement { // ���ļ�����ϰ�ļ����жԱȣ����ԱȽ��д�������ļ�
	public void judgement(String pathAnswer, String pathPractice, String pathJudgement) {
		SetValue setValue = new SetValue(); // �����ʽ�����ʽ
		int columns = setValue.getColumns();
		ArrayList<String[]> listAnswer = new ArrayList<String[]>(); // �����ȷ��
		ArrayList<String[]> listPractice = new ArrayList<String[]>(); // ����û���

		try { // ��ȡ���ļ�����ϰ�ļ���д��������ҵ
			CsvWriter writeJudgement = new CsvWriter(pathJudgement, ',', Charset.forName("gb2312")); // �����ļ�
			CsvReader readAnswer = new CsvReader(pathAnswer, ',', Charset.forName("gb2312")); // �����ļ�
			while (readAnswer.readRecord()) { // ��ȡ���ļ�
				listAnswer.add(readAnswer.getValues());
			}
			readAnswer.close(); // �ر��ļ���
			CsvReader readPractice = new CsvReader(pathPractice, ',', Charset.forName("gb2312")); // �����ļ�
			while (readPractice.readRecord()) { // ��ȡ��ϰ�ļ�
				listPractice.add(readPractice.getValues());
			}
			readPractice.close(); // �ر��ļ���
			String[][] str = new String[listAnswer.size()][columns];
			for (int row = 0; row < listAnswer.size(); row++) { // ���ζԱȣ������д�������ļ�
				for (int col = 0; col < listAnswer.get(row).length; col++) {
					String answer = listAnswer.get(row)[col];
					String practice = listPractice.get(row)[col];
					if (answer.equals(practice)) { // �����д��true
						str[row][col] = "true";
					} else { // ������д��false
						str[row][col] = "false";
					}
				}
				writeJudgement.writeRecord(str[row]); // д�������ļ�
			}
			writeJudgement.close(); // �ر�IO��
			System.out.println("-----------�������" + "-----------");
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
	}

	public void judgeDisplay(String path) {
		ArrayList<String[]> list = new ArrayList<String[]>();
		int correct = 0; // ������ȷ����
		int wrong = 0; // �����������
		try {
			CsvReader reader = new CsvReader(path, ',', Charset.forName("gb2312")); // �����ļ���������ʽ
			while (reader.readRecord()) { // ��ȡ�ļ�
				list.add(reader.getValues());
			}
			reader.close(); // �ر��ļ���
			for (int row = 0; row < list.size(); row++) { // ���������ʽ
				for (int col = 0; col < list.get(row).length; col++) {
					if (list.get(row)[col].equals("true")) {
						correct++;
					} else {
						wrong++;
					}
				}
			}
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
		System.out.println("�𰸣�" + path);
		System.out.println("��ʽ������" + (correct + wrong));
		System.out.println("��ȷ��" + correct);
		System.out.println("����" + wrong);
		System.out.println("�÷֣�" + (100 * correct / (correct + wrong)));
	}
}