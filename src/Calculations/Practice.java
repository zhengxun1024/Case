package Calculations;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Practice { // ������ϰ�ļ�������û���
	Scanner in = new Scanner(System.in);
	SetValue setValue = new SetValue(); // ���������Ŀ��������
	private int rowCount = 0;
	private int colCount = 0;
	int row = (int) Math.ceil(setValue.getNumber() / setValue.getColumns());// ����
	int col = setValue.getColumns(); // ����
	String[][] str = new String[row][col];
	{
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = "0";
			}
		}
	}

	public void judge(String path) {
		File file = new File(path);
		if (file.exists()) {
			readPractice(path);
			practice(path);
		} else {
			practice(path);
		}
	}

	public void readPractice(String path) {
		ArrayList<String[]> listFile = new ArrayList<String[]>();
		int i = 0, j = 0;
		try { // cvs�ļ���ȡ
			CsvReader reader = new CsvReader(path, ',', Charset.forName("gb2312")); // �����ļ�
			while (reader.readRecord()) { // ��ȡ��ʽ�ַ���
				listFile.add(reader.getValues());
			}
			reader.close(); // �ر��ļ���
			if (!listFile.get(row - 1)[col - 1].equals("0")) {
				practice(path);
				System.exit(0);
			}
			outterLoop1: for (i = 0; i < listFile.size(); i++) { // ���������ʽ
				for (j = 0; j < listFile.get(i).length; j++) {
					String cell = listFile.get(i)[j];
					if (cell.equals("0")) {
						this.rowCount = i;
						this.colCount = j;
						break outterLoop1;
					}
					str[i][j] = cell;
					System.out.print(cell + " ");
				}
				System.out.println();
			}
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
	}

	public void practice(String path) { // ����д��path�ļ�
		try { // д���ļ�
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // �����ļ���ʽ
			outterLoop: for (int i = rowCount; i < row; i++) { // ѭ����ֵ��д��
				for (int j = colCount; j < col; j++) {
					String scan = in.next();
					if (scan.equals("end")) {
						break outterLoop;
					}
					str[i][j] = scan; // ������𰸴����ַ�������
				}
			}
			for (int i = 0; i < row; i++) {
				csvWriter.writeRecord(str[i]); // ������д���ļ�
			}
			csvWriter.close(); // �ر�IO��
			System.out.println("-----------��ҵ��ɣ�-----------");
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
	}
}
