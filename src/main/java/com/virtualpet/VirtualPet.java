package com.virtualpet;

public class VirtualPet {
	public static int hunger;
	public static int energy;
	public static int happy ;
	public static String name;

	public VirtualPet(int hunger, int energy, int happy) { 
		
		this.hunger = hunger;
		this.energy = energy;
		this.happy = happy;
		
	}
		
	public static  void getFeed() {
			
			hunger -= 3;
			energy += 1;
			happy += 1;
			System.out.println(name + " has been fed");
		System.out.println("hunger: " + hunger + " energy: " + energy + " happy: " + happy);	
		}	
		
		
	public static void getPlay() {
			
			hunger += 2;
			energy -= 1;
			happy += 3;
			System.out.println(name + " plays with you");
			System.out.println("hunger: " + hunger + " energy: " + energy + " happy: " + happy);	
			
		}
	public static void getNap() {
	
		hunger += 2;
		energy += 5;
		happy -= 1;
		System.out.println(name + " has taken a nap");
		System.out.println("hunger: " + hunger + " energy: " + energy + " happy: " + happy);
}
	
	public static String petName(String inputName) { 
		
		name = inputName;
		return name;
		
	}
	
	public static void tick( ) {
		
		hunger += 1;
		energy -= 1;
		happy -= 1;
		System.out.println("Tick tock, tick tock,");
		System.out.println("hunger: " + hunger + " energy: " + energy + " happy: " + happy);
		
	}
	
	public static boolean death(){
		if (hunger > 15) {
			System.out.println( name +" has starved");
			System.out.println("Game Over");
			return false;
			
		}
		if (energy > 15) {
			System.out.println(name +" sufferd a simultaneous brain anurism and cardiac arrest");
			System.out.println("Game Over");
		return false;
		}
		if(happy < 1) {
			
			System.out.println(name + " has jumped off a cliff.");
			System.out.println("Game Over");
			return false;
		}
		return true;
		
		
		
	}
	
//	public int changeHunger() {   }
//	
//	public int getHunger() {  return hunger; }
//	
//	public int getEnergy() {  return energy; }
//	
//	public int getHappy() {  return happy; }
//	

}
 