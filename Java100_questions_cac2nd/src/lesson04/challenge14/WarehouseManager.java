/**
 * 第4章 倉庫番のお仕事
 *
 * 問題14 各部対抗ブロックじゃんけん
 *
 * 今日はXO商事の年に一度の恒例行事、各部対抗ブロックじゃんけんの日です。
 * Yさんは東北支社のSさんと対戦することになっています。
 * ブロックじゃんけんのルールは下記の通りです。
 *
 * 1...5箱からなるコンテナを用意する。
 * 2...各箱にはグーブロック、チョキブロック、パーブロックのどれかを入れる。
 * 3...ただし上記三つのブロックの使用は、それぞれ2個までとする。
 * 4...対戦者は互いにオープンするブロックを決め、出たブロックでジャンケン勝負。
 * 5...4を5回繰り返し、勝ちが多かった方を最終的な勝者とする。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Yさん：
 *  よし、今日はがんばるぞ！
 *
 *  コンテナ1に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞3
 *
 *  コンテナ2に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞2
 *
 *  コンテナ3に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞2
 *
 *  コンテナ4に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞1
 *
 *  コンテナ5に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞3
 *
 *  1回戦
 *  Yさん：
 *  どの手を出そうかな～
 *
 *  Sさん：
 *  はやぐ決めれ！腹減ってしゃねてば
 *
 *  オープンするコンテナを決めてください＞2
 *
 *  Yさん：
 *  よし、2番コンテナだ！
 *
 *  Sさん：
 *  こっちは3番コンテナだべ！
 *
 *  審判：
 *  ではオープンしてみましょう。
 *
 *  審判：
 *  Yさん：チョキ VS Sさん：パー
 *  で、Yさんの勝ちです。
 *
 *  Yさん：
 *  やった勝ちだ！
 *
 *  Sさん：
 *  あー、もうやんだぐなっできた...
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  審判：
 *  対戦終了です。 結果は...
 *
 *  審判：
 *  Yさん：2勝1敗2分け
 *  Sさん：1勝2敗2分け
 *  で、Yさんの勝利です。
 *
 *  Yさん：
 *  まあ、そうなるよね。
 *
 *  Sさん：
 *  こっだなことがあっでいいんだべか！
 *
 * <1対戦ごとのじゃんけんでYさんが負けた場合の実行例>
 *  Yさん：
 *  次は勝つぞ！
 *
 *  Sさん：
 *  負けるわけねべ！
 *
 * <1対戦ごとのじゃんけんで引き分けた場合の実行例>
 *  Yさん：
 *  おしいな～
 *
 *  Sさん：
 *  実質おらの勝ちだべ。
 *
 * <最終判定でYさんが負けた場合の実行例>
 *  Yさん：
 *  負けちゃった。悔しいな～
 *
 *  Sさん：
 *  弱い者に勝っても、な～んも自慢になんねな。
 *
 * <最終判定で引き分けた場合の実行例>
 *  Yさん：
 *  ふ～。なんとか引き分けたか。
 *
 *  Sさん：
 *  次はたんげがんばるはんで、応援してけれな。
 *
 * <グーチョキパー以外の数値が入力された場合の実行例>
 *  Yさん：
 *  え～。そんな手ないよ。
 *
 *  コンテナ○に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞
 *
 * <その手が既に2回使用されていた場合の実行例>
 *  Yさん：
 *  ○○はもう使えません。(※○○にはグー、チョキ、パーの何れかが入る)
 *
 *  コンテナ○に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞
 *
 * <既にオープンしたコンテナが入力された場合の実行例>*
 *  Yさん：
 *  そのコンテナはもうオープンしちゃったよ。
 *
 * <存在しないコンテナが入力された場合の実行例>*
 *  Yさん：
 *  え～。そんなコンテナないよ。
 *
 */

