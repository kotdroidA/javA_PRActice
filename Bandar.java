class Bandar{
	String name,village;
	void whatIsDoes(){
		System.out.println("I am "+name+" , I  read java.");

	}
	void displayDetails(){
		System.out.println("my name is "+this.name+" and I live in "+this.village);

	}
 public static void main(String[] args) {
 	// now make a bandar array

 	Bandar[] bandar = new Bandar[5];

 	//and put some bandars in it

 	bandar[0] = new Bandar(); 
 	bandar[1] = new Bandar(); 
 	bandar[2] = new Bandar(); 
	bandar[3] = new Bandar(); 
	bandar[4] = new Bandar();

	//now assign value

	bandar[0].name = "Anchal";
	bandar[1].name = "Shivani";
	bandar[2].name = "Dipali";
	bandar[3].name = "Golu";
	bandar[4].name = "Nidhi";

	bandar[0].village = "GRP";
	bandar[1].village = "Pakari";
	bandar[2].village = "Dawari";
	bandar[3].village = "Khajuri";
	bandar[4].village = "Banglore";

	for(int i = 0; i<bandar.length; i++){
		bandar[i].whatIsDoes();
		bandar[i].displayDetails();
		
	}


		
	}
}