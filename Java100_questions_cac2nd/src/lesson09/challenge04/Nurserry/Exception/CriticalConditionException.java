package lesson09.challenge04.Nurserry.Exception;

import lesson09.challenge04.Nurserry.logic.NurserySchoolChild;

/**
 * 独自例外
 */

public class CriticalConditionException extends Exception {

	public CriticalConditionException(NurserySchoolChild child) {
		// Exceptionクラスのコンストラクタで詳細メッセージを指定
		super(child.getName() + "は重体です。\n\nすぐに病院に行ってください。");
	}
}
