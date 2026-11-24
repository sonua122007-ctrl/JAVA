import java.util.Scanner;
enum Department {
  CSE, ISE, ECE, MECH
}
public class DepartmentDemo {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Department (CSE/ISE/ECE/MECH): ");
  String input = sc.nextLine();
  try {
   Department dept = Department.valueOf(input.toUpperCase());
   System.out.println("Selected Department: " + dept);
  }
  catch (IllegalArgumentException e) {
   System.out.println("Invalid Department Name!");
  }
  sc.close();
 }
}