package lesson1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число");
        int a = sc.nextInt();
        sc.close();
        int i = 0;
        while (true){

            a = a/10;
            i++;
            if (a==0){
                break;
            }}
            System.out.println("Введено число из  "+i +"цифр");

        }

    }


