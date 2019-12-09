package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

import com.csvreader.CsvWriter;

public class Practice { // 生成练习文件，存放用户答案
	public void practice(String path) { // 将答案写入path文件
		SetValue sv = new SetValue(); // 数值类实例化
		Scanner in = new Scanner(System.in);
		int row = sv.getAddNumber() / sv.getColumns(); // 行数
		int col = sv.getColumns(); // 列数
		String[][] str = new String[row][col];
		try { // 写入文件
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // 设置文件样式
			for (int i = 0; i < row; i++) { // 循环赋值、写入
				for (int j = 0; j < col; j++) {
					int scan = in.nextInt();
					str[i][j] = String.valueOf(scan); // 将输入答案存入字符串数组
				}
				csvWriter.writeRecord(str[i]); // 将数组写入文件
			}
			csvWriter.close(); // 关闭IO流
			System.out.println("作业完成！");
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
	}
}
