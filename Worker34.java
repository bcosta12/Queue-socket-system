public class Worker34 {

	private int id;
	private int [] testPrimes = new int[100];
	
	public Worker34(int id){setId(id);}

	public int getId(){return id;}

	public void setId(int id){this.id = id;}

	public int getTestPrime(int index){return testPrimes[index];}

	public void setTestPrime(int index, int number){

		testPrimes[index] = number;
	}

	public String isPrime(int number) {
	    // fast even test.
	    if(number > 2 && (number & 1) == 0)
	       return "Not prime";
	    // only odd factors need to be tested up to n^0.5
	    for(int i = 3; i * i <= number; i += 2)
	        if (number % i == 0) 
	            return "Not prime";
	    return "prime";
	}

	public void printResult(int number, int index){
		System.out.println("Worker" + id + " index " +index + " - Number " + number + " " +isPrime(number));
	}

}