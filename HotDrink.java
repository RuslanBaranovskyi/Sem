package ДЗ;

public class HotDrink {

    public HotDrink(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    private String name;

    private int volume;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    @Override
    public String toString(){
        return "Product{" + "name='" + name + '\'' + ", volume=" + volume +'}';
    }
}
