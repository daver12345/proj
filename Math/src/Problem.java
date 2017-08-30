
public class Problem {

	int diameter = 4;
	int tpr = 1012;
	double output;
	
		public void calculator(int distanceTraveled) {
			
			double circum = diameter * 3.14;
			double tpi = tpr/360d;
			double tpi2 = tpi * circum;
			double output = tpi2 * distanceTraveled;
			double roundOff = Math.round(output * 1000.0) / 1000.0;
			System.out.println(roundOff + " ticks is the amount of ticks for " + distanceTraveled + " inches traveled by the wheel.");
		}
	
	public static void main(String[] args) {
		Problem tprConversion = new Problem(); 
		tprConversion.calculator(2); //Input a distance traveled in between the ().
	}

}
