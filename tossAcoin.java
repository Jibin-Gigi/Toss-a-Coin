import java.util.Random;
import java.util.Scanner;

public class tossAcoin {
    public static void main(String[] args) {
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

        }

        sc.close();
    }
}
