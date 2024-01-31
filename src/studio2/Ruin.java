package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of money you start with");
		int startAmount = in.nextInt();
		System.out.println("Enter the win probability");
		double winChance = in.nextDouble();
		System.out.println("Enter the win limit");
		double winLimit = in.nextDouble();
		
		System.out.println("What number of days are you simulating?");
		int totalSimulations = in.nextInt();
		int ruin = 0;
		int success = 0;
		
		for (int i = 0; i < totalSimulations; i++)  {
		
		while (startAmount > 0 && startAmount < winLimit) {
			double num = Math.random();
			int wins = 0;
			int lose = 0;
			if (winChance < num) {
				startAmount--;
				lose++;
				}
				else {
					startAmount++;
					wins++;
				}
			if (wins > lose) {
				System.out.println("SIMULATION:" + i + " " + wins + "WIN"); 
				int success ++ ;
			}
			else {
				System.out.println("SIMULATION:" + i + " " + lose + "LOSE");
				int ruin ++; 
			}
					
		}
	
		}
		
		}

	}


