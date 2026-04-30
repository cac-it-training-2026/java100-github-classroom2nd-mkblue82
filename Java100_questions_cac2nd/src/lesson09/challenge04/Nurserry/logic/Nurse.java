package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.Exception.CriticalConditionException;

/**
 * 保育士クラス
 */

public class Nurse {
	// String型変数nameの宣言
	private String name;

	// String型を引数に持つコンストラクタ
	public Nurse(String name) {
		this.name = name; // 引数の値をフィールドに設定
	}

	// nameのゲッター
	public String getName() {
		return name;
	}

	// nameのセッター
	public void setName(String name) {
		this.name = name;
	}

	//ここに適切な処理を記述

	public void takeTemperature(NurserySchoolChild child) throws CriticalConditionException {
		if (child.getTemperature() >= 38) { // 体温が38度以上の場合
			throw new CriticalConditionException(child); // 独自例外を投げる
		} else {
			System.out.println(child.getName() + "の体温は" + child.getTemperature() + "度です。\n");
		}
	}

}
