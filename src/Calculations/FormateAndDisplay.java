package Calculations;

public class FormateAndDisplay {
	public void formateAndDisplay(Exercise ex, int columns) {
		BinaryOperation value;
		int i = 0;
		int[] array = new int[50];
		while (ex.hasNext()) { // ѭ������б��еĶ��󲢵���asString��������ַ�����
			value = ex.next(); // ���BinaryOperation����
			System.out.print((i + 1) + "�� " + value.asString() + "\t");
			if ((i + 1) % columns == 0) { // ���ݲ����趨�����ʽ
				System.out.print("\n");
			}
			array[i] = value.getValue();
			i++;
		}
		System.out.println("----------------������----------------");
		for (i = 0; i < 50; i++) { // ������
			System.out.print((i + 1) + "�� " + array[i] + "\t" + "\t");
			if ((i + 1) % columns == 0) { // ���ݲ����趨�����ʽ
				System.out.print("\n");
			}
		}
	}
}