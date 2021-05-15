class SomeExample {
	
	public static void main(String[] args) {

		generateRandom(14);

		int  num = Integer.parseInt("454");
		System.out.println(num);

		double doublew = Double.parseDouble("455.34");
		System.out.println(doublew);

		//boolean bool  = Boolean.parseBool("true");
		// System.out.println(bool);		

		
	}


	// function to generate random numbers between 1 to 100
	static void generateRandom(int maxLimit){

		int random = (int)(Math.random()*maxLimit);
		System.out.println("The random number generated is: " + random);
	}




}