package Calculations;

public class SetValue { // ���ò������Ե�ֵ
	private int QUSETION_NUMBER = 50; // ��ʽ����
	private int Columns = 5; // ��ʽ���ã�һ�ж�����ʽ��

	public void setNumber(int number) { // ������ʽ����
		QUSETION_NUMBER = number;
	}

	public int getNumber() { // ��ȡ��ʽ����
		return QUSETION_NUMBER;
	}

	public void setColumns(int number) { // ������ʽ
		Columns = number;
	}

	public int getColumns() { // ��ȡ��ʽ
		return Columns;
	}
}
