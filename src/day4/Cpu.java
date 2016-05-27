package day4;

/**
 * Created by ДОМ on 22.05.2016.
 */
public class Cpu {
    private double cpuFrequensy; //частота процессора
    private double cpuPerfomance; //производительность процессора
    private double cpuMultiplier; //множитель процессора


    public double getCpuFrequensy() {
        return cpuFrequensy;
    }

    public void setCpuFrequensy(double cpuFrequensy) {
        this.cpuFrequensy = cpuFrequensy;
    }

    public double getCpuPerfomance() {
        return cpuPerfomance;
    }

    public void setCpuPerfomance(double cpuPerfomance) {
        this.cpuPerfomance = cpuPerfomance;
    }

    public double getCpuMultiplier() {
        return cpuMultiplier;
    }

    public void setCpuMultiplier(double cpuMultiplier) {
        this.cpuMultiplier = cpuMultiplier;
    }
    public void infoCpuF(){
        A.ptintCpu("Частота процессора = "+ getCpuFrequensy()+ "ГГц");
    }
    public void infoCpuP(){
        A.ptintCpu("производительность процессора= "+getCpuPerfomance());
    }
    public void infoM(){
       A.ptintCpu("множитель процессора = " + getCpuMultiplier());
    }




}
