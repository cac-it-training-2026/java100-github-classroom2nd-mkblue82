/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		// double型変数citronSalesにシトロンの売り上げ額を代入
		double citronSales = citronNum * price[0];
		// double型変数chocolatSalesにショコラの売り上げ額を代入
		double chocolatSales = chocolatNum * price[1];
		// double型変数pistachioSalesにピスターシュの売り上げ額を代入
		double pistachioSales = pistachioNum * price[2];

		// 合計個数を演算処理
		double totalNum = citronNum + chocolatNum + pistachioNum;
		// 合計金額を演算処理
		int totalPrice = (int) (citronSales + chocolatSales + pistachioSales);

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

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。\n");

		// 売上合計をint型にキャストして出力
		System.out.println("売上の割合\n売上合計　　　\\" + (int) totalPrice);

		// シトロンの売り上げ割合を計算してdouble型のcitronPerに代入
		double citronPer = (double) citronSales / totalPrice * 100;
		// ショコラの売り上げ割合を計算してdouble型のchocolatPerに代入
		double chocolatPer = (double) chocolatSales / totalPrice * 100;
		// ピスターシュの売り上げ割合を計算してdouble型のpistachioPerに代入
		double pistachioPer = (double) pistachioSales / totalPrice * 100;

		System.out.println("\n内訳");

		// int型にキャストして売り上げの内訳を出力
		System.out.println("シトロン　　　\\" + (int) citronSales + "・・・　" + (int) citronPer + "％");
		System.out.println("ショコラ　　　\\" + (int) chocolatSales + "・・・　" + (int) chocolatPer + "％");
		System.out.println("ピスターシュ　\\" + (int) pistachioSales + "・・・　" + (int) pistachioPer + "％");
	}
}
