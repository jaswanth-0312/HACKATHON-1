import java.util.Scanner;
class WaterBill{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double water;
int bill;
System.out.print("Enter water consumption: ");
water = sc.nextDouble();
if (water <= 500) {
bill = 100;
}
else {
bill = 200;
}
System.out.println("Water Bill = Rs." + bill);
}
}