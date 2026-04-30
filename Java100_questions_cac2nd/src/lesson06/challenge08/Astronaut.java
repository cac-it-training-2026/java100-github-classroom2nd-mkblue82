/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題8 宇宙船の台数を数える
 *
 * 問題7で作成した宇宙船クラス（Spaceship）に
 * クラスメソッドcount()を追加して、現在までに作成された宇宙船が
 * 何台あるのかを表示してください。
 *
 * <実行例>
 * 新しい宇宙船を作成します。
 *
 * 新しい宇宙船を作成します。
 *
 * 新しい宇宙船を作成します。
 *
 * 宇宙船は全部で3台あります。
 *
 */

package lesson06.challenge08;

/*
 * 宇宙船クラス
 */
class Spaceship {
	private int air;
	private int fuel;
	/** static変数numberの定義 */
	private static int number;

	/** デフォルトコンストラクタの定義 */
	public Spaceship() {
		System.out.println("新しい宇宙船を作成します。\n");
		number++; // numberに＋1して代入
	}

	/** 引数ありコンストラクタの定義 */
	public Spaceship(int air, int fuel) {
		// 引数で渡された変数をフィールドに代入
		this.air = air;
		this.fuel = fuel;
	}

	/** fuel(燃料)のゲッター */
	public int getFuel() {
		return fuel;
	}

	/** fuel(燃料)のセッター */
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	/** air(空気)のゲッター */
	public int getAir() {
		return air;
	}

	/** air(空気)のセッター */
	public void setAir(int air) {
		this.air = air;
	}

	//ここに適切な処理を記述する。
	public void count() {
		// 
		System.out.println("宇宙船は全部で" + number + "台あります。");
	}

}

// メインクラス
public class Astronaut {

	public static void main(String[] args) {

		// Spaceshipクラスのインスタンス化x3
		Spaceship spaceship1 = new Spaceship();
		Spaceship spaceship2 = new Spaceship();
		Spaceship spaceship3 = new Spaceship();

		//ここに適切な処理を記述する。

		// count()メソッドの呼び出し
		// 作成された宇宙船の合計(sum)の出力を行う
		spaceship1.count();
	}
}
