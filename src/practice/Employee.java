package practice;

import java.util.*;
import service.*;

import util.ScannerValidate;

public class Employee {

	public static void main(String args[]) {
		boolean quit = true;
		
		EmployeeEntity[] array = new EmployeeEntity[100];
		do {
			System.out.println("1>enter detrails\n2>based on employee name\n3>display salary\n4>delete\n5>Exit");
			int choice = ScannerValidate.getValidInt();
			switch (choice) {
			case 1:
				Service.display(Service.add(array));
				break;
			case 2:
				Service.sort(array);
				break;
			case 3:
				Service.display(Service.sortSalary(array), 1000);
				break;
			case 4:
				Service.display(Service.delete(array));
				break;
			case 5:
				quit = false;
				break;
			default:
				System.out.println("invalied choice");

			}

		} while (quit);

	}

}
