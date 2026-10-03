import java.util.Scanner;
public class WaterUsage {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int members; 
double water;
int houseNo;
char status;
System.out.print("Enter number of family members:");
members = sc.nextInt();
System.out.print("Enter water consumed:");
water = sc.nextDouble();
System.out.println("Enter house number:");
houseNo = sc.nextInt();
System.out.print("Enter water usage status: ");
status = sc.next().charAt(0);
System.out.println("Family Members: " + members);
System.out.println("Water Consumed: " + water);
System.out.println("House Number: " + houseNo);
System.out.println("Usage Status: " + status);
}
}






