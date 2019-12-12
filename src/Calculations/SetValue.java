package Calculations;

public class SetValue { // 设置操作属性的值
	private int QUSETION_NUMBER = 50; // 算式数量
	private int Columns = 5; // 样式设置（一行多少算式）

	public void setNumber(int number) { // 设置算式数量
		QUSETION_NUMBER = number;
	}

	public int getNumber() { // 获取算式数量
		return QUSETION_NUMBER;
	}

	public void setColumns(int number) { // 设置样式
		Columns = number;
	}

	public int getColumns() { // 获取样式
		return Columns;
	}
}
