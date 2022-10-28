package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
		// 나눠줄 액수 리스트화 하기,
	static final int[] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

	public static List<Integer> solution(int money) {
		// 돈을 받고
		List<Integer> answer = new ArrayList<Integer>();
		for (int j : moneyArr) {
			// 몫은 리스트에 입력,
			answer.add(money / j);
			// 돈의 액수는 잔액으로 바꿔주기
			money %= j;
		}
		return answer;
	}

}
