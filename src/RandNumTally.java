import java.util.Random;
import java.util.Scanner;
public class RandNumTally {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("How many sides should the dice have?");
        int diceSides = sc.nextInt();
        System.out.println("How many times do you want to roll the dice?");
        int diceRollNum = sc.nextInt();

        for (int i = 1; i <= diceRollNum; i++) {
            System.out.println(rd.nextInt(1,diceSides));
        }
    }
}
