import java.util.Scanner;
public class OneDimensionalArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char gender = s.next().charAt(0);

        System.out.print("Enter age: ");
        int age = s.nextInt();

        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage");
            }
        } 
        else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage");
            }
        } 
        else {
            System.out.println("Invalid gender input");
        }

        s.close();
    }
}
