package CarManagementSystem;

import java.util.Scanner;
import java.lang.*;

interface utility{
	public void get_details();
	public void set_details();
}


public class Main {
	
	 static void main_manu() {
		System.out.println();
		System.out.println("----------------**WELCOME TO SHOWROOM MANAMENT SYSTEM**--------------");
		System.out.println();
		System.out.println("-----------------**ENTER YOUR CHOICE**------------------");
		System.out.println();
		System.out.println("1] ADD SHOWROOM \t \t \t 2]. ADD EMPLOYEE \t \t \t 3]. ADD CARS");
		System.out.println();
		System.out.println("4].GET SHOWROOMS \t \t \t 5]. GET EMPLOTYEE \t \t \t 6]. GET CARS");
		
	 }
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		Showroom showroom[] = new Showroom[5];
		Employee employee[] = new Employee[5];
		Cars cars[]= new Cars[5];
		int car_count= 0;
		int showroom_count=0;
		int employee_count=0;
		int choice = 100;
		
		while (choice!=0) {
			
			main_manu();
			choice=sc.nextInt();
			
			while (choice!=9 && choice!= 0) {
				switch (choice) {
				case 1:
					showroom[showroom_count]=new Showroom();
					showroom[showroom_count].set_details();
					showroom_count++;
					System.out.println();
					System.out.println("1]. ADD TO NEW SHOWROOM");
					System.out.println("Go Back To Manu");
					choice=sc.nextInt();
					break;
					
				case 2:
					employee[employee_count]=new Employee();
					employee[employee_count].set_details();
					employee_count++;
					System.out.println();
					System.out.println("2]. ADD TO NEW EMPLOYEE");
					System.out.println("Go  Back To Manu");
					choice=sc.nextInt();
					break;
					
				case 3:
					cars[car_count]=new Cars();
					cars[car_count].set_details();
					car_count++;
					System.out.println();
					System.out.println("3].ADD NEW CAR");
					System.out.println("9].GO BACK TO MAIN MENU");
					choice=sc.nextInt();
					break;
					
				case 4:
					for (int i=0; i<showroom_count; i++) {
						showroom[i].get_details();
						System.out.println();
						System.out.println();	
					}
					System.out.println();
					System.out.println("9].GO BACK TO MAIN MENU");
					System.out.println("0].EXIT");
					choice = sc.nextInt();
					break;
					
				case 5:
                    for (int i = 0; i < employee_count; i++) {
                        employee[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                case 6:
                    for (int i = 0; i < car_count; i++) {
                        cars[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                default:
                    System.out.println("ENTER VALID CHOICE: ");
                    break;
				}
				
			}
		}
		
		
	}
	}
