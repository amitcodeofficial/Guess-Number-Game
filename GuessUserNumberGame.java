package com.bridgelab.Test;

import java.util.Scanner;

public class GuessUserNumberGame {

	public static void guessNumber() {
		Scanner scan = new Scanner(System.in);
		int low = 0;
		int high = 100;
		int mid = (low + high) / 2;
		String playerInput;

		do {
			System.out.println("\nIs this your number ->| "+ mid +" |<- type 'yes' else if your numb is high type 'high' or else 'low' =");
			playerInput=scan.next();

			if(playerInput.equals("yes")) {
				break;
			}

			if(playerInput.equals("high")) {
				low = mid;
				mid = (low + high) / 2;
			}else if(playerInput.equals("low")){
				high = mid;
				low = mid / 2;
				mid = (low + high) / 2;
			}
			
		}while(playerInput != "yes");

	}

	public static void main(String[] args) {
		System.out.println("Guess Number between 0-100");
		System.out.println("Rules for Game:");
		System.out.println("To interact With your game: Follow these steps to play");
		System.out.println("-> Please type 'yes' if your number matches");
		System.out.println("-> Or type 'high' if your number is higher than the given number");
		System.out.println("-> Or type 'low' if your number is lower than the given number");

		guessNumber();
	}

}
