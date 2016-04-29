import java.util.Scanner; 

public class Cointoss {


	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number.");
		int FLIPS = userInput.nextInt();
		int randomNumber = (int) (Math.random()*FLIPS)+1;
		while (FLIPS!=randomNumber)
			{
				if (FLIPS>randomNumber)
					{
						  
					}
			}
		
		
	}

}
