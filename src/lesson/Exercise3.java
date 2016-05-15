package lesson;
import java.util.Scanner;
/**
 * Created by ДОМ on 15.05.2016.
 */
public class Exercise3 {
    public static void main(String [] args) {

        int month_days[];
int i;
        month_days = new int[12];

        month_days[0] = 31;

        month_days[1] = 28;

        month_days[2] = 31;

        month_days[3] = 30;

        month_days[4] = 31;

        month_days[5] = 30;

        month_days[6] = 31;

        month_days[7] = 31;

        month_days[8] = 30;

        month_days[9] = 31;

        month_days[10] = 30;

        month_days[11] = 31;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input month namber");

        i = sc.nextInt();
        sc.close();

        System.out.println("this month has  " + month_days[i] + " days.");

        }

    }


