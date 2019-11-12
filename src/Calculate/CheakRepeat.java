package Calculate;

import java.util.HashSet;

public class CheakRepeat {
	public static boolean cheakRepeat(int[] array) { // 检查数组内有无重复数
		HashSet<Integer> hashSet = new HashSet<Integer>(); // 使用HashSet()检查数据内有无重复数
		for (int i = 0; i < array.length; i++) {
			hashSet.add(array[i]);
		}
		if (hashSet.size() == array.length) {
			return true;
		} else {
			return false;
		}
	}
}
