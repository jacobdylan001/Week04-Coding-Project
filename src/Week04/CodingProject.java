package Week04;




public class CodingProject {

	public static void main(String[] args) {
		
		
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};     // Created an array of int and initialized it to a set of numbers.		
			int lastIndex = ages.length - 1;     // Declared a variable and initialized it to the value of the last element in the array.	
			int diff = ages[lastIndex] - ages[0];     // Created a variable and set it to the difference;
		
			System.out.println("Array 1 first and last difference: " + diff);     // Printed the difference to the console.


			int[] ages2 = new int[9];      // Declared a 9 element array.
		
			ages2[0] = 3;
			ages2[1] = 5;
			ages2[2] = 13;
			ages2[3] = 21;       		// Initialized an array of ages.
			ages2[4] = 14;
			ages2[5] = 42;
			ages2[6] = 65;		
			ages2[7] = 87;
			ages2[8] = 52;
			
			int lastIndex2 = ages2.length - 1;     // Created a variable and set it equal to the value of the last element of the array.
			int diff2 = ages2[lastIndex2] - ages2[0];     // Created a variable and set it to the difference.
		
			System.out.println("Array 2 first and last difference: " + diff2);      // Printed to console.
											
			

		int sum = 0;        // Declared a variable to hold the sum.
		int averageAge = 0;     // Declared a variable to hold the average of all ages in the array.
		for (int age : ages) {      // For loop looks at each age in the array.
			sum += age;                   // Keep a running total.
			averageAge = sum / ages.length;     // Calculated the average.
		}
		System.out.println("The average age in the array is: " + averageAge);    // Printed the average age to console.

		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};   // Declared and initialized String array
		
		int letters = 0;            // Created a variable to count each letter.
		for (String name : names) {       // Enhanced for loop to look at each individual word.
			letters += name.length();          // Added each name length to the variable letters.
		}
		int averageLetters = letters / names.length;   //  Calculated the average by dividing total letters by the length of the array.
		
		System.out.println("The average number of letters in each word is: " + averageLetters);
		
		
		String allNames = "";     
		for (String name : names) {
			allNames += name;               // Created a for loop that iterates through each element of the array and concatenates a space and the name.
			allNames += " ";
		}
		System.out.println("The names in the array are: " + allNames);    // Printed the results to the console.

				
//			 array[array.length - 1];    // This finds the last element of any array by taking the total length -1, because java is 0 based.

		
//           array[0];            // This finds the first element of any array because the element is always in the 0 position.

			
		int[] nameLengths = new int[names.length];  // Declared a new array called nameLengths and initialized it to the size of the names array.
		int i = 0;           // Created an index variable as a counter.
		for (String name : names) {       // Enhanced for loop to iterate through each name in the names array.
			nameLengths[i] += name.length();       // The nameLengths array will iterate though numbers starting at 0, each time adding the name length to the element in that position.
			System.out.println(names[i] + " " + nameLengths[i]);    // Printed out each name in the names array and concatenated its name length.
			i++;     // Iterations is at the bottom so that the first time through, it prints the 0 element instead of the 1 element.
		}	

		
		int lengthSum = 0;    // This variable will hold the value of the sum of all names in nameLengths.
		for (int num : nameLengths) { // For loop to iterate through the nameLengths array.
			lengthSum += num;   // Adding each number to the variable lengthSum.
		}
		System.out.println("The total sum of elements in the array is: " + lengthSum);     //Printed out to console.
			
