import java.util.Scanner;
import java.sql.*;

public class Main 
{
	public static void main(String[] args) 
	{	
		int ID;
		Scanner input = new Scanner(System.in);
		//passing ID
		System.out.println("Enter employee's ID: ");
		Employee e = new Employee(ID = input.nextInt());
		e.getEmployee();
		//upgrade aligning
		displayMenu();
		e.printEmployee();
		printSign(185);
	}
	

	public static void displayMenu() 
	{
		printSign(185);
		System.out.println("Employees ");
		printSign(185);
		System.out.print("ID\t First Name\t Last Name\t Age\t Title\t\t Salary\t\t  Status\t "
				+ "Supervisor ID\t Bonus\t Department\t Insurance\t Hiredate\t Phone\t \n");
		printSign(185);
	}
	private static void printSign(int sign) 
	{
		for(int i = 1; i <= sign; i++) 
		{
			System.out.print("~");
		}
		System.out.println("\n");
	}
}
