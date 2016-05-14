package lesson;

import java.util.Scanner;
/**
 * Created by ДОМ on 15.05.2016.
 */
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Exercise №2");
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int a = sr.nextInt();
        sr.close();
        switch (a){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Ku-Ku");
        }
    }
}
