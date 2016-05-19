package lesson2;

/**
 * Created by ДОМ on 19.05.2016.
 */
public class Ex1 {
    public double fCpu;              //частота процессора
    public String name;          // название
    public int mem;              //объём памяти

    public void infoname(){
        System.out.println("название компа  " +name);

    }
    public void infoCpu(){
        System.out.println("частота проца "+fCpu+" ГГц");
    }
    public void infoMem(){
        System.out.println("объём памяти "+mem+" Гб");
    }

}
