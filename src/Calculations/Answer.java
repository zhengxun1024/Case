package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvWriter;

public class Answer { // 生成含有答案的批改文件
	static ArrayList<BinaryOperation> list; // 用于存放传递的对象列表

	public void answer(String path) { // 写入批改文件
		SetValue setValue = new SetValue();
		int columns = setValue.getColumns(); // 获得算式存放样式列数
		int t = 0; // 用于遍历对象列表
		int row = (int) Math.ceil(list.size() / columns); // 获得算式存放行数（取上限）
		String[][] str = new String[row][columns]; // 定义暂存字符串数组
		try {
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // 设置文件样式
			for (int i = 0; i < row; i++) { // 双层嵌套循环便利数组和列表赋值
				for (int j = 0; j < columns; j++) {
					String answer = String.valueOf(list.get(t++).getValue()); // 将整形转化成字符串型
					str[i][j] = answer;// 将对象列表所代表的算式按格式赋值给暂存数组
				}
				csvWriter.writeRecord(str[i]); // 写入文件
			}
			csvWriter.close(); // 关闭IO流
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
	}

	public void getOperationList(ArrayList<BinaryOperation> operationList) { // 接受生成算式的对象列表
		list = operationList;
	}
}
