package Calculate;

public class Calculate { // �������50��������100�ļӼ�����Ŀ
	public static void main(String[] args) { // ������
		int questionNumber = 50; // ��ʼ����Ŀ����
		int[][] totalArray = new int[4][questionNumber]; // �����ά����,������1,�Ӽ���,��2,�������ĸ�һά���顣
		ScanfDate  sd=new ScanfDate();
		totalArray = sd.scanfDate(totalArray); // ����scanfDate���������������ֵ������𰸣����ض�ά���顣
		PrintFormula pf=new PrintFormula();
		pf.printFormula(totalArray);// ����printFormula����������ʽ
		PrintAnswers pa=new PrintAnswers();
		pa.printAnswers(totalArray[3]); // ����printAnswer��������𰸡�
	}
}
