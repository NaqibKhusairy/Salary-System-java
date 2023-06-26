/*
Question 2
Name : Putera Naqib Khusairi Bin Asri
Registration No : 10DDT21F1021
*/
import java.util.Scanner;												//import scanner class
class Person															//class Person
{
	String name="";														//variable name
	double salary=0;													//variable salary
}
class Programmer extends Person											//class Programmer extends from Person 
{
	String designation = "Profesional Programmer";						//variable designation
	public void display()												//method display
	{
		Scanner Q2 = new Scanner(System.in);							//use scanner class
		System.out.println("\n\n---------------------------------");	//print
		System.out.print("NAME = ");									//print
		name=Q2.nextLine();												//get input name from user
		System.out.print("SALARY = ");									//print
		salary=Q2.nextDouble();											//get input salary from user
		System.out.println("---------------------------------\n");		//print
		System.out.println("NAME : "+name.toUpperCase());				//print
		System.out.println("SALARY : RM "+salary);						//print
		System.out.println("DESIGNATION : "+designation.toUpperCase());	//print
	}
}
public class Inheritance												//public class for calling method
{
	public static void main (String args[])								//main method
	{
		Programmer P = new Programmer();								//create object p = new Programmer
		P.display();													//calling method display in P
	}
}



