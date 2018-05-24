package com.virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		
		VirtualPet Kaiju = new VirtualPet(5, 5, 5);
		boolean gameIsOn = true;
		// Create pet here
		System.out.println("Congradulations on your new pet!");
		System.out.println("What would you like to name it?");
		String name = input.nextLine();
		VirtualPet.petName(name);
		System.out.println(name + " gets hungry, tired, and grumpy so it's up to you to keep " + name + " happy");
		// System.out.println an introduction

		while (gameIsOn == true) {
			
			// Print menu w/ System.out.println()
			System.out.println("Your pets stats and command");
			System.out.println(name);
			System.out.println("Hunger: "+ VirtualPet.hunger);
			System.out.println("Energy: " + VirtualPet.energy);
			System.out.println("Temperament: "+ VirtualPet.happy);
			
			
			
			
			System.out.println("Press one to feed your pet");
			System.out.println("Press two to play with your pet");
			System.out.println("Press three to put your pet to bed");
			System.out.println("Press Q to exit the game");
			// Get user input with input.nextInt() or input.nextLine()
			String menuOption = input.nextLine();
			
			
			// Check input with if/else_if/else, and call individual method
			if(menuOption.equals("1")) {  
				VirtualPet.getFeed();
				gameIsOn = true;
				
			}
			
			if(menuOption.equals("2")) {
			 VirtualPet.getPlay();
				gameIsOn = true;
				
			}
			
			if(menuOption.equals("3")) { 
				VirtualPet.getNap();
				gameIsOn = true;				
				
			}
			
			if(menuOption.equals("Q")) {
				
				gameIsOn = false;
				System.out.println("Thanks for playing");
				break;
			}
						
			VirtualPet.tick();
			gameIsOn = VirtualPet.death();
			
		}

	}

	
		// TODO Auto-generated method stub
		
	}




//int randomNum = ThreadLocalRandom.current().nextInt(min, max);
