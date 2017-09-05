import java.util.Random;

public class Worker12 {

	private int id;
	private int [] randNumbers = new int[100];
	
	public Worker12(int id){this.id = id;}

	public int getId(){return id;}

	public void setId(int id){this.id = id;}

	public int getRandNumber(int index){return randNumbers[index];}

	public void setRandNumber(int upperBound, int lowerBound){

		Random generator = new Random();
		int realUpperBound = upperBound - lowerBound + 1; 

		for(int index = 0; index<100;index++){

			int randNumber = generator.nextInt(realUpperBound);
			randNumbers[index] = randNumber + lowerBound;
		}
	}  
}