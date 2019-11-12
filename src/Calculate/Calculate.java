package Calculate;

public class Calculate { // 随机生成50道不大于100的加减法题目
	public static void main(String[] args) { // 主函数
		int questionNumber = 50; // 初始化题目数量
		int[][] totalArray = new int[4][questionNumber]; // 定义二维数组,包含数1,加减号,数2,计算结果四个一维数组。
		ScanfDate  sd=new ScanfDate();
		totalArray = sd.scanfDate(totalArray); // 调用scanfDate函数进行随机数赋值并计算答案，返回二维数组。
		PrintFormula pf=new PrintFormula();
		pf.printFormula(totalArray);// 调用printFormula函数生成算式
		PrintAnswers pa=new PrintAnswers();
		pa.printAnswers(totalArray[3]); // 调用printAnswer函数输出答案。
	}
}
