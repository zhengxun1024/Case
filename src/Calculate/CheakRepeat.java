package Calculate;

import java.util.HashSet;

public class CheakRepeat {
	public static boolean cheakRepeat(int[] array) { // ��������������ظ���
		HashSet<Integer> hashSet = new HashSet<Integer>(); // ʹ��HashSet()��������������ظ���
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
