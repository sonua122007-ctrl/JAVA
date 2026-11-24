import java.util.Scanner;
public class MarksDemo {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks in Subject 1: ");
    String s1 = sc.nextLine();
    System.out.print("Enter marks in Subject 2: ");
    String s2 = sc.nextLine();
    System.out.print("Enter marks in Subject 3: ");
    String s3 = sc.nextLine();
    Integer mark1 = Integer.valueOf(s1);
    Integer mark2 = Integer.valueOf(s2);
    Integer mark3 = Integer.valueOf(s3);
    int total = mark1 + mark2 + mark3;
    double average = total / 3.0;
    System.out.println("\n========== MARKS DETAILS ==========");
    System.out.println("Subject 1 Marks: " + mark1);
    System.out.println("Subject 2 Marks: " + mark2);
    System.out.println("Subject 3 Marks: " + mark3);
    System.out.println("Total Marks: " + total);
    System.out.println("Average Marks : " + average);
    sc.close();
  }
}