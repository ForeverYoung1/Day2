package day4;

import java.util.Scanner;

/**
 * Created by ДОМ on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
      //  Monitor monitor = new Monitor();
        Cpu cpu = new Cpu();
        double cpuf; // переменная - частота процессора
        double cpup; //  производительность процессора
        double cpum; // множитель процессора
        Hdd hdd = new Hdd();
        double hddv;  // объём памяти HDD
        String hddt;  // тип HDD или SSD
        String hddn; // название , брэнд
        double hdds; // скорость вращения шпинделя.
       Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите последовательно частоту; производительность; множитель");
        cpuf = scanner.nextDouble();
        cpup = scanner.nextDouble();
        cpum = scanner.nextDouble();
//scanner.close();

        cpu.setCpuFrequensy(cpuf);
        cpu.setCpuPerfomance(cpup);
        cpu.setCpuMultiplier(cpum);
        cpu.infoCpuF();
        cpu.infoCpuP();
        cpu.infoM();

    Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Введите тип диска;  введите брэнд производителя");
        hddt = scanner1.next();
        hddn = scanner1.next();
        scanner.close();
        scanner1.close();
        hdd.setHddTupe(hddt);
        hdd.setHddName(hddn);
        hdd.infoHddT();
        hdd.infoHddN();


}}
