package day4;

/**
 * Created by ДОМ on 22.05.2016.
 */
public class Hdd {

    private double HddVolume;   //объём HDD
    private String HddTupe;     //тип жёсткого диска (HDD, SSD)
    private int HddSpeed;       //скорость вращения 5400 или 7200
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

    public void infoHddT() {
        A.printHdd("Тип жёсткого диска " + getHddTupe());
    }

    public void infoHddN() {
        A.printHdd("Брэнд производителя " + getHddName());
    }

    public void infoHddS()
    {
        if (getHddSpeed()!=0)
        A.printHdd("Скорость вращения " + getHddSpeed());
        else
            A.printHdd("Параметр скорость вращения не требуется");
        }


    public void infoHddV() {
        A.printHdd("Объём памяти " + getHddVolume() + " Мб");
    }
}
