package input.controller;

import java.util.Scanner;

public class InputController
{
 //Declaration scetion
 //All class data members are declared private
	
 private Scanner myInput;
 
 //Constructors go here
 
 public InputController()
 {
	 myInput = new Scanner(System.in);
 }
 
 //Methods
 
 public void start()
 {
	questions();
	questions();
 }
 	private void questions()
 	{
 		System.out.println("Who are you gonna vote for in 2016?");
 		 String input;
 		 input = myInput.next();
 		 myInput.nextLine();
 		 System.out.println("Your vote is " + input + ". If you didnt vote for Deez Nutz, you will sorry!!");
 		 System.out.println("Did you spell Deez Nutz wrong? Please type it again");
 		 String fullName = myInput.nextLine();
 		 System.out.println("Your actually vote is: " + fullName);
 		 System.out.println("Your phone number please?");
 		 int myAge = myInput.nextInt();
 		 System.out.println("Wow " + fullName + " I will give you a call at " + myAge + " sometime!");
 	}
}
