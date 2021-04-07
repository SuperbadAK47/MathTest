import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		
		int score = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = input.next();
		System.out.println("How old are you:");
		int age = input.nextInt();
		System.out.println("Alright lets get started " + name + ". You are " + age + " years old. \nI hope you enjoy the quiz.");
		System.out.println("Question #1: What is your age + 27?");
		int a1 = input.nextInt();
		
		if (a1 == age + 27) {
			System.out.println("Good job boi");
			score += 1;
		} else {
			System.out.println("You got it wrong kid.");
		}
			System.out.println("Question #2:  If c = a + b and a = 202 and b = 32 what is c?");
			int a2 = input.nextInt();
			
			if (a2 == 234) {
				System.out.println("Nice job you got it right.");
				score += 1;
			} else {
				System.out.println("Wrong.");
			}
			System.out.println("What is the next number in the sequence; 1,4,16,64...");
			int a3 = input.nextInt();
			
			if (a3 == 256)  {
				System.out.println("You got it right.");
				score += 1;
			} else {
				System.out.println("Wrong.");
			}
			System.out.println("How many pennies are in $50.24");
			int a4 = input.nextInt();
			
			if (a4 == 5024) {
				System.out.println("Congrats you got it right.");
				score += 1;
			} else {
				System.out.println("Wrong.");
			}
			
			System.out.println("Simplify (15 * 2 - 6)/4");
			int a5 = input.nextInt();
			
			if (a5 == 6) {
				System.out.println("Nice you got it right.");
				score += 1;
			} else {
				System.out.println("Wrong.");
			}
			System.out.println("What is 3 and 1/2 minus 2 and 1/2");
			int a6 = input.nextInt();
			
			if (a6 == 1) {
				System.out.println("Right.");
				score += 1;
			} else {
				System.out.println("Wrong.");
			}
			
			System.out.println("Which part of the fraction is the denominator? (bottom or top?)");
			String a7 = input.next();
			
			if (a7.equals("bottom")) {
				System.out.println("Correcto!");
				score += 1;
			} else {
				System.out.println("Wrong.");
			}
			System.out.println("What is 34 * 20?");
			int a8 = input.nextInt();
			
			if (a8 == 680) {
				System.out.println("Nice.");
				score += 1;
			} else {
				System.out.println("Wrong.");
			}
			
			System.out.println("How many sides does a octagon have?");
			int a9 = input.nextInt();
			
			if (a9 == 8) {
				System.out.println("You are correct!");
				score += 1;
			} else 
				System.out.println("Wrong.");
			
			System.out.println("1.7 * 10000");
			int a10 = input.nextInt();
			
			if (a10 == 17000) {
				System.out.println("Your correct.");
				score += 1;
			} else {
				System.out.println("Wrong :/");
			}
			
			if (score == 10) {
				System.out.println("You got a perfect score on the test.");
			} else if (score <= 9 && score >= 7) {
				System.out.println("You did okay on the test.");
			} else if (score < 7) {
				System.out.println("You didn't do to well on the test :/");
			}
			System.out.println("Your score is: " + score + " out of 10 points.");
			System.out.println("Thank you for playing " + name + ".");
	}

}
