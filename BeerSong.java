
public class BeerSong {
	
	//Initiating main method
	public static void main(String[] args) { 
		
		//Decalaring data types and values to the variables.
		int bottles = 99;
		String word = "bottles";
		
		/*Author- Mohd Ismail Farooq Lakhani 
		*/

		//'While' loop for creating verse till 0.
		while (bottles>0) {
			System.out.println("----------------------NEW VERSE-----------------");
			System.out.println(bottles + " " + word + " of beer on the wall,");
			System.out.println(bottles + " " + word + " of beer.");
			System.out.println("Take one down, Pass it around.");
			bottles--; //Decrimenting the values of bottles by 1 with each cycle
			
			//Condition to change the word to singular from plural
			if (bottles ==1) {
			word = " bottle";
			}
			if (bottles ==0) {
				word = " bottles";
			}
			System.out.println(bottles + "" + word + " of beer on the wall");
			
		}//End of while loop
	}//End of main method
}//End of program
