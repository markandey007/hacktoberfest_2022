
import java.util.Scanner;
/**
 * @author KK JavaTutorials
 *This java program is all about How to convert an integer number to equivalent in word format
 */
public class NumberToWordConverter {

	public static void main(String[] args) {
		int number = 0;
		try(Scanner scanner = new Scanner(System.in)) {
			//read number from keyboard
			System.out.println("Please Enter a number(max upto 9 digits):");
			number = scanner.nextInt();
			System.out.print("Number in words: " + convertNumberToWords(number));
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
	}

	private static String convertNumberToWords(int number) {
		//this variable is going to hold string representation of number
		String words = "";
		
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		if (number == 0) {
			return "zero";
		}
		// We should add minus before conversion if the number is less than 0 ( for negative number)
		if (number < 0) {
			//convert the number to a string
			String numberStr = "" + number;
			// remove minus before the number
			numberStr = numberStr.substring(1);
			// add minus before the number and convert the rest of number
			return "minus " + convertNumberToWords(Integer.parseInt(numberStr));
		}
		// Here We check if number is divisible by 1 million
		if ((number / 1000000) > 0) {
			words += convertNumberToWords(number / 1000000) + " million ";
			number %= 1000000;
		}
		// Here we are checking if number is divisible by 1 thousand
		if ((number / 1000) > 0) {
			words += convertNumberToWords(number / 1000) + " thousand ";
			number %= 1000;
		}
		// Here we are checking if number is divisible by 1 hundred
		if ((number / 100) > 0) {
			words += convertNumberToWords(number / 100) + " hundred ";
			number %= 100;
		}

		if (number > 0) {
			// check if number is within unitsArray
			if (number < 20) {
				//fetch the appropriate value from unit array
				words += unitsArray[number];
			} else {
				// fetch the appropriate value from tens array
				words += tensArray[number / 10];
				if ((number % 10) > 0) {
					words += "-" + unitsArray[number % 10];
				}
			}
		}
		return words;
	}
}