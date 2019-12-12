package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvWriter;

public class CSVWrite { // ����д���ļ�������
	SetValue setValue = new SetValue(); // ���������Ŀ��������
	Exercise exercise = new Exercise(); // ��Ŀ��ʵ����

	public void createWrite(String path) { // ������ʽ��д��csv�ļ�
		ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();
		try { // д���ļ��������쳣����
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // �����ļ���ʽ
			generateExercise(); // ����������ʽ����
			operationList = exercise.getList(); // ���÷�����ö����б�
			int columns = setValue.getColumns(); // ����
			int row = (int) Math.ceil(operationList.size() / columns); // ������ȡ����
			int count = 0; // ���ڱ��������б�
			String[][] str = new String[row][columns]; // �����ݴ��ַ�������
			for (int i = 0; i < row; i++) { // ˫��Ƕ��ѭ������������б�ֵ
				for (int j = 0; j < columns; j++) {
					str[i][j] = operationList.get(count++).asString(); // �������б����������ʽ����ʽ��ֵ���ݴ�����
				}
				csvWriter.writeRecord(str[i]); // ���ַ�������д���ļ�
			}
			csvWriter.close(); // �ر�IO��
		} catch (IOException io) { // �쳣����
			io.printStackTrace();
		}
	}

	public void generateExercise() { // ������ʽ����
	};

	public void answer(String path) { // д�������ļ�
		ArrayList<BinaryOperation> list = exercise.getList();
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
}
