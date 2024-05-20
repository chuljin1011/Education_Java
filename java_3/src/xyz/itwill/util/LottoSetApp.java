package xyz.itwill.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSetApp {
	public static void main(String[] args) {

		Random random = new Random();

		Set<Integer> lottoSet = new HashSet<Integer>();

		while (true) {
			lottoSet.add(random.nextInt(45) + 1);
			if (lottoSet.size() == 6)
				break;
		}

		Integer[] lotto = lottoSet.toArray(new Integer[0]);
		
		Arrays.sort(lotto);
		
		System.out.println("행운의 숫자 = " + Arrays.toString(lotto));

	}

}
