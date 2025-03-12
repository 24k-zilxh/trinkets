import java.util.Scanner;

public class sum_game {
    public static void main(String[] args) {

        int x = (int)(Math.random() * 11);
        int nums[] = {1,8,4,7,x};
        
        int sum = 0;
         
        for(int c = 0; c < nums.length; c++) {sum += nums[c];}

        Scanner sc = new Scanner(System.in);
        System.out.println("There is a list with numbers 1,8,4,7 (sum 20) and a random number from 1-10");
        System.out.print("What do you think the sum is >> ");
        int gs = sc.nextInt();
        sc.close();

        if (gs == sum) {
            System.out.printf("You got it correct, the answer was %d", sum);
            System.exit(0);
        }
        else if (gs != sum) {System.out.printf("\nWrong answer, answer was %d ", sum);}

    
        }
    }