//     --------------------------------Space for calling methods--------------------------------------------	
		
		System.out.println(wordRepeating("Java", 8));     // Calling the method wordRepeating.
		
		
		System.out.println(FullName("Ringo", "Starr"));     // Calling the method FullName.
		
		
		System.out.println(isSumGreaterThan100(ages));     // Calling the method isSumGreaterThan100.
		
		double[] numbers = {43.55, 56.99, 49.34, 71.12};   // Created an array of double to call to the method.
		System.out.println(averageOfNums(numbers));        // Calling the method averageOfNums.
		
		double[] numbers2 = {9.31, 21.28, 10.23, 23.34};     // Created a second array to call the method.
		System.out.println(isFirstAverageGreaterThanSecond(numbers, numbers2));     // Calling the method isFirstAverageGreaterThanSecond.
		
		
		System.out.println(willBuyDrink(true, 9.80));      // Calling the method willBuyDrink.
		
		System.out.print("Your next check will be: " + "$" + calculateGrossPay(76.5, 18.50));
		
		
		
		
	}
		public static String wordRepeating(String word, int n) {   // Created a public method that will return a String, with the parameters being a String and an int.
			   
			   String repeatWord = "";      // Declared and initialized a String to hold the value of the word being repeated through the loop.
			   for (int i = 0; i < n; i++) {     // For loop keeps iterating as long as the index is less than n.
				   repeatWord += word;   // Adds the passed in word to the repeatWord variable.
			   }
			    return repeatWord;    // Returns a String that holds word as many times as n is.
		   }
                                                 
		public static String FullName(String firstName, String lastName) {   // Created a public method that will take 2 Strings, and combine them to make a full name.
		   		
		   		String fullName = firstName + " " + lastName;    // Declared and set a variable to the 2 strings passed in, concatenated.
		   		
		   		return fullName;		// Returns the fullName variable.
		   	}
			
		public static boolean isSumGreaterThan100(int[] nums) {     // Created a public method that will return true if the int array sum is greater than 100.
			
		   		int sum = 0;    // Created a variable to hold the sum of numbers in the array.
		   		for (int num : nums) {     // Created a for loop to check each number in the array.
				sum += num;       // Adds each number in the array to the sum.
			}
			return sum > 100;    // Returns a boolean of true if the sum is greater than 100.
		}
		
		public static double averageOfNums(double[] array) {     // Created a public method that will take an array of double and return a double.
			
			double sum = 0;      // Created a variable to hold the numbers in the array added together.
			for (double arr : array) {      // For loop to take each number in the array.
				sum += arr;      // Added the numbers from the array to the sum.
			}
			double average = sum / array.length;     // Calculated the average.
			
			return average;    // Returned the average.
		}
		
		public static boolean isFirstAverageGreaterThanSecond(double[] array, double[] array2) {    // Created a public method that will check if the first array average is greater than the second array average.
			
			double sum = 0;     // Created a variable to hold the sum of the first array.
			for (double arr : array) {     // For loop to check each element in the array.
				sum += arr;      // Adds each number to the sum.
			}
			double average = sum / array.length;     // Calculated the average using array.length to get the total length
			
			double sum2 = 0;     //Created a variable to hold the sum of the second array.
			for (double arr2 : array2) {     // For loop to check each element in the array.
				sum2 += arr2;     // Adds each number to the sum.
			}
			double average2 = sum2 / array2.length;    // Calculated the average of the second array.
			
			return average > average2;     // Returned if the first array average is greater than the second array average.	
		}
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {    // Created a public method that returns a boolean and takes a boolean and a double.
			
			if (isHotOutside && moneyInPocket > 10.50) {   // if statement that declares a condition
				return true;      // Returns true if the whole condition is met.
			} else {    // Otherwise
				return false;   // Returns false if the whole condition is not met.
			}
		}
		

	// This method calculates how much you will be paid at you check over a 2 week period while factoring in overtime.
		
	// I created it because I was driving to work trying to figure out how much I was going to be getting paid on my next check with overtime.
	
		public static double calculateGrossPay(double hoursWorked, double hourlyPay) {   // Created a method called pay calculator that takes two doubles and returns a double.
			
			int regularHours = 80;     // Set a variable to the normal hours with normal pay.
			double overTime = hourlyPay * 1.5;     // Multiplied hourly pay by 1.5 to get overtime pay.
			double overTimeWorked = hoursWorked - regularHours;     // Subtracted the regular 80 hours from the amount of hours worked to find how many hours will be considered overtime.
			double overTimePay =  overTimeWorked * overTime;     // Multiplied overtime pay by the amount of hours that were overtime.
			double grossPay = overTimePay + (hoursWorked * hourlyPay);     // Calculated the total pay with overtime included.
			
			if (hoursWorked <= regularHours) {     // Created an if statement and set the conditions.
				return hoursWorked * hourlyPay;   // If both are true then you get paid with no overtime.
			} else {     // If both are not true
				return grossPay;     // Then it will return the gross pay with overtime.
				
				
				
			
				
				
		}
			
	}

}
