import java.util.Random;

public class Rand {

	public static void main(String[] args) {

		Random gerator = new Random();
		System.out.println(gerator.getRandInt(50000,10000));
	    
	}

	public int getRandInt(int upperBound, int lowerBound){
		int realUpperBound = upperBound - lowerBound + 1;
		int randNumber = gerator.nextInt(realUpperBound);
		return randNumber + lowerBound;
	}  
}