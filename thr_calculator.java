// first actual program in Java, a thorough calculator
import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner chx = new Scanner(System.in);
        Scanner chxb = new Scanner(System.in);
        
        System.out.print("First # > ");
        Double tc1 = chx.nextDouble();
        
        System.out.print("Second # > ");
        Double tc2 = chxb.nextDouble();
        

        System.out.println("Added - " + (tc1+tc2));
        System.out.println("Subtracted - " + (tc1-tc2));
        System.out.println("Multiplied - " + (tc1*tc2));
        System.out.println("Divided - " + (tc1/tc2));
        System.out.println("Remainder - " + (tc1%tc2));
        System.out.println("add 1 to int1 - " + (tc1++));
        System.out.println("add 1 to int2 - " + (tc2++));
        System.out.println("remove 1 from int1 - " + (--tc1));
        System.out.println("remove 1 from int2 - " + (--tc2));


        chx.close();
        chxb.close();
    
    }
}