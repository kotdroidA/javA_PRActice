import java.util.*;

public class GameLauncher{

	public static void main(String[] args) {

		// Scanner Object
		Scanner sc = new Scanner(System.in);

		// GuessGame object creation
		GuessGame guessGame  = new GuessGame();

		// GuessGame instance variable value update;
		guessGame.player1 = new Player(4,"Anchal");
		guessGame.player2 = new Player(5,"Julie");
		guessGame.player3 = new Player(7,"Soli");

		boolean isPlayer1Won=false,isPlayer2Won=false,isPlayer3Won=false;




		int randomNumber = guessGame.startGame();




		while(!isPlayer1Won && !isPlayer2Won && !isPlayer3Won){

			System.out.println(guessGame.player1.name + " please enter your guessed number: " );
			guessGame.player1.number = sc.nextInt();
			sc.nextLine();


			System.out.println(guessGame.player2.name + " please enter your guessed number: " );
			guessGame.player2.number = sc.nextInt();
			sc.nextLine();			

			System.out.println(guessGame.player3.name + " please enter your guessed number: " );
			guessGame.player3.number = sc.nextInt();
			sc.nextLine();

			if(randomNumber ==  guessGame.player1.number){
				isPlayer1Won = true;
			}

			if(randomNumber ==  guessGame.player2.number){
				isPlayer2Won = true;
			}

			if(randomNumber ==  guessGame.player3.number){
				isPlayer3Won = true;
			}




			if(isPlayer1Won){
				System.out.println("Congratualtions, " + guessGame.player1.name +" , You have won the game");
			}

			if(isPlayer2Won){
				System.out.println("Congratualtions, " + guessGame.player2.name +" , You have won the game");
			}

			if(isPlayer3Won){
				System.out.println("Congratualtions, " + guessGame.player3.name +" , You have won the game");
			}


			if(!isPlayer1Won && !isPlayer2Won && !isPlayer3Won){
				System.out.println("Sorry nobody won, please try again all of you !");

			}

		}
			
	}
		
}

class GuessGame{

	Player player1, player2, player3;

	int startGame(){
		int random   = (int)(Math.random()*9);

		return random;
	}
	
}

class Player{
	int number;
	String name;

	Player(int num, String name){
		this.name = name;
		number  = num;
	}
}

