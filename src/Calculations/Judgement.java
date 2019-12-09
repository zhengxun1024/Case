package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Judgement { // 答案文件和练习文件进行对比，将对比结果写入批改文件
	public void judgement(String pathAnswer, String pathPractice, String pathJudgement) {
		SetValue setValue = new SetValue(); // 获得算式存放样式
		int columns = setValue.getColumns();
		ArrayList<String[]> listAnswer = new ArrayList<String[]>(); // 存放正确答案
		ArrayList<String[]> listPractice = new ArrayList<String[]>(); // 存放用户答案

		try { // 读取答案文件、练习文件，写入批改作业
			CsvWriter writeJudgement = new CsvWriter(pathJudgement, ',', Charset.forName("gb2312")); // 链接文件
			CsvReader readAnswer = new CsvReader(pathAnswer, ',', Charset.forName("gb2312")); // 链接文件
			while (readAnswer.readRecord()) { // 读取答案文件
				listAnswer.add(readAnswer.getValues());
			}
			readAnswer.close(); // 关闭文件流
			CsvReader readPractice = new CsvReader(pathPractice, ',', Charset.forName("gb2312")); // 链接文件
			while (readPractice.readRecord()) { // 读取练习文件
				listPractice.add(readPractice.getValues());
			}
			readPractice.close(); // 关闭文件流
			String[][] str = new String[listAnswer.size()][columns];
			for (int row = 0; row < listAnswer.size(); row++) { // 依次对比，将结果写入批改文件
				for (int col = 0; col < listAnswer.get(row).length; col++) {
					String answer = listAnswer.get(row)[col];
					String practice = listPractice.get(row)[col];
					if (answer.equals(practice)) { // 若相等写入true
						str[row][col] = "true";
					} else { // 不等则写入false
						str[row][col] = "false";
					}
				}
				writeJudgement.writeRecord(str[row]); // 写入批改文件
			}
			writeJudgement.close(); // 关闭IO流
			System.out.println("-----------批改完成" + "-----------");
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
	}
}
