package WK5;

//3.     Create two classes that implement the Logger interface
//a.  AsteriskLogger
//The code below creates the AsteriskLogger Class and has it 
//inherit from the Logger interface :
public class AsteriskLogger implements Logger {

	
//The method below is the void log method inherited from
//the Logger interface:
	@Override
	public void log(String logWord) {
// This line prints the string passed into the method and 
//concatenates it with the three asterisks at each end:
		System.out.println("***"+logWord+"***");
	}


//The method below is the void error method inherited from
//the Logger interface:
	@Override
	public void error(String errorWord) {
// The code below takes the string that is passed into the
//method and concatenates it with the "ERROR: " string.
//The resulting string is stored in the string variable 'phrase':

		String phrase = "ERROR: ";
		phrase = phrase.concat(errorWord);

//The loop below checks the length of the string 'phrase'. It 
//then adds the number 6 to the resulting (integer) length then
//prints a number of asterisks equaling the resulting sum. This
//is because there will be three asterisks at either side of the
//string 'phrase', so to have enough asterisks to cover that at
//the top you need 6 plus the length of the string:
		for (int i =0; i < (phrase.length() + 6); i++) {
			System.out.print("*");
		}
		
//This line prints the string 'phrase' with three asterisks on
//either side:
		System.out.println("\n***"+phrase+"***");

//The loop below repeats the printing of the asterisks done 
//earlier on. Having the asterisks printed above and beneath
//the string 'phrase' with asterisks on either side accomplishes
//the goal of having the string in a box of asterisks:
		for (int i =0; i < (phrase.length() + 6); i++) {
			System.out.print("*");
		}
		
		}
	}


