package Calculations;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Practice { // 生成练习文件，存放用户答案
	Scanner in = new Scanner(System.in);
	SetValue setValue = new SetValue(); // 获得生成题目数量对象
	private int rowCount = 0;
	private int colCount = 0;
	int row = (int) Math.ceil(setValue.getNumber() / setValue.getColumns());// 行数
	int col = setValue.getColumns(); // 列数
	String[][] str = new String[row][col];
	{
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = "0";
			}
		}
	}

	public void judge(String path) {
		File file = new File(path);
		if (file.exists()) {
			readPractice(path);
			practice(path);
		} else {
			practice(path);
		}
	}

	public void readPractice(String path) {
		ArrayList<String[]> listFile = new ArrayList<String[]>();
		int i = 0, j = 0;
		try { // cvs文件读取
			CsvReader reader = new CsvReader(path, ',', Charset.forName("gb2312")); // 链接文件
			while (reader.readRecord()) { // 获取算式字符串
				listFile.add(reader.getValues());
			}
			reader.close(); // 关闭文件流
			if (!listFile.get(row - 1)[col - 1].equals("0")) {
				practice(path);
				System.exit(0);
			}
			outterLoop1: for (i = 0; i < listFile.size(); i++) { // 依次输出算式
				for (j = 0; j < listFile.get(i).length; j++) {
					String cell = listFile.get(i)[j];
					if (cell.equals("0")) {
						this.rowCount = i;
						this.colCount = j;
						break outterLoop1;
					}
					str[i][j] = cell;
					System.out.print(cell + " ");
				}
				System.out.println();
			}
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
	}

	public void practice(String path) { // 将答案写入path文件
		try { // 写入文件
			CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("gb2312")); // 设置文件样式
			outterLoop: for (int i = rowCount; i < row; i++) { // 循环赋值、写入
				for (int j = colCount; j < col; j++) {
					String scan = in.next();
					if (scan.equals("end")) {
						break outterLoop;
					}
					str[i][j] = scan; // 将输入答案存入字符串数组
				}
			}
			for (int i = 0; i < row; i++) {
				csvWriter.writeRecord(str[i]); // 将数组写入文件
			}
			csvWriter.close(); // 关闭IO流
			System.out.println("-----------作业完成！-----------");
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
	}
}
