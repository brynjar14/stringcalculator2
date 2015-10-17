package is.ru.stringcalculator;

public class Calculator {
	private final String delimiter = ",|/n";

	public int add(String input){
		String[] numbers = input.split(delimiter);
		if(isEmpty(input)){
			return 0;
		}
		if(input.length() == 1){
			return toInt(input);
		}
		else {
			return getSum(numbers);
		}
	}
	private int getSum(String[] numbers){
		int sum = 0;
		for(int current = 0; current < numbers.length; current++){
			sum += toInt(numbers[current]);
		}
		return sum;
	}
	private boolean isEmpty(String input){
		return input.isEmpty();
	}
	private int toInt(String input){
		return Integer.parseInt(input);
	}
}
