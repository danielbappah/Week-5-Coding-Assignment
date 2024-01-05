package WK5;

//3.     Create two classes that implement the Logger interface
//b.  SpacedLogger
//The code below creates the SpacedLogger Class and has it 
//inherit from the Logger interface :
public class SpacedLogger implements Logger {

	
//The method below is the void log method inherited from
//the Logger interface:
	@Override
	public void log(String logWord) {
// The code below takes the string passed into the method and
//converts it into an array of chars comprising of the alphabets
//in the string. It then uses the enhanced for loop to print
//the array elements with spaces in-between:
		char[] spacedWord = logWord.toCharArray();
		for (char letter : spacedWord ) {
			System.out.print(letter+" ");
		}
	}

//The method below is the void error method inherited from
//the Logger interface:
	@Override
	public void error(String errorWord) {
// The code below first prints the string "ERROR: " then repeats
//the code in the log method above to print the word
//passed in with spaces between the letters resulting in the
//goal of having the spaced word next to the "ERROR: " string:
		System.out.print("ERROR:");
		char[] spacedWord = errorWord.toCharArray();
		for (char letter : spacedWord ) {
			System.out.print(letter+" ");
		}
		
	}

}
