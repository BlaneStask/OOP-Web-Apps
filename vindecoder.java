//Description: This program takes a VIN number from the user and outputs values and 
//attributes for a valid VIN number

import java.util.Scanner;

public class vindecoder{
	/** This method is the main/driver method.
	 * 
	 * @call		calls other methods for values
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a string representing a Vehicle Identification Number (VIN):");
		String vinn = s.nextLine();
		System.out.println();
		//change string to all upper case, trim spaces and replaces all spaces
		String vin = vinn.toUpperCase().trim().replaceAll(" ", "");
		System.out.println("VIN entered by user:");
		System.out.println(vin);
		
		//checks to make sure the length is 17
		if(vin.length() != 17){
			System.out.print("** VIN must contain 17 characters **");
			anotherVin(s);
			System.exit(0);
		}
		//compares input VIN to a string of special characters
		String schars = "!@#$%^&*()[]{}|?/><,.:;'~+=-_";
		for(int i = 0; i <= vin.length() - 1; i++) {
			for(int j = 0; j <= schars.length() - 1; j++){
				if(vin.charAt(i) == schars.charAt(j)){
					System.out.print("** VIN can only contain letters and digits **");
					anotherVin(s);
					System.exit(0);
				}
			}
		}
		
		System.out.println();
		System.out.println("VIN is valid. Decoding in progress ...");
		System.out.println();
		
		values(vin);
		attributes(vin);
		
		anotherVin(s);
	}
	/** This method gets the values by group.
	 * 
	 * @param vin	substrings of the VIN
	 * @print		outputs values of VIN
	 */
	public static void values(String vin){
		System.out.println("Values by group:");
		System.out.print("World Manufacturer Identifier (WMI): ");
		System.out.println(vin.substring(0, 3));
		System.out.print("Vehicle Descriptor Section (VDS): ");
		System.out.println(vin.substring(3, 9));
		System.out.print("Vehicle Identifier Section (VIS): ");
		System.out.println(vin.substring(9, 17));
		System.out.println();
	}
	/** This method gets the attributes of the Vehicle.
	 * 
	 * @param vin	charAt for the location
	 * @print		outputs attributes of VIN
	 */
	public static void attributes(String vin){
		System.out.println("Vehicle attributes:");
		
		System.out.print("Country of manufacture: ");
		if(vin.charAt(0) != '1' && vin.charAt(0) != '4' && vin.charAt(0) != '5'){
			if(vin.charAt(0) == '2'){
				System.out.println("Canada");
			}
			else if(vin.charAt(0) == '3'){
				System.out.println("Mexico");
			}
			else if(vin.charAt(0) == 'J'){
				System.out.println("Japan");
			}
			else if(vin.charAt(0) == 'S'){
				System.out.println("United Kingdom");
			}
			else{
				System.out.println("Germany");
			}
		}
		else{
			System.out.println("United States");
		}
		
		System.out.print("Manufacturer: ");
		if(vin.charAt(1) == 'C'){
			System.out.println("Chrysler");
		}
		else if(vin.charAt(1) == 'F'){
			System.out.println("Ford");
		}
		else if(vin.charAt(1) == 'G'){
			System.out.println("General Motors");
		}
		else if(vin.charAt(1) == 'H'){
			System.out.println("Honda");
		}
		else if(vin.charAt(1) == 'T'){
			System.out.println("Toyota");
		}
		else if(vin.charAt(1) == 'B'){
			System.out.println("BMW");
		}
		else if(vin.charAt(1) == 'A'){
			System.out.println("Jaguar");
		}
		else{
			System.out.println("Mercedes-Benz");
		}
		
		
		System.out.print("Check digit: ");
		System.out.println(vin.charAt(8));
		
		System.out.print("Model year: ");
		if(vin.charAt(9) == 'A'){
			System.out.println("2010");
		}
		else if(vin.charAt(9) == 'B'){
			System.out.println("2011");
		}
		else if(vin.charAt(9) == 'C'){
			System.out.println("2012");
		}
		else if(vin.charAt(9) == 'D'){
			System.out.println("2013");
		}
		else if(vin.charAt(9) == 'E'){
			System.out.println("2014");
		}
		else if(vin.charAt(9) == 'F'){
			System.out.println("2015");
		}
		else if(vin.charAt(9) == 'G'){
			System.out.println("2016");
		}
		else if(vin.charAt(9) == 'H'){
			System.out.println("2017");
		}
		else if(vin.charAt(9) == 'J'){
			System.out.println("2018");
		}
		else if(vin.charAt(9) == 'K'){
			System.out.println("2019");
		}
		else if(vin.charAt(9) == 'L'){
			System.out.println("2020");
		}
		else if(vin.charAt(9) == 'M'){
			System.out.println("1991");
		}
		else if(vin.charAt(9) == 'N'){
			System.out.println("1992");
		}
		else if(vin.charAt(9) == 'P'){
			System.out.println("1993");
		}
		else if(vin.charAt(9) == 'R'){
			System.out.println("1994");
		}
		else if(vin.charAt(9) == 'S'){
			System.out.println("1995");
		}
		else if(vin.charAt(9) == 'T'){
			System.out.println("1996");
		}
		else if(vin.charAt(9) == 'V'){
			System.out.println("1997");
		}
		else if(vin.charAt(9) == 'W'){
			System.out.println("1998");
		}
		else if(vin.charAt(9) == 'X'){
			System.out.println("1999");
		}
		else if(vin.charAt(9) == 'Y'){
			System.out.println("2000");
		}
		else if(vin.charAt(9) == '1'){
			System.out.println("2001");
		}
		else if(vin.charAt(9) == '2'){
			System.out.println("2002");
		}
		else if(vin.charAt(9) == '3'){
			System.out.println("2003");
		}
		else if(vin.charAt(9) == '4'){
			System.out.println("2004");
		}
		else if(vin.charAt(9) == '5'){
			System.out.println("2005");
		}
		else if(vin.charAt(9) == '6'){
			System.out.println("2006");
		}
		else if(vin.charAt(9) == '7'){
			System.out.println("2007");
		}
		else if(vin.charAt(9) == '8'){
			System.out.println("2008");
		}
		else if(vin.charAt(9) == '9'){
			System.out.println("2009");
		}
		
		System.out.print("Serial number: ");
		System.out.println(vin.substring(11, 17));
	}
	/** This method asks for another VIN.
	 * 
	 * @param s		value of input check
	 * @call		calls main if yes, anotherVin if not proper input, ends if no
	 */
	public static void anotherVin(Scanner s){
		System.out.println();
		System.out.print("Enter another VIN (Y/N)? ");
		String again = s.nextLine();
		if(again.charAt(0) != 'N' && again.charAt(0) != 'n'){
			if(again.charAt(0) != 'Y' && again.charAt(0) != 'y'){
				System.out.println();
				System.out.println("** You may only choose Y or N. **");
				anotherVin(s);
			}
			else{
				main(null);
			}
		}	
	}
}