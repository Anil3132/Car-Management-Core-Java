package CarManagementSystem;

import java.security.PublicKey;
import java.util.Scanner;

public class Cars extends Showroom implements utility  {
	String car_name;
	String car_colour;
	String car_fuel_type;
	int car_price;
	String car_Type;
	String car_transmission;
	
	public void get_details() {
		System.out.println("Name: "+car_name);
		System.out.println("Car Colour: "+ car_colour);
		System.out.println("Fuel Type: " + car_fuel_type);		
		System.out.println("Car Type: " + car_Type);
		System.out.println("TRANSMISSION: " + car_transmission);
		System.out.println("CAR PRICE: "+ car_price);
		
	}
	
	public void set_details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------- ENTER CAR DETAILS -------------");
		System.out.println();
		System.out.println(("CAR NAME: "));
		car_name = sc.nextLine();
		System.out.println(("CAR COLOUR: "));
		car_colour = sc.nextLine();
		System.out.println(("CAR FUEL TYPE(PETROL/DIESEL): "));
		car_fuel_type = sc.nextLine();
		System.out.print("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_Type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_car_in_stock++;
		
	}
	

}
