package Calculations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class JudgementDisplay { // 按样式输出批改成绩
	public void judgeDisplay(String path) {
		ArrayList<String[]> list = new ArrayList<String[]>();
		int correct = 0; // 定义正确数量
		int wrong = 0; // 定义错误数量
		try {
			CsvReader reader = new CsvReader(path, ',', Charset.forName("gb2312")); // 链接文件，设置样式
			while (reader.readRecord()) { // 读取文件
				list.add(reader.getValues());
			}
			reader.close(); // 关闭文件流
			for (int row = 0; row < list.size(); row++) { // 依次输出算式
				for (int col = 0; col < list.get(row).length; col++) {
					if (list.get(row)[col].equals("true")) {
						correct++;
					} else {
						wrong++;
					}
				}
			}
		} catch (IOException io) { // 异常处理
			io.printStackTrace();
		}
		System.out.println("答案：" + path);
		System.out.println("算式总数：" + (correct + wrong));
		System.out.println("正确：" + correct);
		System.out.println("错误：" + wrong);
		System.out.println("得分：" + (100 * correct / (correct + wrong)));
	}
}
