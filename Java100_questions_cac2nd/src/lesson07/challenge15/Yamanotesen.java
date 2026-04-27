package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean loseFlag = false;

		String[] answer = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒",
				"大崎", "原宿", "品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鶯谷",
				"代々木", "新大久保", "巣鴨", "高輪ゲートウェイ" };

		String[] userAnswer = new String[30];
		int count = 0;

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！    ");

		do {
			String inputStation = reader.readLine();

			// 山手線かどうか
			boolean isYamanote = false;
			for (int i = 0; i < answer.length; i++) {
				if (answer[i].equals(inputStation)) {
					isYamanote = true;
					break;
				}
			}

			// 既出かどうか
			boolean alreadyUsed = false;
			for (int i = 0; i < count; i++) {
				if (userAnswer[i] != null && userAnswer[i].equals(inputStation)) {
					alreadyUsed = true;
					break;
				}
			}

			if (!isYamanote || alreadyUsed) {
				System.out.println("あなたの負けです！");
				loseFlag = true;
				break;
			}

			userAnswer[count++] = inputStation;

			if (count == answer.length) {
				System.out.println("あなたの勝ちです！");
				break;
			}

			for (int i = 0; i < answer.length; i++) {
				boolean used = false;

				for (int j = 0; j < count; j++) {
					if (answer[i].equals(userAnswer[j])) {
						used = true;
						break;
					}
				}

				if (!used) {
					System.out.println(answer[i]);
					userAnswer[count++] = answer[i];
					break;
				}
			}

		} while (!loseFlag);

	}
}