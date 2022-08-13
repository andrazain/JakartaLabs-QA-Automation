package com.javaprogram;

import java.util.Scanner;

public class MainTask2 {
	
	//This main class for Task 1
	//objective :
	//create a simple calculator with OOP, if the input is String then throw an error.
	
	public static void main (String args[]){
		
		//declare the operation
		Operation operation = new Operation();
		
        String check ="y";
        
        try {
			while(check.equals("y")){

				System.out.println("");

			    Scanner inputMenu = new Scanner(System.in);
			    
			    System.out.println("----- Choose Operation -----");
			    System.out.println("");
			    System.out.println("1. Addition");
			    System.out.println("2. Subtraction");
			    System.out.println("3. Multiplication");
			    System.out.println("4. Division");
			    System.out.println("5. E1xit");
			    System.out.println("");
			    System.out.print("Insert Menu : ");
			    
			    int choose = inputMenu.nextInt();
			    
			    switch(choose){
			        case 1 :{

						operation.addition(0, 0);
						break;
						
			        }
			        case 2 :{

						operation.subtraction(0, 0);
						break;
						
			        }
			        case 3 :{

						operation.multiplication(0, 0);
						break;
						
			        }
			        case 4 :{

						operation.division(0, 0);
						break;
						
			        }
			        case 5 :{
			            System.exit(5);
			            break;
			        }
			    }
			    
			    System.out.println("");
			    System.out.println("Repeat Menu ? [y/t]");
			    System.out.print("[y/t] : ");
			    check = inputMenu.next();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("");
			System.out.println("Menu can be input with number 1..4");
		}
    }

}
