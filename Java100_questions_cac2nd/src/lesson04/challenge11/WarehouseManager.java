/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] containerC = new int[5];
		int[] containerD = new int[5];
		int[] containerE = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < containerC.length; i++) {
			if (Math.random() < 0.25) {
				containerC[i] = 0; // 25%の場合0
			} else {
				containerC[i] = (int) (Math.random() * 10) + 1;
			}
		}

		for (int i = 0; i < containerD.length; i++) {
			if (Math.random() < 0.25) {
				containerD[i] = 0;
			} else {
				containerD[i] = (int) (Math.random() * 10) + 1;
			}
		}

		for (int i = 0; i < containerE.length; i++) {
			if (Math.random() < 0.25) {
				containerE[i] = 0;
			} else {
				containerE[i] = (int) (Math.random() * 10) + 1;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < containerC.length; i++) {
			System.out.print(containerC[i]);
			if (i != (containerC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < containerD.length; i++) {
			System.out.print(containerD[i]);
			if (i != (containerD.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < containerE.length; i++) {
			System.out.print(containerE[i]);
			if (i != (containerE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する
		int[][] changeAll = new int[3][5];
		int[] tempAll = new int[15];

		changeAll[0] = containerC;
		changeAll[1] = containerD;
		changeAll[2] = containerE;

		int k = 0;
		for (int i = 0; i < changeAll.length; i++) {
			for (int j = 0; j < changeAll[0].length; j++) {
				if (changeAll[i][j] != 0) {
					tempAll[k++] = changeAll[i][j];
				}
			}
		}

		for (int i = 0; i < changeAll.length; i++) {
			for (int j = 0; j < changeAll[0].length; j++) {
				changeAll[i][j] = 0;
			}
		}

		k = 0;
		for (int i = 0; i < changeAll.length; i++) {
			for (int j = 0; j < changeAll[0].length; j++) {
				if (k < tempAll.length && tempAll[k] != 0) {
					changeAll[i][j] = tempAll[k++];
				}
			}
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < containerC.length; i++) {
			System.out.print(containerC[i]);
			if (i != (containerC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < containerD.length; i++) {
			System.out.print(containerD[i]);
			if (i != (containerD.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < containerE.length; i++) {
			System.out.print(containerE[i]);
			if (i != (containerE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
