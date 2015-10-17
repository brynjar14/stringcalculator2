package is.ru.stringcalculator;

public class Calculator {

	public int add(String input){
		String[] numbers = input.split(",|/n");
		if(isEmpty(input)){
			return 0;
		}
		if(input.length() == 1){
			return toInt(input);
		}
		else {
			return getSum(numbers[0],numbers[1]);
		}
	}
	private int getSum(String numA, String numB){
		return toInt(numA) + toInt(numB);
	}
	private boolean isEmpty(String input){
		return input.isEmpty();
	}
	private int toInt(String input){
		return Integer.parseInt(input);
	}
}
