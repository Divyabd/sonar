package service;

import practice.EmployeeEntity;
import util.ScannerValidate;

public class Service {

	public static EmployeeEntity[] add(EmployeeEntity[] array) {
		int pos = 0;
		while (true) {
			System.out.println("enter  Id");
			int id = ScannerValidate.getValidInt();
			boolean val = true;
			for (EmployeeEntity obj : array) {
				if (obj == null || array == null) {
					break;
				}
				if (obj.getId() == id) {
					val = false;
					System.out.println("sorry this id already exits ");
					return array;
				}
			}
			System.out.println("enter name");
			ScannerValidate.scanner.nextLine();
			String name = ScannerValidate.getString();
			System.out.println("enter designation");
			String des = ScannerValidate.getString();
			System.out.println("enter salry");
			double salary = ScannerValidate.getDouble();
			array[pos] = (new EmployeeEntity(id, name, des, salary));
			System.out.println("do you want to add 1>yes 2> no");
			int n = ScannerValidate.getValidInt();
			if (n == 1) {
				pos++;
			} else {
				break;
			}

		}
		return array;
	}

	public static EmployeeEntity[] delete(EmployeeEntity[] array) {
		System.out.println("enter id");
		int id = ScannerValidate.getValidInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
			} else if (array[i].getId() == id) {
				array[i] = null;
				break;

			}

		}
		return array;
	}

	public static EmployeeEntity[] sortSalary(EmployeeEntity[] array) {
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == null || array[i] == null) {
					break;
				} else if (array[i].getSalary() < array[j].getSalary()) {
					EmployeeEntity temp = array[j];
					array[j] = array[i];
					array[i] = temp;

				}

			}
		}
		return array;
	}

	public static void sort(EmployeeEntity[] array) {
		System.out.println("Enter the  name you want to search");
		ScannerValidate.scanner.nextLine();
		String name = ScannerValidate.getString();
		for (int j = 0; j < array.length; j++) {

			if (array == null || array[j] == null) {

			} else if (array[j].getName().compareTo(name) == 0) {

				System.out.println("" + array[j].getId() + "\t\t" + array[j].getName() + "\t\t" + array[j].getDesg()
						+ "\t\t" + array[j].getSalary());
			}

		}

	}

	public static void display(EmployeeEntity[] array) {
		System.out.println("Id  " + "   Name    " + "        des  " + "   salary");
		System.out.println("===================================================");

		for (EmployeeEntity obj : array) {
			if (obj == null || array == null) {

			} else {
				System.out.println(
						"" + obj.getId() + "\t\t" + obj.getName() + "\t\t" + obj.getDesg() + "\t\t" + obj.getSalary());
			}
		}
		System.out.println("==================================================");
		System.out.println("\n");

	}

	public static void display(EmployeeEntity[] array, int salary) {
		System.out.println("Id  " + "   Name    " + "        des  " + "   salary");
		System.out.println("===================================================");

		for (EmployeeEntity obj : array) {
			if (obj == null || array == null) {

			} else if (obj.getSalary() > salary) {
				System.out.println(
						"" + obj.getId() + "\t\t" + obj.getName() + "\t\t" + obj.getDesg() + "\t\t" + obj.getSalary());
			}
		}
		System.out.println("==================================================");
		System.out.println("\n");

	}

}
