package day4;

import java.util.Scanner;

/**
 * Created by ДОМ on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
      //  Monitor monitor = new Monitor();
        Cpu cpu = new Cpu(); //инициализация объекта Cpu
        double cpuf; // переменная - частота процессора
        double cpup; //  производительность процессора
        double cpum; // множитель процессора
        Hdd hdd = new Hdd();  //инициализация объекта Hdd
        double hddv;  // объём памяти HDD
        String hddt;  // тип HDD или SSD
        String hddn; // название , брэнд
        int hdds; // скорость вращения шпинделя.
        Monitor monitor = new Monitor();  //инициализация объекта Monitor
        String monN;
        int monRx;
       int monRy;
       Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите последовательно частоту; производительность; множитель");
        cpuf = scanner.nextDouble();
        cpup = scanner.nextDouble();
        cpum = scanner.nextDouble();

        cpu.setCpuFrequensy(cpuf);
        cpu.setCpuPerfomance(cpup);
        cpu.setCpuMultiplier(cpum);

        System.out.println(" Введите тип диска;  введите брэнд производителя; объём памяти;  скорость вращения шпинделя" );
        hddt = scanner.next();
        hddn = scanner.next();
        hddv = scanner.nextDouble();
        hdds = scanner.nextInt();
        System.out.println("Введите название монитора;  Введите разрешение по горизонтали и по верт ");
        monN = scanner.next();
        monRx = scanner.nextInt();
        monRy = scanner.nextInt();

        monitor.setNameMonitor(monN);
        monitor.setMonResolutionX(monRx);
        monitor.setMonResolutionY(monRy);
        scanner.close();
         cpu.infoCpuF();
        cpu.infoCpuP();
        cpu.infoM();
        hdd.setHddTupe(hddt);
        hdd.setHddName(hddn);
        hdd.setHddVolume(hddv);
        hdd.setHddSpeed(hdds);
        hdd.infoHddT();
        hdd.infoHddN();
        hdd.infoHddV();
        hdd.infoHddS();
        monitor.infoMonN();
        monitor.infoMonRx();
        monitor.infoMonRy();


}}
