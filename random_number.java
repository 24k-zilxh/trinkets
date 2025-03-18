import java.util.Scanner;

public class random_number { 
    public static void main(String[] args) {
        
        while (true) {
            int x = (int)(Math.random() * 11);
            
            Scanner sc = new Scanner(System.in);
            System.out.print("\n\nWhat is the number >> ");
            int y = sc.nextInt();

            if (x == y) {
                System.out.printf("%d is correct", x);
            }
            else {
                System.out.printf("%d is wrong, %d is correct", y, x);
            }
            sc.nextLine();
            sc.close();
        }
    }
}
