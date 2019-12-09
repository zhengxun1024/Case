package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvWriter;

public class Answer { // ���ɺ��д𰸵������ļ�
	static ArrayList<BinaryOperation> list; // ���ڴ�Ŵ��ݵĶ����б�

	public void answer(String path) { // д�������ļ�
		SetValue setValue = new SetValue();
		int columns = setValue.getColumns(); // �����ʽ�����ʽ����
		int t = 0; // ���ڱ��������б�
		int row = (int) Math.ceil(list.size() / columns); // �����ʽ���������ȡ���ޣ�
		String[][] str = new String[row][columns]; // �����ݴ��ַ�������
		try {
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // �����ļ���ʽ
			for (int i = 0; i < row; i++) { // ˫��Ƕ��ѭ������������б�ֵ
				for (int j = 0; j < columns; j++) {
					String answer = String.valueOf(list.get(t++).getValue()); // ������ת�����ַ�����
					str[i][j] = answer;// �������б����������ʽ����ʽ��ֵ���ݴ�����
				}
				csvWriter.writeRecord(str[i]); // д���ļ�
			}
			csvWriter.close(); // �ر�IO��
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
	}

	public void getOperationList(ArrayList<BinaryOperation> operationList) { // ����������ʽ�Ķ����б�
		list = operationList;
	}
}
