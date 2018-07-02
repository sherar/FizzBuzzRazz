
/**
 * Print "Fizz" if number is divisible by 3
 * Print "Buzz" if number is divisible by 5
 * Print "FizzBuzz" if number is divisible by 3 and 5
 * 
 * Return the number if this not is not divisible by 3 or 5
 * 
 * @author sherar
 *
 */

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		// Number divisible by 3 and 5
		int number = 15; 
		
		System.out.println("Number is " + number + "\n" +
							"Result is:" + fizzBuzzRazz(number));
	}

	public static String fizzBuzzRazz(int number) {
		String result = "";

		if (number % 3 == 0) {
		    result +="Fizz";
		} else if (number % 5 == 0) {
		    result += "Buzz";
		}

		return result.isEmpty() ? String.valueOf(number) : result;

	}

}
