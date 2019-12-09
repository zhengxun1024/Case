package Calculations;

public class SetValue { // 设置操作属性的值
	private int addQUSETION_NUMBER = 50; // 加法算式数量
	private int subQUSETION_NUMBER = 50; // 减法算式的数量
	private int mixQUSETION_NUMBER = 50; // 加减法混合算式的数量
	private int Columns = 5; // 样式设置（一行多少算式）

	public void setAddNumber(int number) { // 设置加法算式数量
		addQUSETION_NUMBER = number;
	}

	public int getAddNumber() { // 获取加法算式数量
		return addQUSETION_NUMBER;
	}

	public void setSubNumber(int number) { // 设置减法算式数量
		subQUSETION_NUMBER = number;
	}

	public int getSubNumber() { // 获取减法算式数量
		return subQUSETION_NUMBER;
	}

	public void setMixNumber(int number) { // 设置加减法混合算式数量
		mixQUSETION_NUMBER = number;
	}

	public int getMixNumber() { // 获取加减法混合算式数量
		return mixQUSETION_NUMBER;
	}

	public void setColumns(int number) { // 设置样式
		Columns = number;
	}

	public int getColumns() { // 获取样式
		return Columns;
	}
}
