package lesson;
import java.util.Scanner;
/**
 * Created by ДОМ on 15.05.2016.
 */

public class Exercise1 {
    public static void main(String[] args) {
        int b =20, c = 30;
        System.out.print("Exercise №1 - ");
        System.out.println("Scanner");
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT");
        int a = sc.nextInt();
        sc.close();
        if(a<b){
            System.out.println("little");
            return;
        } else  if (a>c){
            System.out.println("BIG");
            return;}
        else{
            System.out.println("CONGRATS!!! a == NORMAL");
        }}}