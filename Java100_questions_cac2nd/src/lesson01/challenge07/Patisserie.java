/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		// int型配列stockをdouble型に変換する
		double[] doubleStock = { stock[0], stock[1], stock[2] };

		// BufferedReaderクラスをインスタンス化
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// シトロンの購入数を入力処理
		System.out.print("シトロン　　　>");
		String citronBought = reader.readLine();
		// double型に変換
		double citronNum = Double.parseDouble(citronBought);

		// ショコラの購入数を入力処理
		System.out.print("ショコラ　　　>");
		String chocolatBought = reader.readLine();
		// double型に変換
		double chocolatNum = Double.parseDouble(chocolatBought);

		// ピスターシュの購入数を入力処理
		System.out.print("ピスターシュ　>");
		String pistachioBought = reader.readLine();
		// double型に変換
		double pistachioNum = Double.parseDouble(pistachioBought);

		System.out.println("\n");

		// 合計個数を演算処理
		double totalNum = citronNum + chocolatNum + pistachioNum;
		// 合計金額を演算処理
		int totalPrice = (int) (citronNum * price[0] + chocolatNum * price[1] + pistachioNum * price[2]);

		// 合計個数と合計金額の出力を行う
		System.out.println("合計個数　　" + totalNum + "個");
		System.out.println("合計金額　" + (int) totalPrice + "円\n");

		System.out.println("をお買い上げですね。\n承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		// 現在の在庫数から販売済み個数を引いた結果を、double型配列newStockに格納する
		double newStock[] = { doubleStock[0] - citronNum, doubleStock[1] - chocolatNum, doubleStock[2] - pistachioNum };

		// 合計個数をint型にキャストして出力を行う
		System.out.println("シトロン　　　\\" + price[0] + "　・・・　残り" + (int) newStock[0] + "個");
		System.out.println("ショコラ　　　\\" + price[1] + "　・・・　残り" + (int) newStock[1] + "個");
		System.out.println("ピスターシュ　\\" + price[2] + "　・・・　残り" + (int) newStock[2] + "個");
	}
}
