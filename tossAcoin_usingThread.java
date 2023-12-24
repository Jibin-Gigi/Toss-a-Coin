import java.util.Random;
import java.util.Scanner;

public class tossAcoin_usingThread {
    public static void main(String[] args) {
        tossThread thread=new tossThread();
        thread.start();
    }
}

class tossThread extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter y to toss");
        char choice=sc.next().charAt(0);

        while(choice=='y' || choice=='Y'){
            
            int turn=new Random().nextInt(2)+1;
            if(turn==1){
                System.out.println("Head");
            }
            else{
                System.out.println("Tail");
            }
            System.out.println("Do you want to toss again (y/n)");
            choice=sc.next().charAt(0);
            try {
                tossThread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        sc.close();
    }
}

