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
        A.printMain(" Введите последовательно частоту в формате хххе-х(3200е-3 например); производительность  в формате хххе-х(82е-1 например);  множитель");
        cpuf = scanner.nextDouble();
        cpup = scanner.nextDouble();
        cpum = scanner.nextDouble();

        cpu.setCpuFrequensy(cpuf);
        cpu.setCpuPerfomance(cpup);
        cpu.setCpuMultiplier(cpum);

        A.printMain(" Введите тип диска; скорость вращения шпинделя;  введите брэнд производителя;  объём памяти;  ");
        hddt = scanner.next();
        switch (hddt) {
            case "ssd":
            case "SSD":
                A.printMain("Выбран Тип SSD - введите значение скорости = 0; введите брэнд производителя;  объём памяти;");
                break;
            case "hdd":
            case "HDD":
                A.printMain("Выбран Тип HDD - введите значение скорости ; введите брэнд производителя;  объём памяти;");
                break;
        }


        hdds = scanner.nextInt();
        hddn = scanner.next();
        hddv = scanner.nextDouble();

        A.printMain("Введите название монитора;  Введите разрешение по горизонтали и по верт ");
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


    }
}
