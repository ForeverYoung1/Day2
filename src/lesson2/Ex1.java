package lesson2;

public class Ex1 {
    private double fCpu;              //частота процессора
    private String name;          // название брэнда
    private int mem;              //объём памяти

    public double getfCpu() {
        return fCpu;
    }

    public void setfCpu(double fCpu) {
        this.fCpu = fCpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }


    public void infoname() {
        print("название компа  " + getName());

    }

    public void infoCpu() {
        print("частота проца " + getfCpu() + " ГГц");
    }

    public void infoMem() {
        print("объём памяти " + getMem() + " Гб");
    }

    private void print(String str) {
        System.out.println(str);
    }



}
