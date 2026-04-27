package lesson09.challenge04.Nurserry.Exception;

import lesson09.challenge04.Nurserry.logic.NurserySchoolChild;

public class CriticalConditionException extends Exception {

	public CriticalConditionException(NurserySchoolChild child) {
		super(child.getName() + "は重体です。\n\nすぐに病院に行ってください。");
	}
}
