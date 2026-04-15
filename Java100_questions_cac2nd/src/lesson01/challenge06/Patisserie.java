/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)\n");

		// 各値段を格納している配列price
		int[] price = { 250, 280, 320 };
		// 各在庫を格納している配列stock
		int[] stock = { 30, 30, 30 };

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

		System.out.println("をお買い上げですね。\n承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		int newStock[] = { stock[0] - citronNum, stock[1] - chocolatNum, stock[2] - pistachioNum };

		System.out.println("シトロン　　　\\" + price[0] + "　・・・　残り" + newStock[0] + "個");
		System.out.println("ショコラ　　　\\" + price[1] + "　・・・　残り" + newStock[1] + "個");
		System.out.println("ピスターシュ　\\" + price[2] + "　・・・　残り" + newStock[2] + "個");
	}
}
