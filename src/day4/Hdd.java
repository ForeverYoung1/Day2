package day4;

/**
 * Created by ДОМ on 22.05.2016.
 */
public class Hdd {

    private double HddVolume;   //объём HDD
    private String HddTupe;     //тип жёсткого диска (HDD, SSD)
    private int HddSpeed;       //скорость вращения шпинделя
    private String HddName;     //название, производитель


    public double getHddVolume() {
        return HddVolume;
    }

    public void setHddVolume(double hddVolume) {
        HddVolume = hddVolume;
    }

    public String getHddTupe() {
        return HddTupe;
    }

    public void setHddTupe(String hddTupe) {
        HddTupe = hddTupe;
    }

    public int getHddSpeed() {
        return HddSpeed;
    }

    public void setHddSpeed(int hddSpeed) {
        HddSpeed = hddSpeed;
    }

    public String getHddName() {
        return HddName;
    }

    public void setHddName(String hddName) {
        HddName = hddName;
    }
    public void infoHddT(){
        System.out.println("Тип жёсткого диска "+getHddTupe());
    }
    public void infoHddN(){
        System.out.println("Брэнд производителя " +getHddName());
    }
    public void infoHddS(){
        System.out.println("Скорость вращения "+getHddSpeed());
    }
    public void infoHddV(){
        System.out.println("Объём памяти "+getHddVolume()+" Мб");
    }
}
