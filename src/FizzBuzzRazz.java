
public class FizzBuzzRazz {

	public static void main(String[] args) {
		
		// Number divisible by 3, 5 and 7
		int number = 105; 
		
		System.out.println("Number is " + number + "\n" +
							"Result is:" + fizzBuzzRazz(number));
	}

	public static String fizzBuzzRazz(int number) {
		String result = "";

		if (number % 3 == 0) {
		    result +="Fizz";
		}

		if (number % 5 == 0) {
		    result += "Buzz";
		}

		if (number % 7 == 0) {
		   result += "Razz";
		}

		return result.isEmpty() ? String.valueOf(number) : result;

	}

}
