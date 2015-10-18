package is.ru.stringcalculator;

public class Calculator {
	private final String delimiter = ",|/n";

	public int add(String input) throws Exception{
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
	private int getSum(String[] numbers) throws Exception{
		giveMeException(numbers);
		int sum = 0;
		for(String current:numbers){
			if(toInt(current) > 1000){
				continue;
			}
			sum += toInt(current);
		}
		return sum;
	}
	private void giveMeException(String[] numbers) throws Exception{
		for(String current:numbers){
			if(toInt(current) < 0){
				throw new Exception("Negative Input!");
			}
		}
	}
	private boolean isEmpty(String input){
		return input.isEmpty();
	}
	private int toInt(String input){
		return Integer.parseInt(input);
	}
}
