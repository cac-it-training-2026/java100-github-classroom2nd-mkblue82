/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	private String item;

	/**
	 * @return item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item セットする item
	 */
	public void setItem(String item) {
		// itemの末尾の文字を取り出す
		String num = item.substring(item.length() - 1, item.length());
		// char型に変換する
		char changeCh = num.charAt(0);
		// メソッドの戻り値を変数に代入する
		String result = changeLastChar(changeCh);
		// itemの末尾の文字をresultに変換する
		String changedStr = item.replace(num, result);
		this.item = changedStr;

	}

	private String changeLastChar(char ch) {
		// 0～9の英語の文字列を格納する配列
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String changeNum;
		switch (ch) {
		case ('0'):
			changeNum = number[0];
			break;
		case ('1'):
			changeNum = number[1];
			break;
		case ('2'):
			changeNum = number[2];
			break;
		case ('3'):
			changeNum = number[3];
			break;
		case ('4'):
			changeNum = number[4];
			break;
		case ('5'):
			changeNum = number[5];
			break;
		case ('6'):
			changeNum = number[6];
			break;
		case ('7'):
			changeNum = number[7];
			break;
		case ('8'):
			changeNum = number[8];
			break;
		case ('9'):
			changeNum = number[9];
			break;
		default:
			changeNum = null;
		}

		return changeNum;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
