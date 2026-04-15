/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)\n");

		// 各値段を格納している配列price
		int[] price = { 250, 280, 320 };

		// BufferedReaderクラスをインスタンス化
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// シトロンの購入数を入力処理
		System.out.print("シトロン　　　>");
		String citronBought = reader.readLine();
		int citronNum = Integer.parseInt(citronBought);

		// ショコラの購入数を入力処理
		System.out.print("ショコラ　　　>");
		String chocolatBought = reader.readLine();
		int chocolatNum = Integer.parseInt(chocolatBought);

		// ピスターシュの購入数を入力処理
		System.out.print("ピスターシュ　>");
		String pistachioBought = reader.readLine();
		int pistachioNum = Integer.parseInt(pistachioBought);

		System.out.println("\n");

		// 合計個数を演算処理
		int totalNum = citronNum + chocolatNum + pistachioNum;
		// 合計金額を演算処理
		int totalPrice = citronNum * price[0] + chocolatNum * price[1] + pistachioNum * price[2];

		// 合計個数と合計金額の出力を行う
		System.out.println("合計個数　　" + totalNum + "個");
		System.out.println("合計金額　" + totalPrice + "円\n");

		System.out.println("をお買い上げですね。\n承りました。");
	}
}
