public class Reverse {
	
	public static void main(String[] args) {
		  
		  // Below is the easy way to reverse a string
		
		StringBuilder str = new StringBuilder("happy"); // Input a string between the ()
	      System.out.println("string = " + str); // This prints out the current string
	      System.out.println("reverse = " + str.reverse()); // This prints out the reverse of the string
	      
	      // Here is the slightly harder way
	      
	      String string = "purple"; // Input a string here

	      for (int i = (string.length() - 1); i >= 0; i--) { 
	    	  // This sets i equal to the index of the string's last character and then repeats until i < 0 while lowering the index
	          System.out.print(string.charAt(i)); 
	          // This prints out the character at the specific index i is equal to, letter by letter
	      }
	      
	}
}
