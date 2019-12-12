package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvWriter;

public class CSVWrite { // 创建写入文件，父类
	SetValue setValue = new SetValue(); // 获得生成题目数量对象
	Exercise exercise = new Exercise(); // 题目类实例化

	public void createWrite(String path) { // 生成算式并写入csv文件
		ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();
		try { // 写入文件，进行异常处理
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // 设置文件样式
			generateExercise(); // 调用生成算式函数
			operationList = exercise.getList(); // 调用方法获得对象列表
			int columns = setValue.getColumns(); // 列数
			int row = (int) Math.ceil(operationList.size() / columns); // 行数，取上限
			int count = 0; // 用于遍历对象列表
			String[][] str = new String[row][columns]; // 定义暂存字符串数组
			for (int i = 0; i < row; i++) { // 双层嵌套循环便利数组和列表赋值
				for (int j = 0; j < columns; j++) {
					str[i][j] = operationList.get(count++).asString(); // 将对象列表所代表的算式按格式赋值给暂存数组
				}
				csvWriter.writeRecord(str[i]); // 将字符串数组写入文件
			}
			csvWriter.close(); // 关闭IO流
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
	}

	public void generateExercise() { // 生成算式方法
	};

	public void answer(String path) { // 写入批改文件
		ArrayList<BinaryOperation> list = exercise.getList();
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
}
