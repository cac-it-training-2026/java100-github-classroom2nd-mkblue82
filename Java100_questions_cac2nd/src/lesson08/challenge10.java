package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuperRobot {
	int num = 1;

	// 引数の個数分作成するメソッド
	public void orderNum(int num) {
		this.num = num;
	}

	// 引数を受け取って料理を返すメソッド
	public void makeOrder(int choice) {
		if (choice == 1) {
			System.out.println("\n" + this.num + "個、ハンバーグを作成しました。");
		} else if (choice == 2) {
			System.out.println("\n" + this.num + "個、オムライスを作成しました。");
		} else if (choice == 3) {
			System.out.println("\n" + this.num + "個、ドリアを作成しました。");
		} else {
			System.out.println("\n" + this.num + "個、料理が存在しません。");
		}
	}
}

public class challenge10 {
	public static void main(String[] args) throws IOException {
		System.out.println("-----こんにちは！お料理ロボットです！-----\n");

		System.out.print("作成したい料理を選択してください(1.ハンバーグ、2.オムライス、3.ドリア)＞");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int choiceMenu = Integer.parseInt(reader.readLine());

		System.out.print("\n作成する個数を選択してください＞");
		int choiceNum = Integer.parseInt(reader.readLine());

		SuperRobot superRobot = new SuperRobot();
		superRobot.orderNum(choiceNum);
		superRobot.makeOrder(choiceMenu);

	}
}
