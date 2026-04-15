/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		System.out.println("\n");

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

		// 入力結果の出力を行う
		System.out.println("シトロン　　　" + citronNum + "個");
		System.out.println("ショコラ　　　" + chocolatNum + "個");
		System.out.println("ピスターシュ　" + pistachioNum + "個\n");

		System.out.println("をお買い上げですね。\n承りました。");
	}
}
