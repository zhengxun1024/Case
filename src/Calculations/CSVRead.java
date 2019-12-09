package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import com.csvreader.CsvReader;

public class CSVRead { // �ļ��Ķ�ȡ����
	public void readCSVExercise(String pathCSVRead) {
		ArrayList<String[]> listFile = new ArrayList<String[]>();
		int t = 1, count = 0, i = 0;
		try { // cvs�ļ���ȡ
			CsvReader reader = new CsvReader(pathCSVRead, ',', Charset.forName("gb2312")); // �����ļ�
			while (reader.readRecord()) { // ��ȡ��ʽ�ַ���
				listFile.add(reader.getValues());
				count = count + listFile.get(i).length;
				i++;
			}
			reader.close(); // �ر��ļ���
			System.out.println("������ҵ����" + count + "��ϰ�⣡");
			for (int row = 0; row < listFile.size(); row++) { // ���������ʽ
				for (int col = 0; col < listFile.get(row).length; col++) {
					String cell = listFile.get(row)[col];
					System.out.print((t++) + "��" + cell + "\t");
				}
				System.out.println();
			}
			System.out.println("��淶���𣨴�֮����ӿո������ʽ��ϰ��һ�£���");
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
	}
}