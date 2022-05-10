package com.bridgelab.Test;

import java.util.Scanner;

public class GuessUserNumberGame {
	static Scanner scan = new Scanner(System.in);
	static int low = 0;
	static int high = 100;
	static int mid = (low + high) / 2;
	static String playerInput;

	public static void guessNumber() {
		do {
			System.out.println("\nIs this your numb "+ mid +" type 'yes' else if your numb is high type 'high' or else 'low' =");
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
		}while(playerInput!= "yes");

	}

	public static void main(String[] args) {
		System.out.println("Guess Number between 0-100");
		System.out.println("Rules for Game:");
		System.out.println("To interact With your game: \n Please type 'yes' if your number matches \n Or type 'high' if your number is higher than the given number \n Or type 'low' if your number is lower than the given number");
		guessNumber();
	}

}
