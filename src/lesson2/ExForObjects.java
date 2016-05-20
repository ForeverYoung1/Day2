package lesson2;

import java.util.Scanner;

/**
 * Created by ДОМ on 19.05.2016.
 */
public class ExForObjects {
    public static void main(String[] args) {
double a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input F"+" Input mem");
        a = sc.nextDouble();
        b = sc.nextInt();
        sc.close();
        Ex1 ex1 = new Ex1();
        ex1.setName("ASUS");
        ex1.setfCpu(a);
        ex1.setMem(b);
        ex1.infoname();
        ex1.infoCpu();
        ex1.infoMem();

    }
}
