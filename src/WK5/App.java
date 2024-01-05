package WK5;

/*6.     Create a class named App that has a main method.
a.  In this class instantiate an instance of each of your 
logger classes that implement the Logger interface.
b. Test both methods on both instances, passing in 
Strings of your choice.*/

public class App {

	public static void main(String[] args) {
// The code below creates an instance of the AsteriskLogger
//class and tests the two methods with words passed into them:
		Logger logger1 = new AsteriskLogger();
		logger1.log("Sam");
//This line just spaces out the outputs for better presentation:
		System.out.println();
		
		logger1.error("Place");
		
//This line also just spaces out the outputs for better presentation:
		System.out.print("\n\n");
		
// The code below creates an instance of the SpacedLogger
//class and tests the two methods with words passed into them:
		Logger logger2 = new SpacedLogger();
		logger2.log("Something");

//Another line to space out the output:
		System.out.println("\n");
		
		logger2.error("City");		
		
	}

	
}

