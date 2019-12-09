package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import com.csvreader.CsvReader;

public class CSVRead { // 文件的读取操作
	public void readCSVExercise(String pathCSVRead) {
		ArrayList<String[]> listFile = new ArrayList<String[]>();
		int t = 1, count = 0, i = 0;
		try { // cvs文件读取
			CsvReader reader = new CsvReader(pathCSVRead, ',', Charset.forName("gb2312")); // 链接文件
			while (reader.readRecord()) { // 获取算式字符串
				listFile.add(reader.getValues());
				count = count + listFile.get(i).length;
				i++;
			}
			reader.close(); // 关闭文件流
			System.out.println("本次作业共有" + count + "道习题！");
			for (int row = 0; row < listFile.size(); row++) { // 依次输出算式
				for (int col = 0; col < listFile.get(row).length; col++) {
					String cell = listFile.get(row)[col];
					System.out.print((t++) + "、" + cell + "\t");
				}
				System.out.println();
			}
			System.out.println("请规范作答（答案之间添加空格，输入格式与习题一致）：");
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
	}
}