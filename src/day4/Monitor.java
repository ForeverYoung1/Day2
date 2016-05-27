package day4;

import static day4.A.printMon;

/**
 * Created by ДОМ on 22.05.2016.
 */
public class Monitor {
    private int monResolutionX; //разрешение монитора по Х
    private int monResolutionY; //разрешение монитора по Y
    private String nameMonitor;  //название монитора

    public double getMonResolutionX() {
        return monResolutionX;
    }

    public void setMonResolutionX(int monResolutionX) {
        this.monResolutionX = monResolutionX;
    }


    public String getNameMonitor() {
        return nameMonitor;
    }

    public void setNameMonitor(String nameMonitor) {
        this.nameMonitor = nameMonitor;
    }

    public void infoMonN() {

        printMon("Брэнд монитора " + getNameMonitor());
    }

    public void infoMonRx() {
        printMon("Разрешение монитора по Х " + getMonResolutionX());
    }

    public int getMonResolutionY()
    {
        return monResolutionY;
    }

    public void setMonResolutionY(int monResolutionY) {
        this.monResolutionY = monResolutionY;
    }

    public void infoMonRy() {
        printMon("Разрешение монитора по У " + getMonResolutionY());

    }


}
