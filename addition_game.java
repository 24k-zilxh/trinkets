import java.util.Scanner;

class addition_game {
    public static void main(String[] args) {
        int c = 0;
        while (true) {
            int x = (int)(Math.random() * 26);
            int y = (int)(Math.random() * 10);

            Scanner sc = new Scanner(System.in);
            System.out.printf("%d + %d = ", x, y);
            int a = sc.nextInt();

            if (a == 6667){
                System.out.printf("game over, your score is %d", c);
                sc.close();
                System.exit(0);
            }

            else if (x+y == a) {
                System.out.println("Correct answer");
                c++;
            }

            else {System.out.println("Wrong answer");}

            sc.nextLine();          

        }
    }
}