package lesson04.challenge14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		String[] handArray = { "グー", "チョキ", "パー" };
		int winPoint = 0; // 勝ち
		int losePoint = 0; // 負け
		int drawPoint = 0; // 引き分け
		int stoneCount1 = 0; // グーの数y
		int stoneCount2 = 0; // グーの数s
		int scissorsCount1 = 0; // チョキの数y
		int scissorsCount2 = 0; // チョキの数s
		int paperCount1 = 0; // パーの数y
		int paperCount2 = 0; // パーの数s

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Yさん：");
		System.out.println("よし、今日はがんばるぞ！");
		int[] jankenArray1 = new int[5];
		int[] jankenArray2 = new int[5];

		//Yさんのコンテナにじゃんけんの手を入れる処理を記述する。
		for (int i = 0; i < jankenArray1.length; i++) {
			System.out.println("コンテナ" + (i + 1) + "に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞");
			int choiceHand = Integer.parseInt(br.readLine());

			// グーチョキパー以外の数値が入力された場合
			if (choiceHand > 3 || choiceHand < 1) {
				System.out.println("Yさん：");
				System.out.println("え～。そんな手ないよ");
				i--;
				continue;
			}

			// じゃんけんの手を入れる。2回以上入力されたら再度入力
			if (choiceHand == 1) {
				if (stoneCount1 == 2) {
					System.out.println("Yさん：");
					System.out.println("グーはもう使えません。");
					i--;
					continue;
				} else {
					jankenArray1[i] = 1;
					stoneCount1++;
				}
			} else if (choiceHand == 2) {
				if (scissorsCount1 == 2) {
					System.out.println("Yさん：");
					System.out.println("チョキはもう使えません。");
					i--;
					continue;
				} else {
					jankenArray1[i] = 2;
					scissorsCount1++;
				}
			} else if (choiceHand == 3) {
				if (paperCount1 == 2) {
					System.out.println("Yさん：");
					System.out.println("パーはもう使えません。");
					i--;
					continue;
				} else {
					jankenArray1[i] = 3;
					paperCount1++;
				}
			}
		}

		//Sさんのコンテナにじゃんけんの手を入れる処理を記述する。（ランダム）
		for (int i = 0; i < jankenArray2.length; i++) {
			int sHand = (int) ((Math.random() * 3) + 1);

			if (sHand == 1) {
				if (stoneCount2 >= 2) {
					i--;
					continue;
				} else {
					jankenArray2[i] = 1;
					stoneCount2++;
				}
			} else if (sHand == 2) {
				if (scissorsCount2 >= 2) {
					i--;
					continue;
				} else {
					jankenArray2[i] = 2;
					scissorsCount2++;
				}
			} else {
				if (paperCount2 >= 2) {
					i--;
					continue;
				} else {
					jankenArray2[i] = 3;
					paperCount2++;
				}
			}
		}

		for (int count = 0; count < 5; count++) {

			System.out.println("\nYさん：");
			System.out.println("どの手を出そうかな～\n");

			System.out.println("Sさん：");
			System.out.println("はやぐ決めれ！腹減ってしゃねてば\n");

			int openNum1 = 0;

			//Yさんのどのコンテナをオープンするか入力してもらう処理を記述する。
			System.out.print("オープンするコンテナを決めてください＞");
			openNum1 = Integer.parseInt(br.readLine());

			// 存在しないコンテナが選択された場合
			if (openNum1 > 5 || openNum1 < 1) {
				System.out.println("Yさん：");
				System.out.println("え～。そんなコンテナないよ。");
				count--;
				continue;
			} else if (jankenArray1[openNum1 - 1] == 0) {
				System.out.println("Yさん：");
				System.out.println("そのコンテナはもうオープンしちゃったよ。");
				count--;
				continue;
			}

			int openNum2 = 0;

			//Sさんのどのコンテナをオープンするか決定する処理を記述する。（ランダム）
			do {
				openNum2 = (int) (Math.random() * 5);
			} while (jankenArray2[openNum2] == 0);

			// ★値を退避
			int yHand = jankenArray1[openNum1 - 1];
			int sHand = jankenArray2[openNum2];

			System.out.println("\nYさん：");
			System.out.println("よし、" + openNum1 + "番コンテナだ！\n");

			System.out.println("Sさん：");
			System.out.println("こっちは" + (openNum2 + 1) + "番コンテナだべ！\n");

			System.out.println("審判：");
			System.out.println("ではオープンしてみましょう。\n");

			System.out.println("審判：");
			System.out.print("Yさん：" + handArray[yHand - 1]);
			System.out.print(" VS ");
			System.out.println("Sさん：" + handArray[sHand - 1]);
			System.out.print("で、");

			//1回ごとの勝敗判定およびメッセージの出力処理を記述する。
			if (yHand == sHand) {
				drawPoint++;
				System.out.println("引き分けです。\n");
				System.out.println("Yさん：");
				System.out.println("おしいな～\n");
				System.out.println("Sさん：");
				System.out.println("実質おらの勝ちだべ。");
			} else if ((yHand == 1 && sHand == 2) ||
					(yHand == 2 && sHand == 3) ||
					(yHand == 3 && sHand == 1)) {
				winPoint++;
				System.out.println("Yさんの勝ちです。\n");
				System.out.println("Yさん：");
				System.out.println("やった勝ちだ！\n");
				System.out.println("Sさん：");
				System.out.println("あー、もうやんだぐなっできた...");
			} else {
				losePoint++;
				System.out.println("Sさんの勝ちです。\n");
				System.out.println("Yさん：");
				System.out.println("次は勝つぞ！\n");
				System.out.println("Sさん：");
				System.out.println("負けるわけねべ！");
			}

			jankenArray1[openNum1 - 1] = 0;
			jankenArray2[openNum2] = 0;
		}

		System.out.println("審判：");
		System.out.println("対戦終了です。 結果は...\n");

		System.out.println("審判：");
		System.out.println("Yさん：" + winPoint + "勝" + losePoint + "敗"
				+ drawPoint + "分け");
		System.out.println("Sさん：" + losePoint + "勝" + winPoint + "敗"
				+ drawPoint + "分け");
		System.out.print("で、");

		if (winPoint > losePoint) {
			System.out.println("Yさんの勝利です。\n");
			System.out.println("Yさん：");
			System.out.println("まあ、そうなるよね。\n");
			System.out.println("Sさん：");
			System.out.println("こっだなことがあっでいいんだべか！\n");
		} else if (winPoint < losePoint) {
			System.out.println("Sさんの勝利です。\n");
			System.out.println("Yさん：");
			System.out.println("負けちゃった。悔しいな～\n");
			System.out.println("Sさん：");
			System.out.println("弱い者に勝っても、な～んも自慢になんねな。\n");
		} else {
			System.out.println("引き分けです。\n");
			System.out.println("Yさん：");
			System.out.println("ふ～。なんとか引き分けたか。\n");
			System.out.println("Sさん：");
			System.out.println("次はたんげがんばるはんで、応援してけれな。\n");
		}
	}
}