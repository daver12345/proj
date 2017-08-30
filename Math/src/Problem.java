
public class Problem {

	int diameter = 4; // Diameter of wheel
	int tpr = 1012; // Ticks per revolution of wheel
	
		public void calculator(int distanceTraveled) {
			
			double circum = diameter * 3.14; // Calculates circumference
			double tpi = (tpr/360d) * circum; // Converts ticks per revolution to ticks per inch
			double output = tpi * distanceTraveled; // Multiplies ticks per inch by distance in inches
			double roundOff = Math.round(output * 1000.0) / 1000.0; // Rounds the final number to the 1000's place
			System.out.println(roundOff + " ticks is the amount of ticks for " + distanceTraveled + " inch(es) traveled by the wheel."); // Prints final answer
		}
	
	public static void main(String[] args) {
		Problem tprConversion = new Problem(); // Creates a new object that allows the method calculator() to be invoked
		tprConversion.calculator(1); //Input a distance traveled in between the ()
	}

}
