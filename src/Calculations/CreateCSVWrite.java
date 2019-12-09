package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvWriter;

public class CreateCSVWrite { // 创建写入文件，父类
	SetValue setValue = new SetValue(); // 获得生成题目数量对象
	Exercise exercise = new Exercise(); // 题目类实例化
	Answer answer = new Answer();

	public void createWrite(String path) { // 生成算式并写入csv文件
		ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();
		try { // 写入文件，进行异常处理
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // 设置文件样式
			generateExercise(); // 调用生成算式函数
			operationList = exercise.getList(); // 调用方法获得对象列表
			answer.getOperationList(exercise.getList()); // 调用生成答案类
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

}
