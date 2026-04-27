/**
 * 第7章 武士のお仕事
 *
 * 問題9  getClass()メソッドの利用
 *
 * 侍クラスのサブクラスをまとめて扱う。
 *
 * 要素数5の侍クラスの配列を用意し、
 * 藩士クラス、浪人クラスの何れかをランダムで代入します。
 * getClass()メソッドを使いそれぞれの要素に何のクラスの
 * オブジェクトが入ったか表示してください。
 * （藩士クラス、浪人クラスともに
 *   デフォルトコンストラクタを用意します）
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれ表示してみます。
 *
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 *
 */

package lesson07.challenge09;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {

	protected String domain;

	public Retainer() {
		;
	}

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	public void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	public void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は" + domain + "士、" + name + "ともうす。";
	}

	public boolean equals(String domain) {
		if (this.domain.equals(domain)) {
			return true;
		} else {
			return false;
		}
	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai {

	public Ronin() {
		;
	}

	public Ronin(String name) {
		this.name = name;
	}

	public void convered() {
		System.out.println("傘張りするよ～。");
	}

	public void work() {
		System.out.println("傘張るよ～。");
	}

	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		//ここに適切な処理を記述
		// 要素数5のSamurai型配列samuraisを用意
		Samurai[] samurais = new Samurai[5];

		for (int i = 0; i < samurais.length; i++) {
			int random = (int) (Math.random() * 2);
			if (random == 0) {
				samurais[i] = new Retainer();
			} else if (random == 1) {
				samurais[i] = new Ronin();
			}
		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれ表示してみます。\n");

		//ここに適切な処理を記述
		for (Samurai samurai : samurais) {
			System.out.println(samurai.getClass());
		}

	}
}
