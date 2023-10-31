// Java Program to illustrate Main.java

// Importing input output classes
import java.io.*;

// Main class
// Here all above helper classes comes into play
public class Main1 {

	// Main driver method
	public static void main(String[] args)
	{
		// Class objects assigned with constructors
		// Customer input entries
		Customer c1 = new Customer("Rita", 1);
		Customer c2 = new Customer("Sita", 2);

		// Adding new customers as created above
		CustomerCollection.AddNewCustomer(c1);
		CustomerCollection.AddNewCustomer(c2);

		// Display message for better readability and
		// understanding
		System.out.println("****Reading File****");

		// Lastly reading File
		CustomerCollection.readFile();
	}
}
