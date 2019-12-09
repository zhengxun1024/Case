package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

import com.csvreader.CsvWriter;

public class Practice { // ������ϰ�ļ�������û���
	public void practice(String path) { // ����д��path�ļ�
		SetValue sv = new SetValue(); // ��ֵ��ʵ����
		Scanner in = new Scanner(System.in);
		int row = sv.getAddNumber() / sv.getColumns(); // ����
		int col = sv.getColumns(); // ����
		String[][] str = new String[row][col];
		try { // д���ļ�
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // �����ļ���ʽ
			for (int i = 0; i < row; i++) { // ѭ����ֵ��д��
				for (int j = 0; j < col; j++) {
					int scan = in.nextInt();
					str[i][j] = String.valueOf(scan); // ������𰸴����ַ�������
				}
				csvWriter.writeRecord(str[i]); // ������д���ļ�
			}
			csvWriter.close(); // �ر�IO��
			System.out.println("��ҵ��ɣ�");
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
	}
}
