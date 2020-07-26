package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;


import entities.HourContract;
import entities.Worker;
import enums.Department;
import enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Worker worker = new Worker();
		System.out.println("*Enter Worker Data*");
		System.out.print("Name: ");
		worker.setName(sc.nextLine());
		System.out.print("department's (RH/MARKETING/IT/TAX/FINANCE/SALE): ");
		worker.setDepartment(Department.valueOf(sc.nextLine())); 
		System.out.print("Level (JUNIOR/MID_LEVEL/SENIOR): ");
		worker.setLevel(WorkerLevel.valueOf(sc.nextLine()));
		System.out.print("Base salary: R$");
		worker.setBaseSalary(sc.nextDouble());
			
		System.out.print("How many contracts to this worker? ");
		int quantity = sc.nextInt();
		for (int i = 1; i<=quantity; i++) {
			HourContract contract = new HourContract();
			System.out.println("---------------------------------");
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYY): ");
			contract.setDate(sdf.parse(sc.next()));
			System.out.print("Value per hour: ");
			contract.setValuePerHour(sc.nextDouble());
			System.out.print("Duration (hours): ");
			contract.setHour(sc.nextInt());
			worker.addContract(contract);
		}
		System.out.println("-----------------------------------------------------");
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("-----------------------------------------------------");
		System.out.println("*Worker*");
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getDescription());
		System.out.println("Level: " + worker.getLevel().getDescription());
		System.out.println("Income for " + monthAndYear + ": R$" + String.format("%.2f",worker.income(year, month)));
		
		sc.close();
	}
}
