package Calculations;

public class SetValue { // ���ò������Ե�ֵ
	private int addQUSETION_NUMBER = 50; // �ӷ���ʽ����
	private int subQUSETION_NUMBER = 50; // ������ʽ������
	private int mixQUSETION_NUMBER = 50; // �Ӽ��������ʽ������
	private int Columns = 5; // ��ʽ���ã�һ�ж�����ʽ��

	public void setAddNumber(int number) { // ���üӷ���ʽ����
		addQUSETION_NUMBER = number;
	}

	public int getAddNumber() { // ��ȡ�ӷ���ʽ����
		return addQUSETION_NUMBER;
	}

	public void setSubNumber(int number) { // ���ü�����ʽ����
		subQUSETION_NUMBER = number;
	}

	public int getSubNumber() { // ��ȡ������ʽ����
		return subQUSETION_NUMBER;
	}

	public void setMixNumber(int number) { // ���üӼ��������ʽ����
		mixQUSETION_NUMBER = number;
	}

	public int getMixNumber() { // ��ȡ�Ӽ��������ʽ����
		return mixQUSETION_NUMBER;
	}

	public void setColumns(int number) { // ������ʽ
		Columns = number;
	}

	public int getColumns() { // ��ȡ��ʽ
		return Columns;
	}
}
