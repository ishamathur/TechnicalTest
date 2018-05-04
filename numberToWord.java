package conversion;

public class numberToWord {
	
	public static String numToWord(long number)
	{
		   String words = "";
			String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
	                                "seven", "eight", "nine", "ten", "eleven", "twelve",
	                                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
	                                "eighteen", "nineteen" };
			String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
	                                 "sixty", "seventy", "eighty", "ninety" };
	 
			if (number == 0) {
				return "zero";
			}
			if(number > 999999999)
			{
				return "Please enter number within the range of 999999999";
			}
			// add minus before conversion if the number is less than 0
			if (number < 0) { 
	                        // convert the number to a string
	                        String numberStr = "" + number;
	                        // remove minus before the number 
	                        numberStr = numberStr.substring(1);                        
	                        return "minus " + numToWord(Integer.parseInt(numberStr));
	                } 
	                // check if number is divisible by 1 million
	                if ((number / 1000000) > 0) {
				words += numToWord(number / 1000000) + " million ";
				number %= 1000000;
			}
			// check if number is divisible by 1 thousand
			if ((number / 1000) > 0) {			
				words += numToWord(number / 1000) + " thousand ";			
				number %= 1000;
				
			}
			// check if number is divisible by 1 hundred
			if ((number / 100) > 0) {
		
				words += numToWord(number / 100) + " hundred ";
				number %= 100;
			}
	 
			if (number > 0) {
				// check if number is within tens
				if (number < 20) {			
	                                 words += unitsArray[(int) number];                          
	                        } else { 	                        	
	                                words += tensArray[(int) (number / 10)];        
	                                if ((number % 10) > 0) {
					   words += " "+unitsArray[(int) (number % 10)];
	                            }  
				}
			}
	 
			return words;
	}


}
