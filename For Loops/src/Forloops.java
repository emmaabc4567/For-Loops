import java.util.Scanner; 

public class Forloops 
{

	public static void main(String[] args)	
	{
		for (int i=1; i<=5; i++)
		{
			System.out.println("I love Donuts!");
		}
		for (int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
		for (int i=5; i>=1; i--)
		{
			System.out.println(i);
		}
		for (int i=5; i<=100; i=i+5)
		{
			System.out.println(i);
		}
		int sum=0;
		for (int i=5; i<=100; i=i+5)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Pick a low number.");
		int lownumber = userInput.nextInt();
		System.out.println("Pick a high number.");
		int highnumber = userInput.nextInt();
		int answer=0;
		for (int i=lownumber; i<=highnumber; i++)
		{
			System.out.println(i);
			answer=answer+i;
		}
		System.out.println(answer);
		System.out.println("*********");
		for (int i=1; i<=7; i++)
		{
			System.out.println("*       *");
		}
		System.out.println("*********");
		for (int i=9+1; i<=51-1; i=i+11-1)
		{
			System.out.println(i);
		}
	}

}
