package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class JudgementDisplay { // ����ʽ������ĳɼ�
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
