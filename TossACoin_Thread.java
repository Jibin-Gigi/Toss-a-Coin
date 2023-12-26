import java.util.Random;
import java.util.Scanner;

public class TossACoin_Thread {
    public static void main(String[] args) {
        TossThread thread = new TossThread();
        thread.start();
    }
}

class TossThread extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 'y' to toss");
            char choice = sc.next().charAt(0);

            while (choice == 'y' || choice == 'Y') {
                int turn = new Random().nextInt(2) + 1;

                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                if (turn == 1) {
                    System.out.println("Head");
                } else {
                    System.out.println("Tail");
                }
                System.out.println("Do you want to toss again? (y/n)");
                choice = sc.next().charAt(0);

                
            }
        } finally {
            sc.close();
        }
    }
}
