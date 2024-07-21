package CarManagementSystem;

import java.util.Scanner;
import java.sql.SQLOutput;

public class Showroom implements utility {
	String showroom_name;
	String showroom_address;
	int total_employee;
	int total_car_in_stock;
	String manager_name;

	public void get_details() {
		System.out.println("Showroom Name =" + showroom_name);
		System.out.println("Showroom Address =" + showroom_address);
		System.out.println("Manager Name =" + manager_name);
		System.out.println("Total Employee =" + total_employee);
		System.out.println("Total Car in Stock =" + total_car_in_stock);

	}
	
	
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------**ENTER SHOWROOM DETAILS**-------");
		System.out.println();
		System.out.print("SHOWROOM NAME: ");
		showroom_name = sc.nextLine();
		System.out.println("SHOWROOM ADDRESS: ");
		showroom_address = sc.nextLine();
		System.out.println(" MANAGER NAME: ");
		manager_name = sc.nextLine();
		System.out.println("TOTAL EMPLOYEE: ");
		total_employee = sc.nextInt();
		System.out.println("TOTAL CAR IN STOCK: ");
		total_car_in_stock = sc.nextInt();

	}
}
